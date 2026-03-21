class MaiorValor{
    int retornaMaior(int vetor[]){
        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i; 
    }
}
    return indiceMaior;
}
}

    int maiorSoma(int vetor2[]){
        int max = vetor2[0];
        int idx = 0;
        int aux = 0;
    

        for (int i = 1; i < vetor2.length; i++) {
            aux = vetor2[i-1] + valores[i];
            if (aux > max) {
                max = aux;
                idx = i;
    }
}
    return idx;
}



public class TesteArray {
    public static void main(String[] args) {
        int[] vetor = {2,5,1,9,3};
        
        MaiorValor valor = new MaiorValor();

        int r = valor.retornaMaior(vetor);
        System.out.println(r);

        int[] vetor2 = {9,1,3,7,5,2};
        int result = valor.maiorSoma(vetor2);
        System.out.println(result);
    }
}
