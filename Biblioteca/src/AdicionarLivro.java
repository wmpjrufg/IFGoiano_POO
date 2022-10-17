public class AdicionarLivro {
	public static void main(String[] args) {
		// Instanciando o primeio livro
		Acervo publio8554274040 = new Acervo();
		publio8554274040.nome = "Pisos Industriais Com Concreto De Retração Compensada";
		publio8554274040.ano = 2019;
		publio8554274040.editora = "J.J. Carol";
		publio8554274040.area = "Engenharia Civil";
		publio8554274040.autor = "Públio Penna Firme Rodrigues";
		publio8554274040.isbn = "8554274040";
		publio8554274040.quantidade = 10;
		System.out.println("Livro: " + publio8554274040.nome);
		System.out.println("Quantidade: " + publio8554274040.quantidade);

		
		// Nova quantidade de livros usando método
		publio8554274040.deposita(30);
		System.out.println("Nova quantidade de livros: " + publio8554274040.quantidade);
		System.out.println();

		// Empréstimo de livro
		boolean o_emprestimo = publio8554274040.emprestimo(50);
		System.out.println("O empréstimo foi possível?: " + o_emprestimo);
	}
}