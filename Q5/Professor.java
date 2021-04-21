package Q5;

public class Professor extends Pessoa{
    protected String _area;
    protected String _formacao;
    
    Professor(String nome, String cpf, String formacao, String area){
        super(nome, cpf);
        this._formacao = formacao;
        this._area = area;
    }

    @Override
    public void setNome(String nome){
        this._nome = nome;
    }
    @Override
    public void setCPF(String cpf){
        this._cpf = cpf;
    }

    public String getArea(){
        return this._area;
    }
    public void setArea(String area){
        this._area = area;
    }

    public String getFormacao(){
        return this._formacao;
    }
    public void setFormacao(String formacao){
        this._formacao = formacao;
    }

}
