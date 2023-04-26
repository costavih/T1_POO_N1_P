package Questão_18;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite a temperatura em graus Celsius: ");
	        double celsius = input.nextDouble();
	        
	        double fahrenheit = 1.8 * celsius + 32;
	        
	        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	        
	        input.close();
	    }
}
