package Questão_06;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o salário fixo do funcionário: ");
	        double salarioFixo = input.nextDouble();
	        
	        System.out.print("Digite o valor das vendas do funcionário: ");
	        double valorVendas = input.nextDouble();
	        
	        double comissao = valorVendas * 0.04;
	        double salarioFinal = salarioFixo + comissao;
	        
	        System.out.println("Comissão do funcionário: " + comissao);
	        System.out.println("Salário final do funcionário: " + salarioFinal);
	        
	        input.close();
	    }
	}

