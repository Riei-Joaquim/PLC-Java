package Q3;
import static java.lang.System.out;

public class Pessoa {
    protected String _nome;
    protected int _idade;
    protected String _grauEscolaridade;
    protected IdentidadeGenero _identidadeGenero;
    protected String _orientacaoSexual;
    protected String _sexoBiologico;
    
    Pessoa(){}

    Pessoa(String nome, int idade, String grauEscolaridade, IdentidadeGenero genero, String orientacaoSexual, String sexoBiologico){
        this._nome = nome;
        this._idade = idade;
        this._grauEscolaridade = grauEscolaridade;
        this._identidadeGenero = genero;
        this._orientacaoSexual = orientacaoSexual;
        this._sexoBiologico = sexoBiologico;
    }

    public String getNome(){
        return this._nome;
    }
    public void setNome(String nome){
        this._nome = nome;
    }

    public int getIdade(){
        return this._idade;
    }
    public void setIdade(int idade){
        this._idade = idade;
    }

    public String getGrauEscolaridade(){
        return this._grauEscolaridade;
    }
    public void setGrauEscolaridade(String grauEscolaridade){
        this._grauEscolaridade = grauEscolaridade;
    }

    public IdentidadeGenero getIdentidadeGenero(){
        return this._identidadeGenero;
    }

    public String getOrientacaoSexual(){
        return this._orientacaoSexual;
    }
    
    public String getSexoBiologico(){
        return this._sexoBiologico;
    }

    public void dormir(){
        out.println("Dormindo ...");
    }

    public void cagar(){
        out.println("Cagando ...");
    }

    public void comer(){
        out.println("Comendo ...");
    }

    public void estudar(){
        out.println("Estudando ...");
    }

    public void viver(){
        out.println("Vivendo ...");
    }

    public void sobreviver(){
        out.println("Sobrevivendo ...");
    }

    public void trabalhar(){
        out.println("Trabalhando ...");
    }
}
