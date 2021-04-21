public abstract class Livro{
    private String _title;
    private String _ISBN;
    private String _autor;
    private String _ano;
    private String _editora;

    public String getTitle(){
        return _title;
    }
    public void setTitle(String title){
        this._title = title;
    }

    public String getISBN(){
        return _ISBN;
    }
    public void setISBN(String isbn){
        this._ISBN = isbn;
    }

    public String getAutor(){
        return _autor;
    }
    public void setAutor(String autor){
        this._autor = autor;
    }

    public String getAno(){
        return _ano;
    }
    public void setAno(String ano){
        this._ano = ano;
    }

    public String getEditora(){
        return _editora;
    }
    public void setEditora(String editora){
        this._editora = editora;
    }
};


public class LivroLivraria extends Livro{

    LivroLivraria(title, isbn, autor, ano, editora){
        super.setTitle(title);
        super.setIsbn(isbn);
        super.setAno(ano);
        super.setAno(editora);
    }

    public void venderLivro(){

    }

};

public class LivroBiblioteca extends Livro{

    LivroBiblioteca(title, isbn, autor, ano, editora){
        super.setTitle(title);
        super.setIsbn(isbn);
        super.setAno(ano);
        super.setAno(editora);
    }


    public void emprestarLivro(){
        
    }
};