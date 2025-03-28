import javax.print.DocFlavor.STRING;

public class programaListaLigada {
    public static void main(String[] args) {
        
        listaLigada<STRING> lista = new listaLigada<STRING>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " +lista.getPrimeiro().getValor());
        System.out.println("Ultimo " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

        for(int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }


        System.out.println("------------------------------------------");

        //remover estado "CE"

        lista.remover("CE");
        lista.adicionar("SP");

        lista.remover("AC");
        lista.remover("BA");
        lista.remover("DF");
        lista.remover("SP");

        for(int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}
