import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean loop = true;
        double valor;

        Cliente cliente = new Cliente();

        while (loop) {
            System.out.println("\n---/---/--- MENU ---/---/---\n1 - Abrir conta\n2 - Fechar conta\n3 - Sacar" +
                    "\n4 - Depositar\n5 - Rendar do Mês\n6 - Status\n7 - Sair\n---/---/---/---/---/---/---");
            System.out.printf("Comando:");
            var comando = leitor.nextInt();
            switch (comando) {
                case 1:
                    System.out.printf("Nome do cliente:");
                    String nome = leitor.next();
                    cliente.abrirConta(nome,001,"cc");
                    break;
                case 2:
                    if (cliente.fecharConta()){
                        System.out.printf("\nA conta possui saldo de R$: "+ cliente.getSaldo() + "\nPara fechar precisa zerar seu saldo!\n");
                    }else{
                        System.out.printf("\nConta fechada com Sucesso!\n");
                    }
                    break;
                case 3:
                    System.out.printf("Valor que deseja sacar:");
                    valor = leitor.nextDouble();
                    cliente.sacar(valor);
                    break;
                case 4:
                    System.out.printf("Valor que deseja sacar:");
                    valor = leitor.nextDouble();
                    cliente.depositar(valor);
                    break;
                case 5:
                    cliente.rendaPolpa();
                    break;
                case 6:
                    cliente.status();
                    break;
                case 7:
                    loop = false;
                    System.out.println("Programa Finalizado!");
                    break;
            }
        }
    }
}
