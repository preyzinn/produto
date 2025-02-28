import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a descrição do produto: ");
		String descricao = scanner.nextLine();
		System.out.println("Digite o preço do produto: ");
		double preco = scanner.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		int quantidade = scanner.nextInt();
		scanner.close();

		Produto produto = new Produto(preco, nome, descricao, quantidade);
		System.out.println("Produto cadastrado com sucesso!");
		System.out.println("Nome: " + produto.nome);
		System.out.println("Descrição: " + produto.descricao);
		System.out.println("Preço: " + produto.preco);
		System.out.println("Quantidade: " + produto.quantidade);
		
	}
}
