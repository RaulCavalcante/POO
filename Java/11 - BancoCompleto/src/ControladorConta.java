public interface ControladorConta {
    public abstract void sacar(double valor);

    void sacar(double valor, double valor2);

    public abstract void depositar(double valor);
    void depositar(double valor, double valor2);
    public abstract boolean transferir(int numeroConta, double valor);

    void transferir(double valor);
}
