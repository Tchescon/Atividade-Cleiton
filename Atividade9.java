import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        double valorc = 0;
        double valortx = 0;
        int quantidadep = 0;
        double total = 0;
        double valorQueCadaPessoaPaga = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor dos produtos consumidos na pizzaria?");
        valorc = sc.nextDouble();
        System.out.println("Qual é o valor da taxa de serviço?");
        valortx = sc.nextDouble();
        System.out.println("Quantas pessoas foram à pizzaria?");
        quantidadep = sc.nextInt();

        total = valorc + valortx;
        valorQueCadaPessoaPaga = total/quantidadep;

        System.out.println("Valor do cosumo: " + valorc);
        System.out.println("Taxa de serviço: " + valortx);
        System.out.println("Valor total: " + total);
        System.out.println("Valor que cada pessoa deverá pagar: " + valorQueCadaPessoaPaga);

    }
}