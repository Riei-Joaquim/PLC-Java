package Q5;

public class Aluno extends Pessoa{
    protected String _matricula;
    protected String _curso;

    Aluno(String nome, String cpf, String matricula, String curso){
        super(nome, cpf);
        this._matricula = matricula;
        this._curso = curso;
    }

    @Override
    public void setNome(String nome){
        this._nome = nome;
    }
    @Override
    public void setCPF(String cpf){
        this._cpf = cpf;
    }

    public String getMatricula(){
        return this._matricula;
    }
    public void setMatricula(String matricula){
        this._matricula = matricula;
    }

    public String getCurso(){
        return this._curso;
    }
    public void setCurso(String curso){
        this._curso = curso;
    }
    
}
