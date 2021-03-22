public class Professor extends Pessoa{

    private double salaraio;
    private String especialidade;



    public void receberAumento(int valor){this.setSalaraio(this.getSalaraio()+valor);}

    public void setSalaraio(double salario){this.salaraio=salario;}
    public void setEspecialidade(String especialidade){this.especialidade=especialidade;}
    public String getEspecialidade(){return this.especialidade;}
    public double getSalaraio(){return this.salaraio;}


}
