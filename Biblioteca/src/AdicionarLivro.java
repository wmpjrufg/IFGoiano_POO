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
		publio8554274040.quantidade = 1;
		publio8554274040.usuario = 0;
		System.out.println("Livro: " + publio8554274040.nome);
		System.out.println("Quantidade: " + publio8554274040.quantidade);
		System.out.println("Usuário: " + publio8554274040.usuario);

		// Empréstimo de livro
		boolean o_emprestimo = publio8554274040.emprestimo(1);
		System.out.println("O empréstimo foi possível?: " + o_emprestimo);
		
		// Alocando o emprestimo do livro para um novo usuário
		int novo_usuario = publio8554274040.transfere(1, publio8554274040.usuario);
	}
}