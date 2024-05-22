import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner digite = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua altura: ");
        double altura = digite.nextDouble();
        
        System.out.print("Digite seu nome: : ");
        String nome = digite.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = digite.next();

        System.out.print("Digite sua idade: ");
        int idade = digite.nextInt();



        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");


    }
}
