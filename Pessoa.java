//Esta á a superclasse (classe mãe) das classes Funcionario e Cliente. Ou seja, no projeto, ela possui os atributos/métodos em comum com essas classes
public class Pessoa {
    
    private String nome;
    private int CPF;
    private String dataNascimento;

    //Configuração dos atributos via método construtor
    public Pessoa(String nome, int CPF, String dataNascimento) {

        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    //Método que mostra as informações da pessoa. Ele será sobrescrito (override) nas classes filhas
    public String info() {

        return "Eu sou uma pessoa de nome " + nome + ", CPF: " + CPF + " e nasci em " + dataNascimento;
    }

    //A seguir um exemplo de sobrecarga (overload): dois métodos de mesmo nome, mas com assinaturas diferentes
    public void getLog(int numero) {

        System.out.printf("Este número é %s", (numero % 2 == 0) ? "par": "ímpar"); //condicional ternário
    }

    public void getLog(double numero1, double numero2) {

        System.out.println("A média desses números é " + (numero1+numero2)/2);
    }

    //Métodos getters para acesso dos valores dos atributos
    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }    
}
