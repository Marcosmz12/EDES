import org.junit.Assert;
import org.junit.Test;

public class Ejercicio04Test {
    @Test
    public void test() {
        int x = 0;
        Ejercicio04 service = new Ejercicio04();
        Assert.assertEquals(x, service.sumar(-8, +8)); 
        x = 3;
        Assert.assertNotEquals(x, service.sumar(4, 4));
        x = 24;
        Assert.assertEquals(x, service.restar(4, -20));
        x = -10;
        Assert.assertNotEquals(x, service.restar(-3, -7));
        x = 24;
        Assert.assertNotEquals(x, service.multiplicar(4, 7));
        x = 24;
        Assert.assertEquals(x, service.multiplicar(4, 6));
        Assert.assertNotEquals((float)x, service.dividir(-12, 2),0.001);
        x = 6;
        Assert.assertEquals((float)x, service.dividir(24, 4),0.001);

    }   
}
