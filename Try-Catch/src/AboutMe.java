import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe{
    public static void main(String[] args) {
        try{
        // Criando o objeto Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Recebendo os dados do usuário
        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        // Imprimindo os dados recebidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
        sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}