package Q5;
import static java.lang.System.out;

public class ColecaoVetor implements Colecao{
    protected Pessoa [] dados;
    private int _curIndex;

    ColecaoVetor(){
        this.dados = new Pessoa[5];
        this._curIndex = 0;
    }

    @Override
    public void inserir(Pessoa p){
        if(this._curIndex < 5){
            this.dados[this._curIndex] = p;
            this._curIndex++;
        }else{
            out.println("Error - list out of available range");
        }
    }
    @Override
    public int tamanhoColecaoNaoNull(){
        return 5 - this._curIndex;
    }

    public String [] getNomes(){
        String [] nomes = new String[this._curIndex];
        
        for(int i=0; i < this._curIndex; i++){
            nomes[i] = this.dados[i].getNome();
        }
        
        return nomes;
    }
}
