package Questão_03;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro número: ");
	        double num1 = input.nextDouble();
	        
	        System.out.print("Digite o segundo número: ");
	        double num2 = input.nextDouble();
	        
	        double resultado = num1 / num2;
	        System.out.println("Resultado da divisão: " + resultado);
	        
	        input.close();
	    }
	}

