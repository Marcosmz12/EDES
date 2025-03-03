public interface Senializable<K> {
    public String serializar(K object);

    public K deserializar(String nombre);
}