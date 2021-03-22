public class Cliente {

    private String tipoConta;
    private int conta;
    private String dono;
    private double saldo;
    private boolean aberto;

    public void abrirConta (String dono, int conta, String tipoConta ){
        this.dono = dono;
        this.conta = conta;
        this.aberto = true;
        if (tipoConta.equalsIgnoreCase("cc")){
            this.tipoConta = tipoConta;
            this.saldo = 50.00;
        }else if ( tipoConta.equalsIgnoreCase("cp") ){
            this.tipoConta = tipoConta;
            this.saldo = 150.00;
        }
    }
    public boolean fecharConta (){

        if (this.saldo == 0){
            this.dono = null;
            this.conta = 0;
            this.aberto = false;
            this.tipoConta = null;
        }
        return this.aberto;

    }

    public void depositar( double valor ){
        if (this.conta != 0) {
            this.saldo += valor;
            System.out.println("\nValor depositado, com sucesso!");
            System.out.printf("A conta possui saldo de R$: " + this.saldo + "\n");
        }else{
            System.out.printf("\nConta não foi aberta!");
        }
    }
    public void sacar ( double valor ){
        var valorprov = this.saldo;
        if ((valorprov-valor) < 0) {
            System.out.println("\nNão foi possivel sacar!");
            System.out.println("Seu saldo atual é de R$ " + this.saldo + "\n");
        }else if (this.conta == 0) {
            System.out.printf("\nConta não foi aberta!");
        }else{
            this.saldo -= valor;
            System.out.println("\nValor sacado, com sucesso!");
            System.out.printf("A conta possui saldo de R$: "+ this.saldo);
        }
    }
    public void rendaPolpa (){
        if (this.conta != 0) {
            if (tipoConta.equalsIgnoreCase("cc")) {
                System.out.format("\nPassou o Mês e sua conta rendeu R$ %.2f \n",(this.saldo * 0.05));
                this.saldo += this.saldo * 0.05;
            } else if (tipoConta.equalsIgnoreCase("cp")) {
                //System.out.printf("\nPassou o Mês e sua conta rendeu R$ "+ (this.saldo * 0.1) + "\n");
                System.out.format("\nPassou o Mês e sua conta rendeu R$ %.2f \n",(this.saldo * 0.1));
                this.saldo += this.saldo * 0.1;
            }
        }else{
            System.out.printf("\nConta não foi aberta!\n");
        }
    }

    public void status () {
        System.out.println("\nTipo da conta: "+this.tipoConta);
        System.out.println("Conta: "+this.conta);
        System.out.println("Dono: "+this.dono);
        System.out.format("\nSaldo: %.2f \n",this.saldo);
    }


    public double getSaldo(){ return this.saldo; }


}
