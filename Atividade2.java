
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        int primeiroValor = 0;
        int segundoValor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Primeiro Valor: ");
        primeiroValor = sc.nextInt();

        System.out.println("Informe o Segundo Valor: ");
        segundoValor = sc.nextInt();

        int soma = primeiroValor + segundoValor;
        double divisao = primeiroValor / segundoValor;
        int subtracao = primeiroValor - segundoValor;
        int multiplicacao = primeiroValor * segundoValor;

        System.out.println("Soma :" + soma);
        System.out.println("Divisão :" + divisao);
        System.out.println("Subtração :" + subtracao);
        System.out.println("Multiplicação :" + multiplicacao);


    }
    }