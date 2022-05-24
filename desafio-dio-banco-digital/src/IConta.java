
public interface IConta {
    void sacar (double valor); //Tudo o que esta em uma interface já é publico, não faz sentido declarar como public ou outro
    void depositar (double valor);
    void transferir (double valor, Conta contaDestino);

    void imprimirExtrato();
}