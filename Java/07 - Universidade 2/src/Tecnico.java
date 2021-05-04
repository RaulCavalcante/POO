public class Tecnico extends Aluno{
    private int registro;

    public void praticar(){
        System.out.println("Praticando...\nPrática concluída com sucesso!");
    }

    public int getRegistro() { return registro; }
    public void setRegistro(int registro) { this.registro = registro; }

}
