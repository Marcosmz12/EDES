public class Ejercicio03 {
    public int contarCaracteres (String texto, char caracter){
        int contador = 0;

        for (int index = 0; index < texto.length(); index++) {
            if (texto.charAt(index) == caracter) {
                contador ++;
            }
        }
        return contador;
    }
}
