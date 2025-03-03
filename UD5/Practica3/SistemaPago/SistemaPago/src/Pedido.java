import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private String id;
    private Usuario usuario; // Relación de asociación con Usuario
     
    // Relación de ¿agregación / composición / asociación? con Producto
    // ¿Tiene sentido una instancia de Producto si no está asociado a un Pedido?
    private List<Producto> productos; 

    private EstadoPedido estado;

    public Pedido(String id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado.");
        estado = EstadoPedido.CONFIRMADO;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago de: " + calcularTotal());
        estado = EstadoPedido.PAGADO;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public int numeroDeProductos() {
        return productos.size();
    }
}
