public class ContarCaracteres {
    public static int Contar(String cadena, char resultado, int indice){
        if (indice >= cadena.length()){
            return 0;
        }
        int contador = (cadena.charAt(indice) == resultado) ? 1 : 0;
        return contador + Contar(cadena, resultado, indice + 1);
    }
    public static void main(String[] args) {
        String palabra = "programacion";
        char letras = 'o';
        int respuesta = Contar(palabra, letras, 0);
        System.out.println("La letra 'o' aparece " + respuesta + " veces en la palabra " + palabra);
    }
}
