public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Raul",22,"M");
        pessoa.apresentação();
        Livro livro = new Livro("O magico","Arthur",10,pessoa);
        livro.detalhe();
        pessoa.fezAniversario();
        pessoa.apresentação();
        livro.avancaPagina();
        livro.abrir();
        livro.avancaPagina();
        livro.detalhe();
    }
}
