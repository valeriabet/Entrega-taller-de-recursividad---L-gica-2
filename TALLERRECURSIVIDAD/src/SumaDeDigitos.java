import java.util.Scanner;
public class SumaDeDigitos {
    public static int suma (int n){
        if (n <= 0){
            return n; //caso base retornar el numero ingresado si es 0 o negativo
        }else{
            return n % 10 + suma(n / 10);  //Paso recursivo

        }
    }
    public static void main (String [] args) throws Exception{
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el número");
        int numero = scanner.nextInt();
        int suma = suma(numero);
        System.out.println("La suma de los digitos del numero es: " + suma);
        scanner.close();
    }

}
