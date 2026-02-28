import java.util.Scanner;

public class Aula2 {
      public static void main(String[] args) {
    	  
  
    Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um número inicial: ");
	int num1 = teclado.nextInt();
	
	
	 Scanner teclado2 = new Scanner(System.in);
	 System.out.println("Digite um número final: ");
	 int num2 = teclado.nextInt();
	
	
	for(int i = num1; i<=num2; i++) {
		if(i % 3 ==0) {
		System.out.println("PLIM");}
		
		else {
			System.out.println(i);	
		}
	}
   }
  }
