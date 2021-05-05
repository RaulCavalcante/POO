public class Conta implements ControladorConta{

    public String tipoConta;
    public int numeroConta;
    public String dono;
    public double saldo;

    public String getTipoConta(){return this.tipoConta;}
    public int getNumeroConta(){return this.numeroConta;}
    public String getDono(){return this.dono;}
    public double getSaldo(){return this.saldo;}

    @Override
    public void sacar(double valor) {
        var valorprov = this.saldo;
        if ((valorprov-valor) < 0) {
            System.out.println("\nNão foi possivel sacar!");
            System.out.println("Seu saldo atual é de R$ " + this.saldo + "\n");

        }else{
            this.saldo -= valor;
            System.out.println("\nValor sacado, com sucesso!");
            System.out.printf("A conta possui saldo de R$: "+ this.saldo);
        }
    }

    @Override
    public void sacar(double valor, double valor2) {
        var valorprov = this.saldo;
        if ((valorprov-(valor+valor2)) < 0) {
            System.out.println("\nNão foi possivel sacar!");
            System.out.println("Seu saldo atual é de R$ " + this.saldo + "\n");

        }else{
            this.saldo -= (valor+valor2);
            System.out.println("\nValor sacado, com sucesso!");
            System.out.printf("A conta possui saldo de R$: "+ this.saldo);
        }
    }

    @Override
    public void depositar(double valor) {
            this.saldo += valor;
            System.out.println("\nValor depositado, com sucesso!");
            System.out.printf("A conta possui saldo de R$: " + this.saldo + "\n");
    }
    @Override
    public void depositar(double valor,double valor2) {
        this.saldo += (valor+valor2);
        System.out.println("\nValor depositado, com sucesso!");
        System.out.printf("A conta possui saldo de R$: " + this.saldo + "\n");
    }

    @Override
    public boolean transferir(int numeroConta, double valor) {
        var valorprov = this.saldo;
        if ((valorprov-valor) < 0) {
            System.out.println("\nNão foi possivel transferir!");
            System.out.println("Seu saldo atual é de R$ " + this.saldo + "\n");
            return false;
        }else{
            this.saldo -= valor;
            System.out.println("\nValor transferido, com sucesso!");
            System.out.printf("A conta possui saldo de R$: "+ this.saldo);
            return true;
        }
    }
    @Override
    public void transferir(double valor) {
        this.saldo += valor;
    }
}
