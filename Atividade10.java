import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        String nome = "";
        double distanciaKm = 0;
        double consumMedioEmkml = 0;
        double precoLitro = 0;
        int quantidadeDePessoas = 0;
        double combustivelNecessario = 0;
        double custoDaViagem = 0;
        double custoPorPessoa = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do motorista? ");
        nome = sc.nextLine();
        System.out.println("Qual é a distância da viagem? ");
        distanciaKm = sc.nextDouble();
        System.out.println("Qual o consumo médio do veículo?");
        consumMedioEmkml = sc.nextDouble();
        System.out.println("Qual o preço do litro de combustível?");
        precoLitro = sc.nextDouble();
        System.out.println("Quantas pessoas irão participar da viagem?");
        quantidadeDePessoas = sc.nextInt();

        combustivelNecessario = distanciaKm / consumMedioEmkml;
        custoDaViagem = combustivelNecessario * precoLitro;
        custoPorPessoa = custoDaViagem / quantidadeDePessoas;

        System.out.println("Motorista: " + nome);
        System.out.println("Distância: " + distanciaKm);
        System.out.println("Litros necessários: " + combustivelNecessario);
        System.out.println("Custo estimado: " + custoDaViagem);
        System.out.println("Custo por pessoa: " + custoPorPessoa);

    }
    }
