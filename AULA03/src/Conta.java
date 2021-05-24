package AULA03.src;

public class Conta {
    String titular;
    String Cpf;
    int numero;
    double saldo;

    public Conta(){
        
    }
    void visualizarSaldo(){
        System.out.println("Valor do saldo: R$" + this.saldo);
    }
    boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    void depositar(double valor){
        this.saldo += valor;
    }
    boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
