public class Main {
    public static void main(String[] args) {

        Lutador c = new Lutador("Raul",78,1,0,2);
        c.status();
        Lutador c1 = new Lutador("Arthur",80,0,1,2);
        c1.status();

        Luta luta1 = new Luta();

        luta1.marcaLutar(c,c);
        luta1.lutar();

        luta1.marcaLutar(c,c1);
        luta1.lutar();

        c.status();
        c1.status();


    }
}
