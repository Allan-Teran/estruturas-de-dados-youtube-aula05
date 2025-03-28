import java.util.Scanner;

public class buscaLinear {
    public static void main(String[] args) throws Exception {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i = 0; i < estados.length; i++) {
            System.out.println(estados[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sigla de estado vc quer buscar?");
        String siglaBusca = leitor.nextLine();


        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if(elemento.equals(siglaBusca)) {
                encontrou = true;
                break;
            }
        }
        if(encontrou == true) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }
    }
}
