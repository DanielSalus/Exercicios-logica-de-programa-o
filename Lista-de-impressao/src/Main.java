import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();


        System.out.println("How many names will you register:??");
        int qtdNames = sc.nextInt();

        
        for (int i = 1; i <= qtdNames; i++) {
            System.out.println("register name:");
            String value = sc.next();
            ps.addValue(value);
        }


        System.out.println("first:"+ps.primeiro());
        ps.print();



    }
}