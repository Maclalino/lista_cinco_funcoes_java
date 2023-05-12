import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a taxa do Imposto:");
        double taxaImposto = scanner.nextDouble();
        System.out.println("Digite o custo do imposto:");
        double custo = scanner.nextDouble();
        double novoValor = somarImposto(taxaImposto, custo);
        System.out.println("O novo preço com a taxa é: " + novoValor);
        scanner.close();

    }
    public static double somarImposto(double taxaImposto, double custo){
        taxaImposto =(taxaImposto/100);
        double novoValor=  (taxaImposto*custo)+custo;
        return novoValor;
    }
}
