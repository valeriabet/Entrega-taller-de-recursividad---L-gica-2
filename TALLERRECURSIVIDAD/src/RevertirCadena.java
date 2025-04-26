public class RevertirCadena {
    public static void Revertir (String cadena){
        String cadenaRevertida =  new StringBuilder(cadena).reverse().toString();
        System.out.println("La cadena revertida es: " + cadenaRevertida);
    }
    public static void main(String[] args) {
        Revertir("hola");
    }
}
