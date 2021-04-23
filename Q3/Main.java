package Q3;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Joaquim", 22, "Superior incompleto", IdentidadeGenero.CISGENERO, "Hetero", "Masculino");

        p1.dormir();
        p1.comer();
        p1.estudar();
        p1.sobreviver();
        p1.cagar();
        p1.trabalhar();
        p1.viver();
        out.println("");
        out.println(p2.getNome());
        out.println(p2.getIdade());
        out.println(p2.getGrauEscolaridade());
        out.println(p2.getIdentidadeGenero());
        out.println(p2.getOrientacaoSexual());
        out.println(p2.getSexoBiologico());
    }
}
