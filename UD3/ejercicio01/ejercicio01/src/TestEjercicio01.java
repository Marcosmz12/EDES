import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio01 {
    @Test
    public void testesPositivo() {
        Ejercicio01 ejercicio01 = new Ejercicio01();
        Assert.assertTrue(ejercicio01.esPositivo (25));
        Assert.assertFalse(ejercicio01.esPositivo(-3));
    }
}
