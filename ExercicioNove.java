import java.util.Scanner;
public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver o reverso do mesmo:");
        int numero= scanner.nextInt();
        int[] resultado = reverso(numero, numero, numero, numero);
        System.out.println("O número invertido é igual a: " + resultado[0]+ resultado[1]+ resultado[2]);
        scanner.close();
    }
    public static int[] reverso(int numero ,int unidade ,int dezena ,int centena){
         unidade = numero %10;
         dezena = (numero % 100)/10;
         centena = numero/100;
         int[] resultado ={unidade, dezena,centena};
        return resultado;
    }

}
