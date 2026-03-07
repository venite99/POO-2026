public class Teste {
    public static void main(String[] args) {

        Pessoa tmp;

       tmp = new Pessoa();
        tmp.adicionaInfo("joao", 22);
        tmp.mostreInfo();

        tmp = new Pessoa();
        tmp.adicionaInfo("jose", 33);
        tmp.mostreInfo();

        tmp = new Pessoa();
        tmp.adicionaInfo("Marcelo", 35);
        tmp.mostreInfo();
        
        
        
    }

}
class Pessoa {
    String nome;
    int idade;

    public void adicionaInfo(String n, int id, int ano) {
        this.nome = n;
        this.idade = id;
        this.nasc = ano;
    }

    public void mostreInfo() {
        System.out.println("Nome: " + this.nome + ", idade: " + this.idade +"Ano Nascimento: " + this.nasc);
    }
}


