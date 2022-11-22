public class Pessoa {
    
    private String nome;
    private int CPF;
    private String dataNascimento;

    public Pessoa(String nome, int CPF, String dataNascimento) {

        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

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
