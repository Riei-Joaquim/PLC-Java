package bonus;
import static java.lang.System.out;

public class ExprTernaria implements Expression{
    private ExprAritmetica _exprAritmetica;
    private ExprLogica _exprLogica;
    private String _expression;

    ExprTernaria(){
        this("");
    }

    ExprTernaria(String expr){
        this._expression = expr;
        this._exprLogica = new ExprLogica();
        this._exprAritmetica = new ExprAritmetica();
    }

    public String toString(){
        return this._expression;
    }

    @Override
    public String avaliar(){
        return this.avaliar(this._expression);
    }

    @Override
    public String avaliar(String expr){
        int index = expr.indexOf('?');
        String cond = expr.substring(0, index);
        String body = expr.substring(index + 1);
        
        index = body.indexOf(':');
        String ansExpr1 = body.substring(0, index);
        String ansExpr2 = body.substring(index+1);

        cond = this._exprLogica.avaliar(cond);

        if(cond == "True"){
            if(this._exprLogica.isExprLogica(ansExpr1)){
                return  this._exprLogica.avaliar(ansExpr1);
            }else{
                return  this._exprAritmetica.avaliar(ansExpr1);
            }
        }else{
            if(this._exprLogica.isExprLogica(ansExpr2)){
                return  this._exprLogica.avaliar(ansExpr2);
            }else{
                return  this._exprAritmetica.avaliar(ansExpr2);
            }
        }
    }

    @Override
    public String imprimirArvore(){
        return this.imprimirArvore(this._expression);
    }

    @Override
    public String imprimirArvore(String expr){
        int index = expr.indexOf('?');
        String cond = expr.substring(0, index);
        String body = expr.substring(index + 1);
        
        index = body.indexOf(':');
        String expr1 = body.substring(0, index);
        String expr2 = body.substring(index+1);

        cond = this._exprLogica.imprimirArvore(cond);

        if(this._exprLogica.isExprLogica(expr1)){
            expr1 = this._exprLogica.imprimirArvore(expr1);
        }else{
            expr1 = this._exprAritmetica.imprimirArvore(expr1);
        }

        if(this._exprLogica.isExprLogica(expr2)){
            expr2 = this._exprLogica.imprimirArvore(expr2);
        }else{
            expr2 = this._exprAritmetica.imprimirArvore(expr2);
        }        
        return cond +"?"+expr1+":"+expr2;
    }
}