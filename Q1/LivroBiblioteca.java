package Q1;
import static java.lang.System.out;

public class LivroBiblioteca extends Livro{
    private Boolean _emprestar;

    LivroBiblioteca(String title, String isbn, String autor, String ano, String editora){
        super.setTitle(title);
        super.setISBN(isbn);
        super.setAno(ano);
        super.setAno(editora);
        this._emprestar = false;
    }

    public void emprestarLivro(){
        if (!this._emprestar){
            this._emprestar = true;
            out.println("Emprestimo do livro registrado!");
        }else{
            out.println("Livro ja foi emprestado!");
        }
    }
};
