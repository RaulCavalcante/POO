public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("Aula de POO");
        System.out.println(v1.toString());
        Gafanhoto g1 = new Gafanhoto("Raul","M",22,"Raulxdd99");
        System.out.println(g1.toString());
        Gafanhoto g2 = new Gafanhoto("Pedro","M",22,"Pedro99");

        Visualizacao vis = new Visualizacao(g1,v1);
        vis.avaliar();
        Visualizacao vis1 = new Visualizacao(g2,v1);
        vis1.avaliar(4);
        System.out.println(vis.toString());
        System.out.println(vis1.toString());
        System.out.println(v1.toString());



    }
}
