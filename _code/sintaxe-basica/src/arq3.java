import java.util.Scanner;

public class arq3 {
    public static void main(String[] args){
        System.out.println("Entre com a idade do jogador de futebol: ");
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        if (idade < 13) {
            System.out.println("O jogador não pode ser inscrito neste torneio");
        } else if (idade > 14 &  idade <= 15) {
            System.out.println("Jogador inscrito na categoria Sub-15");
        } else if (idade > 15 &  idade <= 17) {
            System.out.println("Jogador inscrito na categoria Sub-17");  
        } else if (idade > 17 &  idade <= 20) {
            System.out.println("Jogador inscrito na categoria Sub-20");
        } else if (idade > 20) {
            System.out.println("Jogador inscrito na categoria adulto");
        }   
    }
}