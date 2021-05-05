public class ContaCor extends Conta{
    public ContaCor(String nome, int numero){
        this.dono = nome;
        this.numeroConta = numero;
        this.saldo = 0;
        this.tipoConta="Conta Corrente";
    }
}
