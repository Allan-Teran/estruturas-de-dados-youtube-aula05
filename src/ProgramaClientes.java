public class ProgramaClientes {
    public static void main(String[] args) {
        listaLigada<Cliente> clientes = new listaLigada<Cliente>();
        clientes.adicionar(new Cliente("123", "Jony"));
        clientes.adicionar(new Cliente("124", "Allan"));
        clientes.adicionar(new Cliente("125", "Binho"));

        for(int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }
    
}
