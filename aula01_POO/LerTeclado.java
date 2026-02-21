import java.util.Scanner;

public class LerTeclado {
    public static void main(String[] args) {


	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite sua idade: ");
	int idade = teclado.nextInt();

	System.out.println("Digite seu nome: ");
	String nome = teclado.next();

        System.out.println(nome + " voce tem: " + idade);
	
    }
}
