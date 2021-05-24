package linked_list_test_drive;

import java.util.Arrays;
import java.util.LinkedList;

import models.Pessoa;
import models.Conta;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Midoriya", "001"));
        pessoas.add(new Pessoa("Bakugo", "002"));
        pessoas.add(new Pessoa("Todoroki", "003"));
        pessoas.add(0, new Pessoa("Uraraka", "004"));
        pessoas.addFirst(new Pessoa("All Might", "000"));

        System.out.println("Pessoas:");
        pessoas.forEach(p -> System.out.println(p));

        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(10), new Conta(20), new Conta(25)));
    }
}
