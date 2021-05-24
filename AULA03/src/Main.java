package AULA03.src;

import AULA03.src.Conta;

public class Main {
     public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "Murilo";
        c1.saldo = 199.99;
        c1.numero = 1234;
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.saldo = 400;
        c2.titular = "Izuku Midoriya";
        c2.visualizarSaldo();

        c1.depositar(100);
        c1.visualizarSaldo();
     }
}
