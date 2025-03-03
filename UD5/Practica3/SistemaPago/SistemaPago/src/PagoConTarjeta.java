public class PagoConTarjeta implements MetodoPago {
    private String numeroTarjeta;
    private String fechaExpiracion;

    public PagoConTarjeta(String numeroTarjeta, String fechaExpiracion) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de: " + monto);
    }
}
