public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void avaliar(){this.filme.setAvaliacao(5);}
    public void avaliar(int nota){this.filme.setAvaliacao(nota);}

    public void setEspectador(Gafanhoto espectador){
        this.espectador=espectador;
    }
    public void setFilme(Video filme){
        this.filme=filme;
    }
    public Gafanhoto getEspectador(){return this.espectador;}
    public Video getFilme(){return this.filme;}
    @Override
    public String toString(){
        return "Visualizacao{ espectador = "+this.espectador+" , filme = "+this.filme+" }";
    }

}
