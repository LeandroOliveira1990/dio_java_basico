import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        } while (tocando());
        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        if (atendeu) {
            System.out.println("Atendeu");
            
        } else {
            System.out.println("prim, prim, prim... ");
            
        }
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
