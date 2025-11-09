
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DriveNow - Sistema de Locação de Veículos ===");

        System.out.println("Escolha o tipo de veículo: \n 1. Carro \n 2. Moto \n 3. Caminhão");

        int escolha = sc.nextInt();
        sc.nextLine();

        Veiculo veiculo = null;

        switch (escolha) {

            case 1:
                Carro carro = new Carro();
                System.out.println("Digite a marca do carro: ");
                carro.setMarca(sc.nextLine());
                System.out.println("Digite o modelo do carro: ");
                carro.setModelo(sc.nextLine());
                System.out.println("Digite o ano do carro: ");
                carro.setAno(sc.nextInt());
                System.out.println("Digite a quantidade de portas do carro: ");
                carro.setQuantidadeDePortas(sc.nextInt());
                veiculo = carro;
                break;
            case 2:
                Moto moto = new Moto();
                System.out.println("Digite a marca da moto: ");
                moto.setMarca(sc.nextLine());
                System.out.println("Digite o modelo da moto: ");
                moto.setModelo(sc.nextLine());
                System.out.println("Digite o ano da moto: ");
                moto.setAno(sc.nextInt());
                System.out.println("Digite a cilindrada da moto (em cc): ");
                moto.setCilindrada(sc.nextFloat());
                veiculo = moto;
                break;
            case 3:
                Caminhao caminhao = new Caminhao();
                System.out.println("Digite a marca do caminhão: ");
                caminhao.setMarca(sc.nextLine());
                System.out.println("Digite o modelo do caminhão: ");
                caminhao.setModelo(sc.nextLine());
                System.out.println("Digite o ano do caminhão: ");
                caminhao.setAno(sc.nextInt());
                System.out.println("Digite a capacidade de carga do caminhão (em toneladas): ");
                caminhao.setCapacidadeDeCarga(sc.nextDouble());
                veiculo = caminhao;
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("\n=== Quantos dias de locação? ===");
        int dias = sc.nextInt();

        double valorTotal = veiculo.calcularValorLocacao() * dias;

        System.out.println("\n=== Resumo da Locação ===");
        System.out.println(veiculo.exibirDados());
        System.out.println("Dias: " + dias + "\nValor Total da Locaçao por: R$" + valorTotal );

    }
}
