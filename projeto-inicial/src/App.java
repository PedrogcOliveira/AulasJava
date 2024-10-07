import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();


        //Imprimindo os dados inseridos pelo usuário

        System.out.println("Meu nome é: " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "Cm.");

        // String nome = args [0];
        // String sobreNome = args [1];
        // int idade = Integer.valueOf(args [2]);
        // double altura = Double.valueOf(args [3]);


    }
}
