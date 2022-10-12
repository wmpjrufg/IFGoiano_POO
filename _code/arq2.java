import java.util.Scanner;

public class arq2 {
    public static void main(String[] args){
        // Criação do objeto
        System.out.println("Entre com o diâmetro: ");
        Scanner input = new Scanner(System.in);
        // Leitura do Diâmetro
        double diametro = input.nextDouble();
        // Determinação da área
        double area = 3.14159 * diametro * diametro / 4;
        // Impressão do valor
        System.out.println("O valor da área da circunferência de diâmetro " + diametro + " é " + area);
    }
}