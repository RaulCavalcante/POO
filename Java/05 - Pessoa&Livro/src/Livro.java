public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totaldePagina;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa dono;

    public Livro (String titulo, String autor, int totaldePagina, Pessoa dono){
        this.titulo = titulo;
        this.autor = autor;
        this.totaldePagina = totaldePagina;
        this.paginaAtual = 0;
        this.aberto = false;
        this.dono = dono;
    }

    private  void setTitulo(String titulo){this.titulo=titulo;}
    private  void setAutor(String autor){this.autor=autor;}
    private  void setTotaldePagina(int totaldePagina){this.totaldePagina=totaldePagina;}
    private  void setPaginaAtual(int paginaAtual){this.paginaAtual=paginaAtual;}
    private void setAberto(boolean aberto){this.aberto=aberto;}
    private  void setDono(Pessoa dono){this.dono=dono;}

    private  String getTitulo(){return this.titulo;}
    private  String getAutor(){return this.autor;}
    private  int getTotaldePagina(){return this.totaldePagina;}
    private  int getPaginaAtual(){return this.paginaAtual;}
    private  boolean isAberto(){return this.aberto;}
    public Pessoa getDono(){return this.dono;}

    public void detalhe(){
        System.out.println("\nO dono do livro é:"+getDono().getNome());
        System.out.println("O titulo do livro é:"+getTitulo());
        System.out.println("O autor do livro é:"+getAutor());
        System.out.println("O total de paginas do livro é:"+getTotaldePagina());
        System.out.println("A pagina atual do livro é:"+getPaginaAtual());
        System.out.println("O livro está aberto:"+isAberto());

    }

    @Override
    public void abrir() {
        if (isAberto()) {
            System.out.println("\nO livro já está aberto!");
        }else{
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (isAberto()) {
            this.setAberto(false);
        }else{
            System.out.println("\nO livro já está fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if (isAberto()) {
            this.setPaginaAtual(p);
        }else{
            System.out.println("\nO livro não está aberto, abra-o primeiro!");
        }
    }

    @Override
    public void avancaPagina() {
        if (isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        }else{
            System.out.println("\nO livro não está aberto, abra-o primeiro!");
        }
    }

    @Override
    public void voltarPagina() {
        if (isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        }else{
            System.out.println("\nO livro não está aberto, abra-o primeiro!");
        }
    }

}
