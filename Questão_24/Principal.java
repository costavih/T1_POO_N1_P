package Questão_24;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite a quantidade de dinheiro em reais: ");
	        double dinheiroReais = input.nextDouble();
	        
	        double cotacaoDolar = 1.80;
	        double cotacaoMarcoAlemao = 2.00;
	        double cotacaoLibraEsterlina = 1.57;
	        
	        double dinheiroDolares = dinheiroReais / cotacaoDolar;
	        double dinheiroMarcoAlemao = dinheiroReais / cotacaoMarcoAlemao;
	        double dinheiroLibraEsterlina = dinheiroReais / cotacaoLibraEsterlina;
	        
	        System.out.println("Valor em dólares: " + dinheiroDolares);
	        System.out.println("Valor em marco alemão: " + dinheiroMarcoAlemao);
	        System.out.println("Valor em libra esterlina: " + dinheiroLibraEsterlina);
	        
	        input.close();
	    }
}
