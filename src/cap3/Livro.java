package cap3;

public class Livro {
	
	String nome;
	String descricao;
	String isbn;
	double valor;
	Autor autor;
	
	void mostrarDetalhes () {
		
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		autor.mostrarDetalhes();
		System.out.println("--");
		
	}
}
