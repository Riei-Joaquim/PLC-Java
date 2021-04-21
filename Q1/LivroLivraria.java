package Q1;
import static java.lang.System.out;

public class LivroLivraria extends Livro{
    private boolean _vendido;

    LivroLivraria(String title, String isbn, String autor, String ano, String editora){
        super.setTitle(title);
        super.setISBN(isbn);
        super.setAno(ano);
        super.setAno(editora);
        this._vendido = false;
    }

    public void venderLivro(){
        if (!this._vendido){
            this._vendido = true;
            out.println("Venda do livro registrada!");
        }else{
            out.println("Livro ja foi Vendido!");
        }
    }

}