public class ServicioLogin {
    private RepositorioUsuario miRepositorio;

    public ServicioLogin(RepositorioUsuario miRepo) {
        miRepositorio = miRepo;
    }

    public boolean login(String nombre) {
        return miRepositorio.existeUsuario(nombre);
    }
}