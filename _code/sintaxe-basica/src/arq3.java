public class arq3 {
	public static void main(String args[]) {
		// Contagem crescente
        System.out.println("Teste de contagem crescente");
        for (int i = 0; i < 10; i++) {
			System.out.println("Contagem crescente: " + i);
            if (i == 5) {
                break;
            }
		}
        System.out.println();
        
        // Contagem decrescente
		System.out.println("Teste de contagem decrescente");
        for (int i = 9; i > -1; i--) {
			System.out.println("Contagem decrescente: " + i);
		}
	}
}