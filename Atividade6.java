import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        String nome = "";
        double comprimentoTerrenoM = 0;
        double larguraTerrenoM = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual o comprimento do terreno?");
        comprimentoTerrenoM = sc.nextDouble();
        System.out.println("Qual a largura do terreno?");
        larguraTerrenoM = sc.nextDouble();

        area = comprimentoTerrenoM * larguraTerrenoM;

        System.out.println("Senhor(a)," + nome + " o comprimento do seu terreno é de " + area + " metros quadrados.");








    }
}