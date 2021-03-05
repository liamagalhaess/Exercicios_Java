package DatasJava8;

import java.time.LocalDate;
import java.util.Date;

public class Exercicio009 {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(hoje);
        //2021-02-11

        System.out.println(ontem);
        //2021-02-10
    }
}
