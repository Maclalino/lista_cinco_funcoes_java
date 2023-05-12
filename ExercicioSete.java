import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seu argumento(número) é:");
        int numero = scanner.nextInt();
        boolean resultado = verificar(numero);
        char caractereResultado = resultado ? 'P' : 'N';
        System.out.println("O resultado para o número (P positivo, N negativo) " + numero + " é " + caractereResultado);
        scanner.close();

    }
    public static boolean verificar(int num){
        return num >0;
    }
}
