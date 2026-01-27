import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=====Média de Idade===== ");
        System.out.println("-------------------------");

        //Entrada de dados
        System.out.println("Dados da Primeira pessoa");
        System.out.println("Digite o seu Nome:");
        String nome1 = sc.nextLine();
        System.out.println("Digite o seu Idade:");
        int idade1 = sc.nextInt();

        System.out.println("---------------------------");

        System.out.println("Dados da Segunda pessoa");
        System.out.println("Digite o seu Nome:");
        String nome2 = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite a sua idade:");
        int idade2 = sc.nextInt();

        //Calculo da média de idade
        double media = (double) (idade1 + idade2) /2;

        System.out.println("A meida de "+ nome1+ "e "+ nome2+ "é de ");
        System.out.printf("Media: %.1f%n",media);
        sc.close();




    }
}