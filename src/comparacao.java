import java.util.ArrayList;

public class comparacao {
    public static void main(String[] args) {
        listaLigada<Integer> lista = new listaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //adicionar elementos

        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        for(int i = 0; i < limite; i++) {
            vetor.add(i);
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println("---------------------------");

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial);


        // LER VALORES

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("----------------------------/n/n tempo vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()) {
            iterator.getProximo();
        }
        for(int i = 0; i < lista.getTamanho(); i++) {
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("----------------------------/n/n tempo lista");
        System.out.println(tempoFinal - tempoInicial);
    }
}
