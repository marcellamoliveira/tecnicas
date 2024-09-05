import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ImpostoTaxa taxa = new ImpostoTaxa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();
        System.out.println("Escolha a opção de imposto: ");
        System.out.println("1 - Imposto Alto (30%)");
        System.out.println("2 - Imposto Médio (10%)");
        System.out.println("3 - Isento de Imposto (0%)");

        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                taxa.setStrategy(new GrandeTaxa());
                break;
            case 2:
                taxa.setStrategy(new MediaTaxa());
                break;
            case 3:
                taxa.setStrategy(new ZeroTaxa());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double imp = taxa.executeStrategy(valor);
        System.out.println("O valor do imposto: " + imp);
    }
}
