import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio02 {
    @Test 
    public void TestesPar(){
        Ejercicio02 ejercicio02 = new Ejercicio02();
        Assert.assertTrue(ejercicio02.esPar(8));
        Assert.assertFalse(ejercicio02.esPar(3));
    }
}
