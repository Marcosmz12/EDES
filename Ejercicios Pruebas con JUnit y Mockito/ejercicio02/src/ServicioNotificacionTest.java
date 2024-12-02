import org.junit.Test;
import static org.mockito.Mockito.*;

public class ServicioNotificacionTest {
    @Test
    public void pruebaEnviarNotificaciones() {
        ProveedorNotificaciones miProve = mock(ProveedorNotificaciones.class);
        ServicioNotificacion miServ = new ServicioNotificacion(miProve);
        miServ.notificacion("Hola");
        verify(miProve).enviarNotificacion("Hola");
    }
}