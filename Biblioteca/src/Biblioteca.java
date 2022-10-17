public class Biblioteca {
    public static void main(String[] args) {
        
        int numUsuarios = 0;
        int numLivros = 0;
        
        // Instanciando um novo usuário: Biblioteca
        Usuarios biblio = new Usuarios();
        biblio.nome = "Biblioteca central";
        biblio.matricula = "0000";
        biblio.quantidade = 0;
        
        // Instanciando um novo usuário: Aluno 1
        Usuarios wmpjr = new Usuarios();
        wmpjr.nome = "Wanderlei Malaquias Pereira Junior";
        wmpjr.matricula = "0001";
        wmpjr.quantidade = 0;
        numUsuarios += 1;
        
        // Instanciando o primeio livro
        Acervo publio8554274040 = new Acervo();
        publio8554274040.nome = "Pisos Industriais Com Concreto De Retração Compensada";
        publio8554274040.ano = 2019;
        publio8554274040.editora = "J.J. Carol";
        publio8554274040.area = "Engenharia Civil";
        publio8554274040.autor = "Públio Penna Firme Rodrigues";
        publio8554274040.isbn = "8554274040";
        publio8554274040.usuario = biblio;
        biblio.quantidade += 1;
        numLivros += 1;
        
        // Impressões
        System.out.println("Cadastro de livro novo:::");
        System.out.println("Local: " + publio8554274040.usuario.nome);
        System.out.println("Ref. usuário: " + publio8554274040.usuario);
        System.out.println("Ref. local: " + biblio);
    }
}
