import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("===LEITOR DE ARQUIVOS===");
        System.out.println("------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o diretorio do arquivo: ");
        String  diretorio = sc.nextLine();
        System.out.println("-------------------------------- : ");

        try(BufferedReader br = new BufferedReader(new FileReader(diretorio))) {
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}