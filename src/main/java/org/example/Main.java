package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente Tiago = new Cliente();
        Tiago.setNome("Tiago");

        Conta cc = new ContaCorrente(Tiago);
        Conta cp = new ContaPoupanca(Tiago);

        cc.depositar(100);
        cp.depositar(60);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
    }
}
