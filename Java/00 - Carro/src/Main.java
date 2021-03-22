public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Camaro", 2012, "");
        Carro carro1 = new Carro("Renault", "Kwid", 2018, "");
        System.out.println(carro.getMarca());
        carro.setMarca("Chevrolet");
        System.out.println(carro.getMarca());
        System.out.println(carro1.getMarca());
    }
}
