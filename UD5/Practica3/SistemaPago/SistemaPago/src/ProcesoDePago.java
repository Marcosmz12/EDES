public class ProcesoDePago {    
    // ¿Asociación / Dependencia / Agregación / Composición?: El ProcesoDePago tiene un objeto MetodoPago, ¿un método de pago puede existir sin un proceso de pago)
    private MetodoPago metodoPago;  

    public ProcesoDePago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
     
    // Un ProcesoDePago depende de un Pedido para poder realizar esta operación
    public void procesar(Pedido pedido) {
        double monto = pedido.calcularTotal();
        metodoPago.procesarPago(monto);
        pedido.realizarPago();
    }
}
