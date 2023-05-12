import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite  a temperatura em F:");
        double temperatura = scanner.nextDouble();
        double temperaturaCelsius = calcularTemperatura(temperatura);
        System.out.printf("A temperatura em Celsius é %.2f " , temperaturaCelsius);
        scanner.close();
    }
    public static double calcularTemperatura(double temperatura){
        
        return (temperatura - 32) /1.8;
    }
}
        

