public class SerieFibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); //Paso recursivo
    }

    public static void main(String[] args) {
        int resultado = fibonacci(6); 
        System.out.println("El enesimo numero de la serie fibonacci es: " + resultado);
    }
}
