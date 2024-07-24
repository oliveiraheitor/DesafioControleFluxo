import java.util.Random;
import java.util.Scanner;

public class Contador {

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        Random random = new Random();
        
   
        int parametroUm = random.nextInt(50); 
        int parametroDois = random.nextInt(50) + parametroUm + 1;

        System.out.println("Valor aleatório do primeiro parâmetro: " + parametroUm);
        System.out.println("Valor aleatório do segundo parâmetro: " + parametroDois);
        
        try {

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {

            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
 
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
