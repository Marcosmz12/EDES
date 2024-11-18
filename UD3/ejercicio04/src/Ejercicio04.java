public class Ejercicio04 {
    
    public int sumar (int numeroa, int numerob) {
        return (numeroa + numerob);
    }

    public int restar(int numeroa, int numerob){
        return (numeroa - numerob);
    }

    public int multiplicar(int numeroa, int numerob) {
        return (numeroa * numerob);
    }

    public float dividir(int numeroa, int numerob) {
        if(numerob == 0)throw new ArithmeticException("No se debe dividir por 0");
        return ((float)numeroa / (float)numerob);
    }
}