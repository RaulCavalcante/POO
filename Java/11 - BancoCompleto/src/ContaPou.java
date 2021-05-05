public class ContaPou extends Conta{
    public ContaPou (String nome, int numero){
        this.dono = nome;
        this.numeroConta = numero;
        this.saldo = 0;
        this.tipoConta ="Conta Poupança";
    }
}
