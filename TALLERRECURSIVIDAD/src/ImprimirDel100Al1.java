public class ImprimirDel100Al1 {
    public static void imprimir (int n){
        if (n <= 0){ //Caso base detener cuando sea menos que 0
            return;
        }
        System.out.println(n); //imprimir el numero actual
        imprimir(n - 1);
    }
    public static void main(String[] args) {
        imprimir(100); //lamada inicial desde 100
    }
}
