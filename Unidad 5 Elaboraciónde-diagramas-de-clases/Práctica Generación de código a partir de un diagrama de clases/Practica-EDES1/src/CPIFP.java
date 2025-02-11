import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CPIFP implements Senializable {
    private String nombre;
    private String direccion;
    private int telefono;
    private String nombreFichero;

    public CPIFP(String nombre, String direccion, int telefono, String nombreFichero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreFichero = nombreFichero;
    }

    public boolean añadirEstudiante(int idEstudiante, String nombre){
        try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nombreFichero, true));
                String estudiante = serializar(new Estudiante(nombre, idEstudiante));
                bufferedWriter.write(estudiante + "\n");
                bufferedWriter.close();
                System.out.println("Estudiante añadido");
                return(true);            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return(false);
        }
    }

    public boolean borrarEstudiante(int idEstudiante) {
        boolean borrar = false;
        try {
            String linea = "";
            File ficheroOriginal = new File(nombreFichero);
            File ficheroTemporal = new File(nombreFichero + ".tmp");
            ficheroOriginal.renameTo(ficheroTemporal);
            BufferedReader bReader = new BufferedReader(new FileReader(ficheroOriginal + ".tmp"));
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(ficheroTemporal));
            while ((linea = bReader.readLine()) != null) {
                if (deserializar(linea).equals(idEstudiante)) {
                    borrar = true;
                } else {
                    bWriter.write(linea + "\n");
                }
                bReader.close();
                bWriter.close();
                if (borrar) {
                    ficheroTemporal.delete();
                    ficheroOriginal.renameTo(ficheroTemporal);
                } else {
                    ficheroTemporal.delete();
                    
                }
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return borrar;
    }
    
    public String mostrarEstudiantes() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreFichero));
            String linea = "";
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(deserializar(linea));
            }
            bufferedReader.close();
            return linea;
        } catch (IOException e) {
            return(e.getMessage());
        }
    }

    @Override
    public String serializar(Object object) {
        return (((Estudiante) object).getNombre() + ";" + ((Estudiante) object).getIdEstudiante());
    }

    @Override
    public Object deserializar(String nombre) {
        String datos[] = nombre.split(";");
        return (new Estudiante(datos[0], Integer.parseInt(datos[1])));
    }

}
