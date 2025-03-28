public class ProgramaInteiros {
    public static void main(String[] args) {
        listaLigada<Integer> lista = new listaLigada<Integer>();
        lista.adicionar(1);
        lista.adicionar(3);
        lista.adicionar(5);

        for(int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}
