package Q6;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        ExprAritmetica expr = new ExprAritmetica();
        //out.println(expr.imprimirArvore("2*3+4/6/6*4"));
        ExprLogica expr2 = new ExprLogica();
        expr2.avaliar("2+5/10!=12+16");
    }
}