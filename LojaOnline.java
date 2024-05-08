import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numItens;
        double precoItem, precoTotal = 0, desconto10 = 0, desconto20 = 0;

        System.out.println("Digite o número de itens que você está comprando: ");
        numItens = input.nextInt();

        if (numItens < 0) {
            System.out.println("Não pode inserir números menor que 0!");
        }

        double precoItemCliente[] = new double[numItens];

        for(int i = 0; i < precoItemCliente.length; i++){
            System.out.println("Digite o preço do " + (i + 1) + "° item: ");
            precoItem = input.nextDouble();

            precoItemCliente[i] = precoItem;
        }

        for(int i = 0; i < precoItemCliente.length; i++){
            precoTotal += precoItemCliente[i];
        }

        if (numItens == 0) {
            System.out.println("Não pode inserir o número 0!");
        }else if (precoTotal < 50) {
            System.out.println("Sem desconto!");
        }else if (precoTotal >= 100) {
            desconto20 = (precoTotal / 100) * 80;
            System.out.println("Desconto de 20%, o preço da sua compra foi para: " + desconto20);
        } else if (precoTotal >= 50) {
            desconto10 = (precoTotal / 100) * 90;
            System.out.println("Desconto de 10%, o preço da sua compra foi para: " + desconto10);
        }

        input.close();
    }
}
