package Q2;
import static java.lang.System.out;

public class test {
    public static void main(String args[]) {
        Texto txt = new Texto("ada13 sdfdsf egefdf\tasda11fvrfetgr   dfgdfgfd 1123qe2312..\t3eqewqe");
        txt.replaceStrInText("df", "replaceTest");
        txt.imprimir();
        out.println("O texto contem "+ txt.QTDPalavras() + " palavras");
        out.println("O texto possui a string '12' " + txt.QTDStrInText("12")+ " vezes");
    }
}
