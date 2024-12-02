public class ServicioNotificacion {
    private ProveedorNotificaciones miProveedor;
    
    public ServicioNotificacion (ProveedorNotificaciones miProvee){
        miProveedor = miProvee;
    }
    
    public void notificacion (String mensaje){
        miProveedor.enviarNotificacion(mensaje);
    }
}
