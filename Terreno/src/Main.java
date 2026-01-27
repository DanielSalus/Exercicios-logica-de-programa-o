import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("====TERRENO=====");

        Locale.setDefault(Locale.US);

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("DIgite a Largura do terreno : ");
        float largura = input.nextFloat();

        System.out.print("Digite o comprimento do terreno:");
        float comprimento = input.nextFloat();

        System.out.print("Digite o valor do metro quadrado do terreno:");
        float quadrado = input.nextFloat();

        //Operaçãoe matematicas

        float area = largura * comprimento;

        float valordoTerreno = comprimento * quadrado;

        //Saida de dados

        System.out.printf("Area do terreno: %.2f%n", area);
        System.out.printf("Valor terreno: %.2f%n", valordoTerreno);

        System.out.println("------------------------------");

        input.close();



    }
}