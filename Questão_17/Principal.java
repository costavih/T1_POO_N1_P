package Questão_17;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();
        
        double pi = 3.14159;
        double comprimento = 2 * pi * raio;
        double area = pi * Math.pow(raio, 2);
        double volume = (3.0/4.0) * pi * Math.pow(raio, 3);
        
        System.out.println("O comprimento da esfera é: " + comprimento);
        System.out.println("A área da esfera é: " + area);
        System.out.println("O volume da esfera é: " + volume);
        
        input.close();
    }
}

