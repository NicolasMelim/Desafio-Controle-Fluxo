package Desafio_Fluxo;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try{
            contador(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contador(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
        int contagem = Math.abs(parametroUm - parametroDois);
        for(int conta = 0; conta <= contagem; conta++){
            System.out.println("O resultado é " + conta);
        }
    }
}
