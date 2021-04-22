package bonus;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        ExprTernaria expr1 = new ExprTernaria("2*3+4/6!=3/4?96+45*3:26*7*6/4+3");
        out.println(expr1);
        out.println(expr1.imprimirArvore());
        out.println(expr1.avaliar());

        ExprTernaria expr2 = new ExprTernaria("2*3+4/6!=3/4?3<5+6:26*7*6/4+3");
        out.println(expr2);
        out.println(expr2.imprimirArvore("2*3+4/6!=3/4?3<5+6:26*7*6/4+3"));
        out.println(expr2.avaliar("2*3+4/6!=3/4?3<5+6:26*7*6/4+3"));
    }
}
