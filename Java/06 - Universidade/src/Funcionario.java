public class Funcionario extends Pessoa{
    private String setor;
    public boolean trabalhando;


    public void mudarTrabalhando(){
        if (this.isTrabalhando()){
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }

    }

    public void setSetor(String setor){this.setor=setor;}
    public void setTrabalhando(boolean trabalhando){this.trabalhando = trabalhando;}
    public String getSetor(){return this.setor;}
    public boolean isTrabalhando(){return this.trabalhando;}

}
