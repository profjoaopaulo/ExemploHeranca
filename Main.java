public class Main {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("JP", 999, "01/01/2000", 100000);
        Cliente cliente = new Cliente("Claudina", 55, "01/01/2000", 1000, true);

        System.out.println( funcionario.getNome() );
        System.out.println( cliente.getNome() );
    }
    
}
