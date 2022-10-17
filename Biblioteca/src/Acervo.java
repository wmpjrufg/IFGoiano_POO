class Acervo {
	String nome = "null";
	int ano = 0;
	String editora = "null";
	String area = "null";
	String autor = "null";
	String isbn = "null";
	int quantidade = 0;

	void deposita(int quantidade_add) {
		this.quantidade = this.quantidade + quantidade_add;
	}

	boolean emprestimo(int numero_emprestimo) {
		if (this.quantidade >= numero_emprestimo) {
			this.quantidade = this.quantidade - numero_emprestimo;
			return true;
		} else {
			return false;
		}
	}
}