public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String tipo;
		
	public double getBonificacao() {		
		
		if(this.tipo == "gerente") {
			return this.salario * 0.10;
		} else if(this.tipo == "vendedor"){
			return this.salario * 0.20;
		} else {
			return this.salario + 1000.0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}
