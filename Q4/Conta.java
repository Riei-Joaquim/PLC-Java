package Q4;

public class Conta {
    protected int _numId;
    protected String _agencia;
    protected Senha _senha;
    
    Conta(int numId, String agencia, Senha senha){
        this._numId = numId;
        this._agencia = agencia;
        this._senha = senha;
    }

    @Override
    public String toString(){
        return "Numero de identificacao: "+ this._numId + " Senha de letras: "+ this._senha.getSenhaLetras();
    }

    public int getNumId(){
        return this._numId;
    }
    public void setNumId(int numId){
        this._numId = numId;
    }

    public String getAgencia(){
        return this._agencia;
    }
    public void setAgencia(String agencia){
        this._agencia = agencia;
    }

    public Senha getSenhas(){
        return this._senha;
    }
    public void setSenhas(Senha senha){
        this._senha = senha;
    }
}
