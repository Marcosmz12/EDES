public class PagoConPayPal implements MetodoPago {
    private String correo;

    public PagoConPayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal de: " + monto);
    }
}
