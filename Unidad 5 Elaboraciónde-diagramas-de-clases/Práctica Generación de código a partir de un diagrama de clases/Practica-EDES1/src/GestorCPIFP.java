public class GestorCPIFP {
    public static void main(String[] args) throws Exception {
        if (args.length!=1) {
            System.out.println("");
        } else {
            CPIFP micentro = new CPIFP("Alan Turing", " C. Frederick Terman", 658564506 ,args[0]);
            micentro.añadirEstudiante(101, "Marcos");
        }            
    }
}