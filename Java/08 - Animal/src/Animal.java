public abstract class Animal {
    private double peso;
    private int idade;
    private int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();


    public void setPeso(double peso){this.peso = peso;}
    public void setIdade(int idade){this.idade = idade;}
    public void setMembros(int membros){this.membros = membros;}
    public double getPeso(){return this.peso;}
    public int getIdade(){return this.idade;}
    public int getMembros(){return this.membros;}
}
