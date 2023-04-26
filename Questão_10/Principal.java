package Questão_10;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o valor do lado do quadrado: ");
	        double lado = input.nextDouble();
	        
	        double area = Math.pow(lado, 2);
	        
	        System.out.println("A área do quadrado é: " + area);
	        
	        input.close();
	    }
}
