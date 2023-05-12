import java.util.Scanner;
public class ExercicioDois {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do produto:");
        double preco = scanner.nextDouble();
        double acrescimo = calcularAcrescimo(preco);
        double novoPreco = preco + acrescimo;
        System.out.println("Novo valor é: " + novoPreco);
        scanner.close();
    }
    public static double calcularAcrescimo(double preco){
        return preco *0.1;
    }


}

