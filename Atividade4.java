import java.util.Scanner;

    public class Atividade4 {
        public static void main(String[] args) {

            String nome = "";
            int anon = 0;
            int anoa = 0;
            int idade= 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Qual o seu nome?");
            nome = sc.nextLine();
            System.out.println("Qual o ano em que você nasceu?");
            anoa = sc.nextInt();
            System.out.println("Qual o  ano atual?");
            anon = sc.nextInt();

            idade = anon - anoa;

            System.out.println(nome + " possui aproximadamente " + idade + " anos.");

        }
        }

