public class Texto{
    private String _text;

    public void imprimir(){
        system.println(this._text);
    }

    public int numPalavras(){
        words = this._text.split(' ');
        return words.length();
    }
};