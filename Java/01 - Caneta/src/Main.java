import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean loop = true;

        Caneta caneta = new Caneta("Bic","Azul",0.7,5,true );

        while (loop) {
            menu();
            var comando = leitor.nextInt();
            switch (comando){
                case 1:
                    caneta.escrever();
                    break;
                case 2:
                    caneta.destampar();
                    break;
                case 3:
                    caneta.tampar();
                    break;
                case 4:
                    caneta.status();
                    break;
                case 5:
                    loop = false;
                    System.out.println("Programa Finalizado!");
                    break;
            }
        }
    }
    public static void menu () {
        System.out.println(" ---/---/--- MENU ---/---/--- ");
        System.out.println(" 1 - Escrever ");
        System.out.println(" 2 - Destampar ");
        System.out.println(" 3 - Tampar ");
        System.out.println(" 4 - Status ");
        System.out.println(" 5 - Sair ");
    }

}
