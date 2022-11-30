public class Main {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("JP", 999, "01/01/2000", 100000);
        Cliente cliente = new Cliente("Claudina", 555, "01/01/2000", 1000, true);
        Pessoa pessoa = new Pessoa("Beltrano", 222, "01/01/2000");

        //Com declaração como Pessoa e mesmo intanciando como Funcionario (e ainda assim se faz uso do construtor da classe Funcionário), não se terá acesso aos métodos específicos da classe Funcionario
        Pessoa pessoaFunc = new Funcionario("Fulano", 111, "01/02/1900", 1000000);
	
        //Testando os métodos dos objetos instanciados...
        System.out.println(funcionario.info()); //método info() sobrescrito na classe Funcionario
        System.out.println(funcionario.funcao()); //chamada ao método específico na classe Funcionario

        System.out.println(cliente.info()); //método info() sobrescrito na classe Cliente
        System.out.println(cliente.comprar()); //chamada ao método específico na classe Cliente

        System.out.println(pessoa.info()); //método info() original definido na classe Pessoa
        pessoa.getLog(777); //uso da versão do método getLog() com argumento inteiro
        System.out.println(); //só pra pular uma linha na saída
        pessoa.getLog(15, 29); //uso da versão do método getLog() com argumentos double

        System.out.println(pessoaFunc.info()); //Mesmo declarando como Pessoa, se instanciou como Funcionario, chama-se a versão do método info() sobrescrita na classe Funcionario
        //Lembrando que não se tem acesso ao método específico na classe Funcionario, dado que se declarou como Pessoa: pessoaFunc.funcao() não será possível
    }
    
}
