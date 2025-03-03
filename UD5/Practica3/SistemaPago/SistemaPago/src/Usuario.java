import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private List<Pedido> pedidos;  // Un usuario tiene muchos pedidos (asociación)

    public Usuario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido.numeroDeProductos() > 0)
            pedidos.add(pedido);
        else System.out.println("El pedido está vacío y no se almacenará.");
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Dependencia: Usuario depende de un Pedido para poder realizar esta operación
    public void realizarPedido(Pedido pedido) {
        agregarPedido(pedido);
        if (pedido.numeroDeProductos() > 0) pedido.confirmarPedido();
    }
}
