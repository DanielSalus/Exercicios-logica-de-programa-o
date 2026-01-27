import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=====Retangulo======");

        Locale.setDefault(Locale.US);

        //Declarando as variaveis
        Scanner sc = new Scanner(System.in);
        double base, altura;
        double area, perimetro, diagonal;

        //Entrada de dados
        System.out.println("Digite o base do retangulo: ");
        base = sc.nextDouble();

        System.out.println("Digite o altura do retangulo: ");
        altura = sc.nextDouble();

        //Cálculos
        area = base * altura;
        perimetro =  2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        // Saída de dados

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

         sc.close();



    }
}