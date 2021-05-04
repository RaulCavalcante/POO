public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover(){System.out.println("Nadando");}
    @Override
    public void alimentar(){System.out.println("Comendo substancias");}
    @Override
    public void emitirSom(){System.out.println("Peixe não faz som");}

    public void soltarBolhas(){
        System.out.println("Blo blo blo");
    }

    public void setCorEscama(String corEscama){this.corEscama = corEscama;}
    public String getCorEscama(){return this.corEscama;}
}
