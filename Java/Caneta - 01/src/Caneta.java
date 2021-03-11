public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta (String modelo, String cor , double ponta , int carga , boolean tampada ){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public void status () {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Tampada: "+this.tampada);
    }
    public void escrever (){
        if (tampada == true) {
            System.out.println(" Não pode escrever , pois a caneta está tampada !");
        }
        else{
            System.out.println("Escrevendo.....");
        }
    }

    public void tampar (){
        if (this.tampada == false){
            this.tampada = true;
            System.out.println("Caneta tampada!");
        }else{
            System.out.println("Caneta ja está tampada!");
        }
    }
    public void destampar (){
        if (this.tampada == true) {
            this.tampada = false;
            System.out.println("Caneta destampada!");
        }else{
            System.out.println("Caneta ja está destampada!");
        }
    }

    public String getModelo (){
        return this.modelo;
    }
    public String getCor () { return this.cor; }
    public double getPonta () { return  this.ponta; }
    public int getCarga () { return  this.carga; }
    public boolean getTampada () { return this.tampada; }

    public void setModelo ( String modelo ) { this.modelo = modelo;}
    public void setCor ( String cor ) { this.cor = cor;}
    public void setPonta ( double ponta ) { this.ponta = ponta;}
    public void setCarga ( int carga ) { this.carga = carga; }
    public void setTampada ( boolean tampada ) { this.tampada = tampada;}

}
