public class Aluno extends Pessoa{

    private int matricula;
    private String curso;


    public void cancelarMatricula(){
        this.matricula = 0;
        this.curso = null;
        System.out.println("Matricula Cancelada!");
    }

    public void apresentarAluno(){
        System.out.println("Nome:"+this.getNome());
        System.out.println("Idade:"+this.getIdade());
        System.out.println("Sexo:"+this.getIdade());
    }

    public void setMatricula(int matricula){this.matricula = matricula;}
    public void setCurso(String curso){this.curso = curso;}
    public String getCurso(){return this.curso;}
    public int getMatricula(){return this.matricula;}



}
