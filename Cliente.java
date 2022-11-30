//Através da palavra reservada extends acontece a relação de Herança da classe Cliente com a classe Pessoa
public class Cliente extends Pessoa {
 
    private double saldo;
    private boolean fidelidade;

    public Cliente(String nome, int CPF, String dataNascimento, double saldo, boolean fidelidade) {

        super(nome, CPF, dataNascimento); //construtor da classe Pessoa (chamada obrigatória, já que foi definido na classe Pessoa)
        this.saldo = saldo;
        this.fidelidade = fidelidade;
    }

    //Sobrescrevendo (overriding) o método info() definido na classe Pessoa
    public String info() {

        return "Eu sou um cliente de nome " + getNome() + ", CPF: " + getCPF() + " e nasci em " + getDataNascimento()
        + ". Na loja tenho um saldo de R$ " + saldo + " e sou um " + ((fidelidade)?"bom":"mal") + " cliente!";
    }

    //Método específico na classe Cliente
    public String comprar() {

        return "Hora de ir ao shopping...";
    }
}
