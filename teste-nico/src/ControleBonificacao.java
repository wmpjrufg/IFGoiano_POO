public class ControleBonificacao {
	
	private double somaBonus = 0.0;
	
	public void bonus(Gerente var) {
		double bonus = var.getBonificacao();
		this.somaBonus = this.somaBonus + bonus;
	}
}