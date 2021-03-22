import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean loop = true;
        ControleRemoto c = new ControleRemoto();

        while (loop) {
            System.out.println("\n---/---/--- MENU ---/---/---\n1 - Ligar\n2 - Desligar\n3 - Abrir Menu" +
                    "\n4 - Fecha Menu\n5 - Mais Volume\n6 - Menos Volume\n7 - Ativar Mudo\n8 - Desativar Mudo" +
                    "\n9 - PLay\n10 - Pause\n11 - Sair do programa\n---/---/---/---/---/---/---");
            System.out.printf("Comando:");
            var comando = leitor.nextInt();
            switch (comando) {
                case 1:
                    c.ligar();
                    break;
                case 2:
                    c.desligar();
                    break;
                case 3:
                    c.abriMenu();
                    break;
                case 4:
                    c.fechaMenu();
                    break;
                case 5:
                    c.maisVolume();
                    break;
                case 6:
                    c.menosVolume();
                    break;
                case 7:
                    c.ligarMudo();
                    break;
                case 8:
                    c.desligarMudo();
                    break;
                case 9:
                    c.play();
                    break;
                case 10:
                    c.pause();
                    break;
                case 11:
                    loop = false;
                    System.out.println("Programa Finalizado!");
                    break;
            }
        }
    }
}
