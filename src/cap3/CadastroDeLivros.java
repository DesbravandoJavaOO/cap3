package cap3;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		Autor autor = new Autor();
		
		autor.cpf = "123.456.789-10";
		autor.email = "abc@github.com";
		autor.nome = "Lucas Freitas";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();
	}
	
}
