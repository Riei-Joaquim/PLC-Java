package Q5;

public abstract class Pessoa {
    protected String _nome;
    protected String _cpf;

    Pessoa(String nome, String cpf){
        this._nome = nome;
        this._cpf = cpf;
    }

    public String getNome() {
        return this._nome;
    }
    public abstract void setNome(String nome);

    public String getCPF() {
        return this._cpf;
    }
    public abstract void setCPF(String cpf);
}
