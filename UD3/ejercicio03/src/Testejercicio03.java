import org.junit.Assert;
import org.junit.Test;

public class Testejercicio03 {
    @Test
    public void TestcontarCaracteres (){
        Ejercicio03 ejercicio03 = new Ejercicio03();
        Assert.assertEquals(3,ejercicio03.contarCaracteres("Holaaa",'a'));
        Assert.assertEquals(1,ejercicio03.contarCaracteres("Holaaa",'o'));
    }
}
