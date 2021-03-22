public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setSexo("M");
        v1.setIdade(23);
        v1.apresentarVisitante();
        Aluno a1 = new Aluno();
        a1.setNome("Raul");
        a1.setMatricula(111);
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.setIdade(22);
        a1.apresentarAluno();
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setIdade(18);
        b1.setCurso("Informatica");
        b1.setMatricula(112);
        b1.setSexo("M");
        b1.viraBolsista();
        b1.pagarMensalidade();
        b1.apresentarAluno();
    }
}
