package Desafio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numero;
        numero = leitor.nextInt();
        for (int i = 1 ; i <= numero ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
