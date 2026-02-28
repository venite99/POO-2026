package dft;

import java.util.Scanner;

public class Aula {
      public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int numero = teclado.nextInt();
	System.out.println("Tabuada do " + numero);
	for(int i = 1; i<=10; i++) {
	System.out.println(i * numero);
	}
   }
  }
