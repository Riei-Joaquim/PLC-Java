package Q5;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        ColecaoVetor cVetor = new ColecaoVetor();
        
        cVetor.inserir(new Professor("Pedro", "123.123.111-10", "Phd. in TLE", "Computacao"));
        out.println("Restam " + cVetor.tamanhoColecaoNaoNull() + " posicoes disponiveis");

        cVetor.inserir(new Aluno("Paulo", "123.123.145-42", "9023423wee90", "Computacao"));
        out.println("Restam " + cVetor.tamanhoColecaoNaoNull() + " posicoes disponiveis");

        cVetor.inserir(new Aluno("Lucas", "452.444.309-89", "345dfg345dvf", "fisica"));
        out.println("Restam " + cVetor.tamanhoColecaoNaoNull() + " posicoes disponiveis");

        out.println("\nNomes na colecao:\n");

        for(String nome: cVetor.getNomes()){
            out.println(nome);
        }
    }
}
