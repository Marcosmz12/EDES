public class GestorCPIFP {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Error: Debes introducir un argumento con el nombre del centro.");
        } else {
            CPIFP micentro = new CPIFP("Alan Turing", " C. Frederick Terman", 658564506, args[0]);
            int opcion;
            do {
                System.out.println("Gestor de CPIFP");
                System.out.println("1. Añadir estudiante");
                System.out.println("2. Borrar estudiante");
                System.out.println("3. Modificar estudiante");
                System.out.println("4. Obtener estudiante");
                System.out.println("5. Mostrar todos los estudiantes");
                System.out.println("6. Salir");
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre del estudiante: ");
                        String nombre = System.console().readLine();
                        System.out.println("Introduce el id del estudiante: ");
                        int id = Integer.parseInt(System.console().readLine());
                        micentro.añadirEstudiante(id, nombre);
                        break;
                    case 2:
                        System.out.println("Introduce el id del estudiante a borrar: ");
                        int idBorrar = Integer.parseInt(System.console().readLine());
                        micentro.borrarEstudiante(idBorrar);
                        break;
                    case 3:
                        System.out.println("Introduce el id del estudiante a modificar: ");
                        int idModificar = Integer.parseInt(System.console().readLine());
                        System.out.println("Introduce el nuevo nombre del estudiante: ");
                        String nombreModificar = System.console().readLine();
                        micentro.modificarEstudiante(idModificar, nombreModificar);
                        break;
                    case 4:
                        System.out.println("Introduce el id del estudiante que quieras ver sus datos: ");
                        int idEstudiante = Integer.parseInt(System.console().readLine());
                        micentro.obtenerEstudiante(idEstudiante);
                        break;
                    case 5:
                        micentro.mostrarEstudiantes();
                        break;
                    default:
                        break;
                }
            } while (opcion != 6);
        }
    }
}