public class Teste{

	public static void main(String[] args) {
		
		Gerente francisco = new Gerente();
		francisco.setNome("Francisco");
		francisco.setCpf("019089332-30");
		francisco.setSalario(20000.00);
		francisco.setTipo("gerente");
		
		System.out.println(francisco.getNome());
		System.out.println(francisco.autentica(334));
		System.out.println(francisco.getBonificacao());
	}
}