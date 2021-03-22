import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovado;

    private Lutador getDesafiado(){return desafiado;}
    private Lutador getDesafiante(){return desafiante;}
    private int getRound(){return round;}
    private boolean isAprovado(){return aprovado;}

    private void setDesafiado(Lutador desafiado){this.desafiado = desafiado;}
    private void setDesafiante(Lutador desafiante){this.desafiante = desafiante;}
    private void setRound(int round){this.round = round;}
    private void setAprovado(boolean aprovado){ this.aprovado = aprovado;}

    public void marcaLutar(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 ){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovado){
            System.out.println("\n---/---/--- Desafiado ---/---/--- ");
            this.desafiado.apresentacao();
            System.out.println("---/---/--- Desafiante ---/---/--- ");
            this.desafiante.apresentacao();

            Random aleatorio = new Random();
            int escolha = aleatorio.nextInt(3);
            switch (escolha){
                case 0:
                    System.out.println("Empate!!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do Desafiante "+desafiante.getNome()+"!!!");
                    this.desafiante.ganhaLuta();
                    this.desafiado.perdeLuta();
                case 2:
                    System.out.println("Vitoria do Desafiado "+desafiado.getNome()+"!!!");
                    this.desafiante.perdeLuta();
                    this.desafiado.ganhaLuta();
            }
        }else{
            System.out.println("\nA luta não pode acontecer!");
        }
    }


}
