import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===Troco===");

        //Entrada de dados
        System.out.println("Preço unitário do produto R$:");
        float preco = sc.nextFloat();

        System.out.println("Quantidade comprada:");
        int quantidade = sc.nextInt();

        System.out.println("Dinheiro recebido R$:");
        float dinheiroRecebido = sc.nextFloat();


        //Calculo do Troco
        float troco = dinheiroRecebido - (quantidade * preco);
        System.out.printf("TROCO R$ %.2f%n: " , troco);

        sc.close();



    }
}