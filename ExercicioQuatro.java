import java.util.Scanner;
public class ExercicioQuatro{
    public static void main(String[] args) {
        System.out.println("Programa para calccular a Média Aritmética, Média Harmônica e Média Geométrica:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numeroUm = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numeroDois = scanner.nextDouble();
        System.out.println("Digite o terceiro número:");
        double numeroTres = scanner.nextDouble();
        scanner.close();
        
        double valormediaAritmetica = calcularMediaAritmetica(numeroUm, numeroDois, numeroTres);
        double valormediaHarmonica = calcularMediaHarmonica(numeroUm, numeroDois, numeroTres);
        double valormediaGeometrica = calcularmediaGeometrica(numeroUm, numeroDois, numeroTres);

        System.out.printf("A média aritmética é %.2f: " , valormediaAritmetica);
        System.out.printf("A média Harmônica é %.2f: " , valormediaHarmonica);
        System.out.printf("A média Geométrica é %.2f: " , valormediaGeometrica );
    }
    public static double calcularMediaAritmetica(double numeroUm, double numeroDois, double numeroTres){
        double valorMediaAritmetica = (numeroUm+numeroDois+numeroTres)/3;
        return valorMediaAritmetica;
    }
    public static double calcularMediaHarmonica(double numeroUm, double numeroDois, double numeroTres){
        double valormediaHarmonica = 3/ ((1/numeroUm) + (1/numeroDois) + (1/numeroTres));
        return valormediaHarmonica;
    }
    public static double calcularmediaGeometrica (double numeroUm, double numeroDois, double numeroTres){
        double valormediaGeometrica = Math.cbrt(numeroUm * numeroDois * numeroTres);
        return valormediaGeometrica;
    }
}