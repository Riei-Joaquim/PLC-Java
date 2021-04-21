package Q2;
import static java.lang.System.out;
import java.util.*;

public class Texto {
    private String _text;

    Texto(String texto){
        this._text = texto;
    }

    public void imprimir(){
        out.println(this._text);
    }

    public int QTDPalavras(){
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        for(int i = 0; i < this._text.length(); i++){
            char curChar = this._text.charAt(i);

            if(curChar == ' ' || curChar == '\t' || curChar == '.' || i == (this._text.length() -1)){
                if(word.length() > 0){
                    words.add(word);
                    word = "";
                } 
            }
            else if(('0' <= curChar && curChar <= '9') || ('a' <= curChar && curChar <= 'z') || ('A' <= curChar && curChar <= 'Z')){
                word += curChar;
            }
        }
        return words.size();
    }
    
    public int QTDStrInText(String subString){
        int index = this._text.indexOf(subString);
        int count = 0;

        while (index >= 0) {
            count++;
            index = this._text.indexOf(subString, index + 1);
        }

        return count;
    }

    public void replaceStrInText(String oldSubString, String newSubString){
        this._text = this._text.replaceAll(oldSubString, newSubString);
    }
}
