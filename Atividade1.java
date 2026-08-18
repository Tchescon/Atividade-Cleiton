//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args)  {

    //Inicialização de Variáveis
        String nome = "";
        String curso = "";
        int periodo = 0;
        int idade = 0;

        //Scanner é um objeto
        //sc é o nome do objeto
        // new instancia cria um objeto
        // new Scanner indica o tipo do objeto criado
        // (System.in) é um parâmetro
        // lembrar do IMPORT
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual é o seu Curso?");
        curso = sc.nextLine();

        System.out.println("Qual é o seu período?");
        periodo = sc.nextInt();

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        System.out.println("O nome é: " + nome);
        System.out.println("O curso é: " + curso);
        System.out.println("O período é: " + periodo);
        System.out.println("A idade é: " + idade);

        }
    }
