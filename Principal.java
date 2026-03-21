 class Pessoa{
        //Atributos
        String nome;
        String nasc;


        //Construtor
        Pessoa(String n){
            System.out.println("Criando: "+n);
            this.nome = n; 
        }
        Pessoa(String no, String na){
            this.nome = no;
            this.nasc = na;
        }

        //Métodos
        void andar(){
            System.out.println("Estou andando...");
        }
        void falar(){
            System.out.println("Oi meu nome é: "+ this.nome);
        }

        @Override
        public String toString(){
            String tmp = "Meu nome é: "+this.nome;
            return tmp;
        }
    }

public class Principal {
    public static void main(String[] args) {
        String teste = "teste";
        Pessoa p1 = new Pessoa("Wellington");
        Pessoa p2 = new Pessoa("João");
       // p1.falar();
       System.out.println(p1);
    }
}


