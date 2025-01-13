public class SistemaOrdenes {
    private ProveedorDescuentos proveedorDescuentos;

    public SistemaOrdenes(ProveedorDescuentos proveedorDescuentos) {
        this.proveedorDescuentos = proveedorDescuentos;
    }

    public double calcularTotal(double total) {
        double descuento = proveedorDescuentos.obtenerDescuento(total);
        return total - descuento;
    }
}