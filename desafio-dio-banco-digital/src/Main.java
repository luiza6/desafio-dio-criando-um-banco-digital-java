
public class Main {
    public static void main(String[] args) {
    	Cliente maria = new Cliente();
    	maria.setNome("Maria Luiza");

        Conta cc = new ContaCorrente(maria);
        Conta poupanca = new ContaPoupanca(maria);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
