public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        this.matricula = 0;
        this.curso = null;
        System.out.println("Matricula Cancelada!");
    }
    public void pagarMensalidade(){
        System.out.println("Mensalidade de R$ 500 de "+this.getNome()+" foi paga!");
    }
    public void apresentarAluno(){
        System.out.println("\nNome:"+this.getNome()+"\t"+"Idade:"+this.getIdade()+"\t"+"Sexo:"+this.getIdade());
        System.out.println("Matricula:"+this.getMatricula()+"\t"+"Curso:"+this.getCurso());
    }

    public void setMatricula(int matricula){this.matricula = matricula;}
    public void setCurso(String curso){this.curso = curso;}
    public String getCurso(){return this.curso;}
    public int getMatricula(){return this.matricula;}
}
