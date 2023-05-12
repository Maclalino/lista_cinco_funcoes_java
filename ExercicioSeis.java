import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe três números para realizar a soma:");
        System.out.println("Primeiro número:");
        int numeroUm = scanner.nextInt();
        System.out.println("Segundo número:");
        int numeroDois = scanner.nextInt();
        System.out.println("Primeiro número:");
        int numeroTres = scanner.nextInt();
        int soma = somarNumero(numeroUm, numeroDois, numeroTres);
        System.out.println("A soma dos números é:" + soma);
        scanner.close();

    }
    public static int somarNumero(int numeroUm, int numeroDois, int numeroTres){
        int soma = numeroUm + numeroDois + numeroTres;
        return soma;

    }
}
