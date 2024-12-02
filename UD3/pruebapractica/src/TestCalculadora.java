import org.junit.Assert;
import org.junit.Test;

public class TestCalculadora {
    CalculadoraAvanzada micalc = new CalculadoraAvanzada();
    @Test
    public void testpotencia() {

        Assert.assertEquals(8, micalc.potencia(2, 3));
        Assert.assertEquals(1, micalc.potencia(4, 0));
        Assert.assertEquals(-125, micalc.potencia(-5, 3));
    }

    public void tetsraizcuadrada() {
        CalculadoraAvanzada micalc = new CalculadoraAvanzada();

    }
}
