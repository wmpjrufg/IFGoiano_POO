class Usuarios {
    String nome;
    String matricula;
    int quantidade;
    
    
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
}