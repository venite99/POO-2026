import java.util.Scanner;

public class TesteFuncao {

	public static void main(String[] args) {
		int inicio = lerNum("Digite o numero inicial: ");
		int fim = lerNum("Digite o numero final: ");
		int plim = lerNum("Digite o numero plim: ");
		plim(inicio, fim, plim);
	}

	public static int lerNum(String msg) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(msg);
		int plim = teclado.nextInt();
		return plim;
	}

	public static void plim(int inicio, int fim, int plim) {
		for (int i = inicio; i <= fim; i++) {
			if (i % plim == 0) {
				System.out.println("Plim!");
			} else {
				System.out.println(i);
			}
		}
	}
}
