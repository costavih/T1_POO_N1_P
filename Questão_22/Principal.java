package Questão_22;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número de lados do polígono: ");
        int numLados = input.nextInt();
        
        int numDiagonais = numLados * (numLados - 3) / 2;
        System.out.println("O número de diagonais do polígono é: " + numDiagonais);
        
        input.close();
    }
}

