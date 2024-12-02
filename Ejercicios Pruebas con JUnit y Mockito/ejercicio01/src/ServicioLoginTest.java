import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServicioLoginTest {
    @Test
    public void pruebaUsuarioExistente() {
        RepositorioUsuario miRepo = mock(RepositorioUsuario.class);
        when(miRepo.existeUsuario("Pepe")).thenReturn(true);

        ServicioLogin miServ = new ServicioLogin(miRepo);
        Assert.assertTrue(miServ.login("Pepe"));
    }

}
