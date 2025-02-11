import java.util.Scanner;

public class GestorCPIFP {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        if (args.length != 1) {
            System.out.println("");
        } else {
            CPIFP micentro = new CPIFP("Alan Turing", " C. Frederick Terman", 658564506, args[0]);
            micentro.añadirEstudiante(102, "Pepe");
            micentro.añadirEstudiante(103, "Paco");
            micentro.mostrarEstudiantes();
        }
    }
}