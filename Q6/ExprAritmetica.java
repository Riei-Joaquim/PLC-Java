package Q6;
import static java.lang.System.out;

public class ExprAritmetica implements Expression{
    private final String OPERATORS = "+-*/";
    private String _expression;

    ExprAritmetica(){
        this("");
    }
    
    ExprAritmetica(String expr){
        this._expression = expr;
    }

    public String getExpression(){
        return this._expression;
    }

    public void setExpression(String expr){
        this._expression = expr;
    }

    @Override
    public String toString(){
        return "ExprAritmetica@" + this.hashCode() + "|" + this._expression;
    }

    @Override
    public String avaliar(){
        Double ans = this.avaliarSolver(this._expression);
        return ans.toString();
    }
    
    @Override
    public String avaliar(String expr){
        Double ans = this.avaliarSolver(expr);
        return ans.toString();
    }

    private Double avaliarSolver(String expr){
        String operando1 = "";
        Boolean isOperando2 = true;
        String operando2 = "";
        char curOperator = '!';

        for(int i = 0; i < this.OPERATORS.length(); i++){
            curOperator = this.OPERATORS.charAt(i);
            operando1 = "";
            operando2 = "";
            for(int j = expr.length() -1; j >= 0; j--){
                char curChar = expr.charAt(j);
                if(isOperando2){
                    if(curOperator != curChar){
                        operando2 = curChar + operando2;
                        
                    }else{
                        isOperando2 = false;
                    }
                }else{
                    operando1 = curChar + operando1;
                }
            }
            if(!isOperando2){
                break;
            }
        }

        if(operando1 != ""){
            // na volta da chamada recursiva os operandos e operadores ficam certos.
            if(curOperator == '*'){
                // a*b == b*a
                return (avaliarSolver(operando2) * avaliarSolver(operando1));
            }
            else if(curOperator == '/'){
                // a/b == (1/b)*a
                return ((1/avaliarSolver(operando2)) * avaliarSolver(operando1));
            }
            else if(curOperator == '+'){
                //a+b = b+a
                return (avaliarSolver(operando2) + avaliarSolver(operando1));
            }
            else if(curOperator == '-'){
                // a-b == -b+a
                return (-avaliarSolver(operando2) + avaliarSolver(operando1));
            }
        }
        return Double.parseDouble(operando2);
    }

    @Override
    public String imprimirArvore(){
        return this.imprimirArvore(this._expression);
    }

    @Override
    public String imprimirArvore(String expr){
        String operando1 = "";
        Boolean isOperando2 = true;
        String operando2 = "";
        char curOperator = '!';

        for(int i = 0; i < this.OPERATORS.length(); i++){
            curOperator = this.OPERATORS.charAt(i);
            operando1 = "";
            operando2 = "";
            for(int j = expr.length()-1; j >= 0; j--){
                char curChar = expr.charAt(j);
                if(isOperando2){
                    if(curOperator != curChar){
                        operando2 = curChar + operando2;
                        
                    }else{
                        isOperando2 = false;
                    }
                }else{
                    operando1 = curChar + operando1;
                }
            }
            if(!isOperando2){
                break;
            }
        }

        if(operando1 != ""){
            return "(" + imprimirArvore(operando1) + curOperator + imprimirArvore(operando2) + ")";
        }

        return "("+operando2+")";
    }
}
