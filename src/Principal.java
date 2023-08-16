import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double[] vcafe = { 7.50, 4.30, 10.00 };
        double[] vcomple = { 5.00, 8.00, 2.00 };

        Cafe pedido;
        double precoCafe = 0;
        double precoComple = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o código do tipo de café (0: Americano/ 1: Expresso/ 2: Sem Cafeína)");

        int tipoc = ent.nextInt();

        if (tipoc == 0) {
            pedido = new Cafe("Americano");
            precoCafe = vcafe[0];
        } else if (tipoc == 1) {
            pedido = new Cafe("Expresso");
            precoCafe = vcafe[1];
        } else {
            pedido = new Cafe("Sem Cafeína");
            precoCafe = vcafe[2];
        }

        System.out.println("Deseja adicionar algum complemento? (0: não ou 1: sim)");
        int aux = ent.nextInt();
        while (aux != 0) {
            System.out.printf("Insira o códigodo %dº complemento desejado (0: leite, 1: chocolate, 2: canela)\n",
                    (pedido.getQuantComplemento() + 1));
            aux = ent.nextInt();
            pedido.addComplemento(aux);
            precoComple += vcomple[aux];
            System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim)");
            aux = ent.nextInt();
        }

        System.out.println("############### NOTA FISCAL ###############");
        System.out.printf("Café: %s\n", pedido.getTipo());
        System.out.printf("Preço do café = %.2f\n", precoCafe);
        System.out.printf("Preço dos Complementos: %.2f\n", precoComple);
        System.out.printf("Total: %.2f\n", (precoCafe + precoComple));

    }
}