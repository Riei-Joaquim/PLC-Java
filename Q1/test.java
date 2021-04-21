package Q1;

public class test {
    public static void main(String args[]) {
      LivroBiblioteca principiosHaskell = new LivroBiblioteca("Aprenda Haskell", "121312qweq123", "Romildo", "2018", "Abril");
      principiosHaskell.emprestarLivro();
      principiosHaskell.emprestarLivro();

      LivroLivraria paiRico = new LivroLivraria("Pai Rico, Pai Pobre", "sdfe2346354532", "Juliano", "2006", "campus");
      paiRico.venderLivro();
      paiRico.venderLivro();
    }
}