public class CalculadoraAvanzada {
    public double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double radicando) {
        if (radicando < 0) {
            throw new IllegalArgumentException("No se puede clacular");
        }
        return Math.sqrt(radicando);
    }
}
