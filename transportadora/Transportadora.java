import java.util.Scanner;

public class Transportadora {

    public static double calcularValorFrete(
            Transporte transporte,
            double peso,
            double altura,
            double largura,
            double distancia) {

        return transporte.calcularFrete(
                peso, altura, largura, distancia);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== TRANSPORTADORA ===");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Avião");
        System.out.println("3 - Porta Container");

        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

        System.out.print("Distância: ");
        double distancia = sc.nextDouble();

        Transporte transporte;

        switch (opcao) {
            case 1:
                transporte = new Caminhao();
                break;
            case 2:
                transporte = new Aviao();
                break;
            case 3:
                transporte = new PortaContainer();
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        double frete = calcularValorFrete(
                transporte,
                peso,
                altura,
                largura,
                distancia);

        System.out.printf("\nFrete: R$ %.2f%n", frete);

        sc.close();
    }
}