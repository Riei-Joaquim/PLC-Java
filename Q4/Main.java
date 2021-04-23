package Q4;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        Conta myConta = new Conta(435433, "33535-9", new Senha("w4we4d2444dssqkg", 3252352));
        
        out.println(myConta);
        
        myConta.getSenhas().setSenhaLetras("sdadwrgedge");

        out.println(myConta);
    }
}
