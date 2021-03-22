public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public Pessoa (String nome,int idade, String sexo){
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
    }

    private  void setNome(String nome){this.nome=nome;}
    private  void setIdade(int idade){this.idade=idade;}
    private  void setSexo(String sexo){this.sexo=sexo;}
    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}
    public String getSexo(){return this.sexo;}

    public void fezAniversario(){this.setIdade(getIdade()+1);}

    public void apresentação(){
        System.out.println("\nPessoa: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Sexo: "+getSexo());
    }




}
