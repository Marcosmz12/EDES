import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SistemaOrdenesTest {
    @Test
    public void testCalcularTotal() {

        ProveedorDescuentos proveedorMock = mock(ProveedorDescuentos.class);

        when(proveedorMock.obtenerDescuento(1000.0)).thenReturn(100.0);

        SistemaOrdenes sistema = new SistemaOrdenes(proveedorMock);

        double total = sistema.calcularTotal(1000.0);

        assertEquals(900.0, total, 0.001);
    }
}
