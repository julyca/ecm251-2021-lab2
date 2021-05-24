package array_test_drive;

import models.Conta;

public class ArrayTestDrive {
    public static void main(String[] args) throws Exception {
        int numeros[] = { 14, 67, 68, 96 };

        for (int i : numeros) {
            System.out.println(i);
        }

        // Array para objetos
        Conta[] contas = new Conta[]{
            new Conta(15),
            new Conta(89),
            new Conta(),
            null,
            new Conta(988)
        };

        System.out.println("Passa pelas contas");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

    }
}
