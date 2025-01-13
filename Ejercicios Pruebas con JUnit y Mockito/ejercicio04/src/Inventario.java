public class Inventario {
    private RepositorioInventario repositorio;

    public Inventario(RepositorioInventario repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminarProducto(String producto) {
        repositorio.eliminarProducto(producto);
    }

    public boolean contieneProducto(String producto) {
        return repositorio.contieneProducto(producto);
    }
}
