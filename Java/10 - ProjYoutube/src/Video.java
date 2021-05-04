public class Video implements AcoesVideos{

    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproducoes;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproducoes = false;

    }

    @Override
    public void play(){
        this.reproducoes = true;
    }
    @Override
    public void pause(){
        this.reproducoes = false;
    }
    @Override
    public void like(){
        this.curtidas++;
        this.avaliacao++;
    }
    @Override
    public String toString(){
        return "Video{ Titulo = "+this.titulo+" , avaliação = "+this.avaliacao+" " +
                ", views = "+this.views+" , curtidas = "+this.curtidas+", reproduzindo = "+
                this.reproducoes+" }";
    }

    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setAvaliacao(int avaliacao){
        double nova;
        nova = ((this.avaliacao+avaliacao)/this.views);
        this.avaliacao=nova;
    }
    public void setViews(int views){this.views=views;}
    public void setCurtidas(int curtidas){this.curtidas=curtidas;}
    public void setReproducoes(boolean reproducoes){this.reproducoes=reproducoes;}

    public String getTitulo(){return this.titulo;}
    public double getAvaliacao(){return this.avaliacao;}
    public int getViews(){return this.views;}
    public int getCurtidas(){return  this.curtidas;}
    public boolean getReproducoes(){return this.reproducoes;}


}
