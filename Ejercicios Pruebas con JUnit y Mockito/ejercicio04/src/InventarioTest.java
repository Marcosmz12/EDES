import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


public class InventarioTest {
    @Test
    public void testEliminarProducto() {

        RepositorioInventario repositorioMock = mock(RepositorioInventario.class);

        Inventario inventario = new Inventario(repositorioMock);

        when(repositorioMock.contieneProducto("ProductoA")).thenReturn(true);

        inventario.eliminarProducto("ProductoA");

        verify(repositorioMock).eliminarProducto("ProductoA");

        when(repositorioMock.contieneProducto("ProductoA")).thenReturn(false);

        assertFalse(inventario.contieneProducto("ProductoA"));
    }
}
