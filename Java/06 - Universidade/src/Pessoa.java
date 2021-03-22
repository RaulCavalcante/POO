public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    /*
    public Pessoa (String nome,int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    */

    public void fazerAniversario(){this.setIdade(this.getIdade()+1);}


    public void setSexo(String sexo){this.sexo=sexo;}
    public void setNome(String nome){this.nome=nome;}
    public void setIdade(int idade){this.idade=idade;}
    public int getIdade(){return this.idade;}
    public String getNome(){return this.nome;}
    public String getSexo(){return this.sexo;}


}
