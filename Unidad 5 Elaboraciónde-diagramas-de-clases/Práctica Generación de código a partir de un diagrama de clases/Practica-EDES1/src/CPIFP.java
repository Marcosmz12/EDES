import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CPIFP implements Senializable{
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
            return(true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return(false);
        }
    }

    public boolean borrarEstudiante(int idEstudiante){
        
    }

    @Override
    public String serializar(Object object) {
        return (((Estudiante) object).getNombre() + ";" + ((Estudiante)object).getIdEstudiante());
    }

    @Override
    public Object deserializar(String nombre) {
        String datos[] = nombre.split(";");
        return (new Estudiante(datos[0], Integer.parseInt(datos[1])));
    }



}
