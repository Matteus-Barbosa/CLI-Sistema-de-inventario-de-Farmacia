package inventario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 To do
// Aprender uma forma de deixar o ArrayList vazio como default e usar ainda conseguir usar os métodos da classe produto (deixando isso para o usuário);
// Escalar para permanencia de dados com JSON;
 **/
public class Inventario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        ArrayList<Produto> inventario = new ArrayList<Produto>();

        // Produtos Base:
        inventario.add(new Produto("Paracetamol 500mg", 10.00f));
        inventario.add(new Produto("Ibuprofeno 400mg", 15.00f));
        inventario.add(new Produto("Omeprazol 20mg", 25.00f));
        inventario.add(new Produto("Amoxicilina 500mg", 45.00f));
        inventario.add(new Produto("Losartana Potássica 50mg", 30.00f));


        do {
            Produto.menu();
            int menu = input.nextInt();

            switch (menu)  {
                case 1:
                    Produto.adicionarProduto(inventario, input);
                    break;
                case 2:
                    Produto.removerProduto(inventario, input);
                    break;
                case 3:
                    Produto.listarProdutos(inventario);
                    break;
                case 0:
                    System.out.println("Fim do Programa.");
                    condition = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        } while (condition);

        input.close();
    }
}
