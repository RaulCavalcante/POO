public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String variedade;

    public Carro ( String marca , String modelo , int ano , String variedade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variedade = variedade;
    }

    public String getMarca(){ return marca ; }

    public void setMarca( String marca ){ this.marca = marca; }


}
