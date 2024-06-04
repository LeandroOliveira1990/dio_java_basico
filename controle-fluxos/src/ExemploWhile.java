import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
        double mesadaFinal = 0.0;
        while (mesada>0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                mesadaFinal = mesada;
                valorDoce = mesada;
            }

                System.out.println("Doce do valor: " + valorDoce + " foi adcionado no carrinho");
                mesada = mesada - valorDoce;

        }
            
            
            System.out.println("Mesada: R$" + mesadaFinal);
            System.out.println("Joãozinho gastou quase toda a sua mesada em doces");
            
        }


        

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

}