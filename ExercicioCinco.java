import java.util.Scanner;
public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

    for (int i = 1;i <= numero; i++){                                   
         for(int j = 1; j <= i; j++){
               System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

    
