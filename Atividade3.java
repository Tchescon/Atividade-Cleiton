//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        String nome = "";
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual é a Nota 1?");
        nota1 = sc.nextDouble();
        System.out.println("Qual a Nota 2?");
        nota2 = sc.nextDouble();
        System.out.println("Qual a Nota 3?");
        nota3 = sc.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }

}
