package Q4;

public class Senha {
    protected String _senhaLetras;
    protected int _senhaNumbers;

    Senha(String senha, int senhaNumbers){
        this._senhaLetras = senha;
        this._senhaNumbers = senhaNumbers;
    }

    public String getSenhaLetras(){
        return this._senhaLetras;
    }
    public void setSenhaLetras(String senha){
        this._senhaLetras = senha;
    }

    public int getSenhaNumbers(){
        return this._senhaNumbers;
    }
    public void setSenhaNumbers(int senhaNumbers){
        this._senhaNumbers = senhaNumbers;
    }

}
