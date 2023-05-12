import java.util.Scanner;
public class ExercicioUm {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Digite o primeiro número: ");
	  int numeroUm = scanner.nextInt();
	  System.out.println("Digite o segundo número: ");
	  int numeroDois = scanner.nextInt();
	  scanner.close();
	  
	  mediaArit(numeroUm,  numeroDois);
	
  }
 
  
  public static void mediaArit(int numeroUm, int numeroDois) {
	  
	 
	  int resultado = (numeroUm + numeroDois) /2;
	  
	  System.out.println("O resultado é: "  + resultado);
  
  }
  
}