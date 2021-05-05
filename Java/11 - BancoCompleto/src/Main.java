import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean loop = true;
        boolean verif = false;
        int tipoConta=0;
        double valor;
        int numeroCont = 0;
        int quantidade = 0;
        boolean logado = false;
        int numerologado = 0;
        int numeroContaT = 0;
        ArrayList<Conta> listaDeContas = new ArrayList<>();

        while (loop) {
            System.out.println("\n---/---/--- MENU ---/---/---\n1 - Abrir conta\n2 - Status\n3 - Logar na conta\n4 - Sacar\n5 - Depositar\n6 - Transferir\n7 - Sair do Programa\n---/---/---/---/---/---/---");
            System.out.printf("Comando:");
            int comando = leitor.nextInt();
                switch (comando) {
                    case 1:
                        System.out.printf("Nome do cliente:");
                        String nome = leitor.next();
                        System.out.printf("1-Conta Poupança\t2-Conta Corrente\nComando:");
                        tipoConta = leitor.nextInt();
                        if (tipoConta == 1) {
                            for(int i=0;i<listaDeContas.size();i++){
                                if(listaDeContas.get(i).getTipoConta().equalsIgnoreCase("Conta Poupança")&&listaDeContas.get(i).getDono().equalsIgnoreCase(nome)){
                                    verif = true;
                                }
                            }
                            if (verif){
                                System.out.println("O Nome já esta cadastrado na Conta Poupança");
                                break;
                            }
                            Conta criandoContaP = new ContaPou(nome, listaDeContas.size());
                            listaDeContas.add(criandoContaP);
                            System.out.println("Conta Poupança criada com sucesso!");
                        }
                        if (tipoConta == 2){
                            for(int i=0;i<listaDeContas.size();i++){
                                if(listaDeContas.get(i).getTipoConta().equalsIgnoreCase("Conta Corrente")&&listaDeContas.get(i).getDono().equalsIgnoreCase(nome)){
                                    verif = true;
                                }
                            }
                            if (verif){
                                System.out.println("O Nome já esta cadastrado na Conta Corrente");
                                break;
                            }
                            Conta criandoContaC = new ContaCor(nome,listaDeContas.size());
                            listaDeContas.add(criandoContaC);
                            System.out.println("Conta Corrente criada com sucesso!");
                        }
                        verif = false;
                        break;
                    case 2:
                        System.out.printf("1-Todos\t2-Todos da Conta Corrente\n3-Todos da Conta Poupança\t4-Filtro por nome\nComando:");
                        tipoConta = leitor.nextInt();
                        if (tipoConta==1){
                            for(int i=0;i<listaDeContas.size();i++){
                            System.out.println("-----///-----///------///----");
                            System.out.println("Tipo da Conta:"+listaDeContas.get(i).getTipoConta());
                            System.out.println("Conta:"+listaDeContas.get(i).getNumeroConta());
                            System.out.println("Nome:"+listaDeContas.get(i).getDono());
                            System.out.println("Saldo:"+listaDeContas.get(i).getSaldo());
                        }
                        }else if (tipoConta==2){
                            for(int i=0;i<listaDeContas.size();i++){
                                if(listaDeContas.get(i).tipoConta.equalsIgnoreCase("Conta Corrente")){
                                System.out.println("-----///-----///------///----");
                                System.out.println("Tipo da Conta:"+listaDeContas.get(i).getTipoConta());
                                System.out.println("Conta:"+listaDeContas.get(i).getNumeroConta());
                                System.out.println("Nome:"+listaDeContas.get(i).getDono());
                                System.out.println("Saldo:"+listaDeContas.get(i).getSaldo());
                                }
                            }
                        }else if (tipoConta==3){
                            for(int i=0;i<listaDeContas.size();i++){
                                if(listaDeContas.get(i).tipoConta.equalsIgnoreCase("Conta Poupança")){
                                    System.out.println("-----///-----///------///----");
                                    System.out.println("Tipo da Conta:"+listaDeContas.get(i).getTipoConta());
                                    System.out.println("Conta:"+listaDeContas.get(i).getNumeroConta());
                                    System.out.println("Nome:"+listaDeContas.get(i).getDono());
                                    System.out.println("Saldo:"+listaDeContas.get(i).getSaldo());
                                }
                            }
                        }else{
                            System.out.printf("Nome do cliente:");
                            nome = leitor.next();
                            for(int i=0;i<listaDeContas.size();i++){
                                if(listaDeContas.get(i).getDono().equalsIgnoreCase(nome)){
                                    System.out.println("-----///-----///------///----");
                                    System.out.println("Tipo da Conta:"+listaDeContas.get(i).getTipoConta());
                                    System.out.println("Conta:"+listaDeContas.get(i).getNumeroConta());
                                    System.out.println("Nome:"+listaDeContas.get(i).getDono());
                                    System.out.println("Saldo:"+listaDeContas.get(i).getSaldo());
                                }
                            }
                        }
                        break;
                    case 3:
                        if(logado == true){
                            System.out.println("Você ja esta logado em uma conta, deseja logar em outra?\n1-Sim\t2-Não\nComando:");
                            tipoConta = leitor.nextInt();
                            if(tipoConta==2){
                                break;
                            }
                        }
                        System.out.printf("1-Nome\t2-Numero da Conta\nComando:");
                        tipoConta = leitor.nextInt();
                        if(tipoConta==1) {
                            System.out.printf("Nome do cliente:");
                            nome = leitor.next();
                            for (int i = 0; i < listaDeContas.size(); i++) {
                                if (listaDeContas.get(i).getDono().equalsIgnoreCase(nome)) {
                                    quantidade++;
                                }
                            }
                            if (quantidade > 1) {
                                quantidade = 0;
                                System.out.printf("O nome informado possui 2 contas cadastrada, em qual delas deseja entrar?\n1-Conta Poupança\t2-Conta Corrente\nComando:");
                                tipoConta = leitor.nextInt();
                                if (tipoConta == 1) {
                                    for (int i = 0; i < listaDeContas.size(); i++) {
                                        if (listaDeContas.get(i).getDono().equalsIgnoreCase(nome) && listaDeContas.get(i).getTipoConta().equalsIgnoreCase("Conta Poupança")) {
                                            numerologado = i;
                                            logado = true;
                                        }
                                    }
                                }
                            }
                        }else{
                            System.out.printf("Numero da Conta:");
                            numeroCont = leitor.nextInt();
                            for (int i = 0; i < listaDeContas.size(); i++) {
                                if (listaDeContas.get(i).getNumeroConta() == numeroCont){
                                    logado = true;
                                    numerologado = i;
                                }
                            }
                        }
                        break;
                    case 4:
                        if (logado){
                            System.out.printf("Valor que deseja sacar:");
                            valor = leitor.nextDouble();
                            listaDeContas.get(numerologado).sacar(valor);
                        }else {
                            System.out.println("Você não esta logado em nenhuma conta!");
                        }
                        break;
                    case 5:
                        if (logado){
                            System.out.printf("Valor que deseja depositar:");
                            valor = leitor.nextDouble();
                            listaDeContas.get(numerologado).depositar(valor);
                        }else {
                            System.out.println("Você não esta logado em nenhuma conta!");
                        }
                        break;
                    case 6:
                        if (logado){
                            System.out.printf("Numero da conta:");
                            numeroContaT = leitor.nextInt();
                            System.out.printf("Valor que deseja transferir:");
                            valor = leitor.nextDouble();
                            if(listaDeContas.get(numerologado).transferir(numeroContaT,valor)){
                                listaDeContas.get(numeroContaT).transferir(valor);
                            }
                        }else {
                            System.out.println("Você não esta logado em nenhuma conta!");
                        }
                        break;
                    case 7:
                        loop = false;
                        System.out.println("Programa Finalizado!");
                        break;
                }
            }
        }
}
