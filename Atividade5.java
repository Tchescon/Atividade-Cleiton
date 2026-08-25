import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        String nome ="";
        double horast = 0;
        double valorhora = 0;
        double salario = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Quantas horas você trabalha?");
        horast = sc.nextDouble();
        System.out.println("Quanto você recebe por hora trabalhada?");
        valorhora = sc.nextDouble();

        salario = horast * valorhora;

        System.out.println("Nome: " + nome);
        System.out.println("Salário Calculado: "+ salario);


    }
    }