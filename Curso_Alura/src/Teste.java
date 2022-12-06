public class Teste{

	public static void main(String[] args) {
		
//		Funcionario wanderlei = new Funcionario();
//		wanderlei.setNome("wanderlei");
//		wanderlei.setCpf("024806995-30");
//		wanderlei.setSalario(10000.00);
//		wanderlei.setTipo("vendedor");

		Gerente francisco = new Gerente();
		francisco.setNome("Francisco");
		francisco.setCpf("019089332-30");
		francisco.setSalario(20000.00);
		francisco.setTipo("gerente");
		
		System.out.println(francisco.getNome());
		System.out.println(francisco.getBonificacao());
		System.out.println(francisco.autentica(334));
	}
}