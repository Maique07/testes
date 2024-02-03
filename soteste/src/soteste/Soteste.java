package soteste;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Soteste {

    /*esse programa e so para teste*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a quantidade de numero que serão digitados");
        int vet = s.nextInt();
        int x[] = new int[vet], y[] = new int[vet];
        System.out.println("digite os " + vet + " numeros\n");
        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        System.out.println("digite mais " + vet + " numeros\n");
        for (int i = 0; i < y.length; i++) {
            y[i] = s.nextInt();
        }
        for (int z = 0; z < vet; z++) {
            for (int r = 0; r < vet; r++) {
                if (x[z] == y[r]) {
                    int a = x[z];
                    System.out.println("numero iguais " + a);
                }
            }
        }
    }

}
