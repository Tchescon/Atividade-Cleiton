import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        String nome = "";
        double distanciakm = 0;
        double litros = 0;
        double consumo = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual a distância percorrida em quilômetros?");
        distanciakm = sc.nextDouble();
        System.out.println("Quantos litros foram gastos?");
        litros = sc.nextDouble();

        consumo = distanciakm / litros;

        System.out.println("O consumo médio do carro é de: " + consumo);

    }
}