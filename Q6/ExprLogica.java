package Q6;
import static java.lang.System.out;

public class ExprLogica implements Expression {
    private final String [] OPERATORS = {"==", "!=",">=", "<=", ">", "<"};
    private String _expression;
    private ExprAritmetica _exprSolver;

    ExprLogica(){
        this("");
    }
    
    ExprLogica(String expr){
        this._expression = expr;
        this._exprSolver = new ExprAritmetica();
    }

    public String getExpression(){
        return this._expression;
    }

    public void setExpression(String expr){
        this._expression = expr;
    }

    @Override
    public String toString(){
        return "ExprLogica@" + this.hashCode() + "|" + this._expression;
    }

    @Override
    public String avaliar(){
        return this.avaliar(this._expression);
    }

    @Override
    public String avaliar(String expr){
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
        String ansExpr1 =  this._exprSolver.avaliar(expr1);      
        String ansExpr2 =  this._exprSolver.avaliar(expr2);
        Boolean ans;

        if(operator == "=="){
            ans = Double.parseDouble(ansExpr1) == Double.parseDouble(ansExpr2);
        }else if(operator == "!="){
            ans = Double.parseDouble(ansExpr1) != Double.parseDouble(ansExpr2);
        }else if(operator == ">="){
            ans = Double.parseDouble(ansExpr1) >= Double.parseDouble(ansExpr2);
        }else if(operator == "<="){
            ans = Double.parseDouble(ansExpr1) <= Double.parseDouble(ansExpr2);
        }else if(operator == ">"){
            ans = Double.parseDouble(ansExpr1) > Double.parseDouble(ansExpr2);
        }else{
            ans = Double.parseDouble(ansExpr1) < Double.parseDouble(ansExpr2);
        }
        
        if(ans){
            return "True";
        }else{
            return "False";
        }
    }

    @Override
    public String imprimirArvore(){
        return this.imprimirArvore(this._expression);
    }

    @Override
    public String imprimirArvore(String expr){
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
        String ansExpr1 =  this._exprSolver.imprimirArvore(expr1);      
        String ansExpr2 =  this._exprSolver.imprimirArvore(expr2);

        return "("+ansExpr1+operator+ansExpr2+")";
    }
}