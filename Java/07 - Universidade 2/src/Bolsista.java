public class Bolsista extends Aluno{
    private boolean bolsa;

    public void viraBolsista(){
        if (this.bolsa){
            System.out.println("\nAluno "+this.getNome()+" já é bolsista!");
        }else{
            setBolsa(true);
            System.out.println("\nAluno "+this.getNome()+" agora se torna um aluno bolsista!");
        }
    }

    @Override
    public void pagarMensalidade(){System.out.println("Mensalidade de R$ 200 de aluno Bolsista "+this.getNome()+" foi paga!");}
    @Override
    public void apresentarAluno(){
        System.out.println("\nNome:"+this.getNome()+"\t"+"Idade:"+this.getIdade()+"\t"+"Sexo:"+this.getIdade());
        System.out.println("Matricula:"+this.getMatricula()+"\t"+"Curso:"+this.getCurso()+"\t"+"Bolsista:"+this.isBolsa());
    }

    public void setBolsa(boolean bolsa){this.bolsa=bolsa;}
    public boolean isBolsa(){return this.bolsa;}
}
