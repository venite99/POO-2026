public class Teste3 {
    public static void main(String[] args) {
        Pessoa2 pessoas[]= new Pessoa2[3];
        pessoas[0] = new Pessoa2("Ana", 15);
        pessoas[1] = new Pessoa2("Bob", 18);
        pessoas[2] = new Pessoa2("Carl", 16);

        Pessoa2 result = maiorIdade( pessoas );
		System.out.println("Pessoa com maior idade abaixo");
		System.out.println(result);
    }
}

class Pessoa2{
    String nome;
    int idade;


    Pessoa2(String n, int idd){
        this.nome = n;
        this.idade = idd;
    }

    int maiorIdade(int idade[]){
        int maior = 0;

        for (int i = 1; i < idade.length; i++) {
            if (idade[i] > idade[maior]) {
                maior = i; 
    }
}
    return maior;
}
}