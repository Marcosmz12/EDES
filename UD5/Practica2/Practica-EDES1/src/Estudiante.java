public class Estudiante {
    private String nombre;
    private int idEstudiante;

    public Estudiante(String nombre, int idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante:[" + "idEstudiante: " + idEstudiante + ", nombre: " + nombre + "]";
    }
}
