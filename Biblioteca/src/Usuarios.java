class Usuarios {
    String nome;
    String matricula;
    private int quantidade;
    
    
    public boolean transfere(int numLivros, Usuarios destino) {
        if (this.quantidade > 0) {
            this.quantidade -= numLivros;
            destino.quantidade += numLivros;
            System.out.println("Foi possível transferir o livro!!!!");
            return true; 
        } else {
            System.out.println("Não foi possível transferir o livro!!!!");
            return false;
        }
    }
    
    // Novo método criado para adicionar quantidade
    public boolean addQuantidade() {
        this.quantidade += 1;
        return true;
    }
    
    // Novo método criado para imprimir quantidade
    public void printQuantidade() {
        System.out.println("A quantidade é: " + this.quantidade);
    }
}