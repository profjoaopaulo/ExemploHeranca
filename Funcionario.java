//Através da palavra reservada extends acontece a relação de Herança da classe Funcionario com a classe Pessoa
public class Funcionario extends Pessoa {
    
    private double salario;

    public Funcionario(String nome, int CPF, String dataNascimento, double salario) {

        super(nome, CPF, dataNascimento); //chamada obrigatória ao método construtor da classe Pessoa
        this.salario = salario;
    }

    //Sobrescrevendo (overriding) o método info() definido na classe Pessoa
    public String info() {

        return "Eu sou um funcionário de nome " + getNome() + ", CPF: " + getCPF() + " e nasci em " + getDataNascimento()
        + ". Ainda tenho um salário de R$ " + salario;
    }

    //Método específico na classe Funcionario
    public String funcao() {

        return "Sou um funcionário, mas não sei qual minha função (cargo)...";
    }
}
