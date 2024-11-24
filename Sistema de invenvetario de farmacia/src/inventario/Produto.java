package inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

    Scanner input = new Scanner(System.in);

    String nome;
    int quantidade;
    float preco;

    // Constructor
    public Produto (String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Methods
    public static void adicionarProduto(ArrayList<Produto> inventario, Scanner input){
        input.nextLine();
        System.out.println("ADICIONAR PRODUTO\n");
        System.out.println("Digite o nome do medicamento:");
        String nome = input.nextLine();
        System.out.println("Digite o preço do medicamento:");
        float preco = input.nextFloat();
        input.nextLine();

        // Adicionar novo produto ao inventário
        inventario.add(new Produto(nome, preco));
        System.out.println("Produto adicionado com sucesso!");
    }

    public static void removerProduto(ArrayList<Produto> inventario, Scanner input){
        input.nextLine();
        System.out.println("REMOÇÃO DE PRODUTO\n");
        System.out.println("Digite o nome do medicamento:");
        String nome = input.nextLine();
        boolean a = inventario.removeIf(produto -> nome.equalsIgnoreCase(produto.getNome()));
        if (a) System.out.println("Produto removido com sucesso!");
        else System.out.println("Produto inválido!");

    }
    public static void listarProdutos(ArrayList<Produto> inventario){
        for (Produto produto : inventario){
            System.out.println(produto.getNome() +" = "+ "R$"+produto.getPreco());
        }

    }

    public static void menu(){
        System.out.println("\n::::::::: SISTEMA DE INVENTÁRIO DE FARMÁCIA :::::::::"+
                "\n [1] ADICIONAR PRODUTO  \n [2] REMOVER PRODUTO \n [3] LISTAR PRODUTOS \n [0] Sair");
    }

}
