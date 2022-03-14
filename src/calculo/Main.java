package calculo;

import java.util.Scanner;


public class Main 
{

    public static void main(String[] args) 
    {      	
		int opcao = 5;
		double numero1;
		double numero2;
		
	    Scanner input = new Scanner(System.in); 
    	
    	    System.out.println("******CALCULADORA******");
    	    System.out.println("-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtração");  
	    System.out.println("3. Multiplicação");  
	    System.out.println("4. Divisão");	    
	    
	    opcao = input.nextInt();   
	    
	    switch (opcao) 
	    {
	    	case 1:
	    	opcao = 1;
	    	Scanner input1 = new Scanner(System.in);
	    	System.out.println("Qual o primeiro numero: ");
	    	numero1 = input1.nextInt();
	    	System.out.println("Qual o segundo numero: ");
	    	numero2 = input1.nextInt();		
			double resultado1 = Calculadora.soma(numero1, numero2);			
			System.out.println("O resultado é: " + resultado1);
			break;
			
	    	case 2:
		    opcao = 2;
		    Scanner input2 = new Scanner(System.in);
		    System.out.println("Qual o primeiro numero: ");
		    numero1 = input2.nextInt();
		    System.out.println("Qual o segundo numero: ");
		    numero2 = input2.nextInt();		
			double resultado2 = Calculadora.subtracao(numero1, numero2);			
			System.out.println("O resultado é: " + resultado2);
			break;
			
	    	case 3:
			opcao = 3;
			Scanner input3 = new Scanner(System.in);
			System.out.println("Qual o primeiro numero: ");
			numero1 = input3.nextInt();
			System.out.println("Qual o segundo numero: ");
			numero2 = input3.nextInt();		
			double resultado3 = Calculadora.multiplicacao(numero1, numero2);			
			System.out.println("O resultado é: " + resultado3);
			break;
			
	    	case 4:
			opcao = 4;
			Scanner input4 = new Scanner(System.in);
			System.out.println("Qual o primeiro numero: ");
			numero1 = input4.nextInt();
			System.out.println("Qual o segundo numero: ");
			numero2 = input4.nextInt();		
			double resultado4 = Calculadora.divisao(numero1, numero2);			
			System.out.println("O resultado é: " + resultado4);
			break;
	    
	    	default:
	    	System.out.println("Erro, tente novamente.");
	    }

	  
	    input.close();
    }
}
