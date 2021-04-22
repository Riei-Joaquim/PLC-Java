package Q6;
import static java.lang.System.out;

public class ExprLogica implements Expression {
    private final String [] OPERATORS = {"==", "!=",">=", "<=", ">", "<"};
    
    @Override
    public Double avaliar(String expr){
        String expr1 = "";
        String operator = "";
        String expr2 = "";

        for(int i = 0; i < OPERATORS.length; i++){
            int index = expr.indexOf(OPERATORS[i]);

            if(index >= 0){
                operator = OPERATORS[i];
                expr1 = expr.substring(0, index);
                expr2 = expr.substring(index + operator.length());
                break;
            }
        }

        return 1.0;
    }

    @Override
    public String imprimirArvore(String expr){
        return expr;
    }
}
