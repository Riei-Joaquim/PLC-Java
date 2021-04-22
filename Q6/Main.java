package Q6;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        ExprAritmetica expr1 = new ExprAritmetica("2*3+4/6/6*4");
        out.println(expr1);
        out.println(expr1.avaliar());
        expr1.setExpression("2*3+4/6");
        out.println(expr1);
        out.println(expr1.avaliar("5*2-1/4*7/2+6"));
        out.println(expr1.avaliar());

        ExprLogica expr2 = new ExprLogica("2+5/10<12+16");
        out.println(expr2);
        out.println(expr2.imprimirArvore("2+5/10<12+16"));
        out.println(expr2.avaliar("2+5/10<12+16"));

        ExprLogica expr3 = new ExprLogica("2*3+4/6!=4/6/6*4");
        out.println(expr3);
        out.println(expr3.imprimirArvore());
        out.println(expr3.avaliar());
    }
}