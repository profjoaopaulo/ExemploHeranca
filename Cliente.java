public class Cliente extends Pessoa {
 
    private double saldo;
    private boolean fidelidade;

    public Cliente(String nome, int CPF, String dataNascimento, double saldo, boolean fidelidade) {

        super(nome, CPF, dataNascimento); //construtor da classe Pessoa
        this.saldo = saldo;
        this.fidelidade = fidelidade;
    }
}
