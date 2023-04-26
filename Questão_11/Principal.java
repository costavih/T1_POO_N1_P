package Questão_11;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = input.nextDouble();
        
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = input.nextDouble();
        
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + areaLosango);
        
        input.close();
    }
}
