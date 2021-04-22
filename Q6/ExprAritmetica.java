package Q6;
import static java.lang.System.out;

public class ExprAritmetica implements Expression{
    private final String OPERATORS = "+-*/";
    
    @Override
    public Double avaliar(String expr){
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
            //out.println(operando1 +" "+ curOperator+" "+operando2);
            if(curOperator == '*'){
                // a*b == b*a
                return (avaliar(operando2) * avaliar(operando1));
            }
            else if(curOperator == '/'){
                // a/b == (1/b)*a
                return ((1/avaliar(operando2)) * avaliar(operando1));
            }
            else if(curOperator == '+'){
                //a+b = b+a
                return (avaliar(operando2) + avaliar(operando1));
            }
            else if(curOperator == '-'){
                // a-b == -b+a
                return (-avaliar(operando2) + avaliar(operando1));
            }
        }
        //out.println(operando2);
        return Double.parseDouble(operando2);

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
            out.println(operando1 +" "+ curOperator+" "+operando2);
            return "(" + imprimirArvore(operando1) + curOperator + imprimirArvore(operando2) + ")";
         
        }

        out.println(operando2);

        return "("+operando2+")";
    }
}
