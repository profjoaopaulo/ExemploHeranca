public class Funcionario extends Pessoa {
    
    private double salario;

    public Funcionario(String nome, int CPF, String dataNascimento, double salario) {

        super(nome, CPF, dataNascimento); //construtor da classe Pessoa
        this.salario = salario;
    }

}
