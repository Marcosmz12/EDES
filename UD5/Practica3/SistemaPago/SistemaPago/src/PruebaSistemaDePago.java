public class PruebaSistemaDePago {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Teclado", 100.0);

        // Crear un usuario
        Usuario usuario = new Usuario("Juan", "Calle Falsa 123");

        // Crear un pedido
        Pedido pedido = new Pedido("PED001", usuario);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        // Usuario realiza el pedido
        usuario.realizarPedido(pedido);

        // Procesar pago con tarjeta
        MetodoPago metodoPago = new PagoConTarjeta("1234567890", "12/25");
        ProcesoDePago procesoDePago = new ProcesoDePago(metodoPago);
        procesoDePago.procesar(pedido);

        // Ver estado del pedido
        System.out.println("Estado del pedido: " + pedido.getEstado());
    }
}