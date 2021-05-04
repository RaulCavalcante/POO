public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
    //Mamifero
        m1.setPeso(85.3);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
    //Canguru
        System.out.println();
        Canguru c1 = new Canguru();
        c1.setIdade(3);
        c1.setMembros(4);
        c1.setPeso(51.3);
        c1.locomover();
        c1.usandoBolsa();
        c1.alimentar();
        c1.emitirSom();
    //Cachorro
        System.out.println();
        Cachorro cc1 = new Cachorro();
        cc1.setIdade(1);
        cc1.setMembros(4);
        cc1.setPeso(12.5);
        cc1.abanandoRabo();
        cc1.enterrandoOsso();
        cc1.locomover();
        cc1.alimentar();
        cc1.emitirSom();
    }
}
