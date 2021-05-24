package models;

/**
 * Modelo utilizado para representar uma pessoa com
 * nome e cpf
 */
public class Pessoa {
    final public String nome;
    final public String cpf;

    /**
     * Devolve o estado do objeto
     * @param nome Nome do individuo
     * @param cpf CPF do individuo
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
