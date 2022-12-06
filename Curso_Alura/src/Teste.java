public class Teste{

	public static void main(String[] args) {
		
		Funcionario wanderlei = new Funcionario();
		wanderlei.setNome("wanderlei");
		wanderlei.setCpf("024806995-30");
		wanderlei.setSalario(10000.00);
		wanderlei.setTipo("vendedor");

		System.out.println(wanderlei.getNome());
		System.out.println(wanderlei.getBonificacao());
	}
}
