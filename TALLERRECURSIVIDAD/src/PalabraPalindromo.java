public class PalabraPalindromo {
    public static void verificar (String palabra){
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        if(!palabraInvertida.equals(palabra)){
            return; //Caso base detener cuando la palabra no sea un palindromo
        }else{
            boolean palindromo = true;
            System.out.println("La palabra sin invertir es: " + palabra); //imprimir la palabra sin invertir
            System.out.println("La palabra invertida es: " + palabraInvertida); //imprimir la palabra invertida
            System.out.println("¿La palabra es un palíndromo? " + palindromo); //imprimir true si la palabra es un palindromo
        }
    }
    public static void main(String[] args) throws Exception {
        verificar("reconocer");
    }
}
