package Questão_05;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o preço do produto: ");
	        double preco = input.nextDouble();
	        
	        double novoPreco = preco * 0.9;
	        
	        System.out.println("O novo preço com desconto de 10% é: " + novoPreco);
	        
	        input.close();
	    }
}
