public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int salvaVolume;

    public ControleRemoto (){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int  getVolume(){return this.volume;}
    private boolean  isLigado(){return this.ligado;}
    private boolean   isTocando(){return this.tocando;}

    private void setVolume(int volume){this.volume = volume; }
    private void setLigado(boolean ligado){this.ligado = ligado;}
    private void setTocando(boolean tocando){this.tocando = tocando;}


    @Override
    public void ligar() {
        if (this.isLigado() == true){
            System.out.println("\nA Tv já está ligada!");
        }else {
            this.setLigado(true);
            System.out.println("\nA Tv foi ligada, com sucesso!");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado() == false){
            System.out.println("\nA Tv já está desligada!");
        }else {
            this.setLigado(false);
            System.out.println("\nA Tv foi desligada, com sucesso!");
        }
    }

    @Override
    public void abriMenu() {
        if (verificarLigado(this.isLigado())) {
            System.out.println("\nEstá ligado? " + isLigado());
            System.out.println("Está tocando? " + isTocando());
            System.out.println("Volume: " + getVolume());
            for (int i = 0; i < getVolume(); i++) {
                System.out.print("|");
            }
        }
    }

    @Override
    public void fechaMenu() {
        if (verificarLigado(this.isLigado())) {
            System.out.println("\nFechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (verificarLigado(this.isLigado())) {
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 5);
            } else {
                System.out.println("\nA Tv já está no volume maximo!");
            }
        }
    }

    @Override
    public void menosVolume() {
        if (verificarLigado(this.isLigado())) {
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 5);
                System.out.println("\nNo atual momento a tv ja está no mudo!");
            }
        }
    }

    @Override
    public void ligarMudo() {
        if (verificarLigado(this.isLigado())) {
            if (this.getVolume() == 0) {
                System.out.println("A Tv já esta no mudo!");
            } else {
                salvaVolume = this.getVolume();
                this.setVolume(0);
                System.out.println("\nA tv esta no mudo!");
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (verificarLigado(this.isLigado())) {
            if (this.getVolume() != 0) {
                System.out.println("A Tv já esta com volume!");
            } else {
                this.setVolume(salvaVolume);
                System.out.println("\nA Tv saiu do mudo!");
            }
        }
    }

    @Override
    public void play() {
        if (verificarLigado(this.isLigado())) {
            if (this.isTocando() == true) {
                System.out.println("A Tv já esta tocando!");
            } else {
                this.setTocando(true);
                System.out.println("\nA tv foi iniciada com sucesso!");
            }
        }
    }

    @Override
    public void pause() {
        if (verificarLigado(this.isLigado())) {
            if (this.isTocando() == false) {
                System.out.println("\nNo atual momento a tv ja está pausada!");
            } else {
                this.setTocando(false);
                System.out.println("\nA Tv foi pausada com sucesso!");
            }
        }
    }

    public boolean verificarLigado (boolean ligado){
        if (ligado == false){
            System.out.println("\nA Tv não está ligada!\n");
        }
        return ligado;
    }

}

