package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto product = new Produto();
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		product.nome = sc.nextLine();
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.print("Informe o número de produtos a serem adicionados no estoque: ");
		int quantity = sc.nextInt();
		product.addProduto(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		System.out.print("Informe o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProduto(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		sc.close();
	}
}
