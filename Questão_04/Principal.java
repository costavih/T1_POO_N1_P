package Questão_04;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = input.nextDouble();
	        
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = input.nextDouble();
	        
	        double mediaPonderada = (nota1*2 + nota2*3)/5;
	        
	        System.out.println("A média ponderada das notas é: " + mediaPonderada);
	        
	        input.close();
	    }
}
