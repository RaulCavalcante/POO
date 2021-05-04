public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int experiencia;

    public Pessoa(String nome, String sexo, int idade){
        this.nome=nome;
        this.sexo=sexo;
        this.idade=idade;
        this.experiencia = 0;
    }

    @Override
    public String toString(){
        return "Pessoa{ Nome = "+this.nome+" , sexo = "+this.sexo+" " +
                ", idade = "+this.idade+" , experiencia = "+this.experiencia;
    }

    public void ganharExperiencia(){this.experiencia++;}

    public void setNome(String nome){this.nome=nome;}
    public void setIdade(int idade){this.idade=idade;}
    public void setSexo(String sexo){this.sexo=sexo;}
    public void setExperiencia(int experiencia){this.experiencia=experiencia;}

    public String getNome(){return this.nome;}
    public String   getSexo(){return this.sexo;}
    public int  getIdade(){return this.idade;}
    public int getExperiencia(){return this.experiencia;}


}
