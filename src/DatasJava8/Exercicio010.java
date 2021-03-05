package DatasJava8;

import java.time.LocalTime;

public class Exercicio010 {
    public static void main(String[] args){
        LocalTime hoje = LocalTime.now();

        LocalTime ontem = hoje.minusHours(1);
        System.out.println(hoje);
        //2021-02-11

        System.out.println(ontem);
        //2021-02-10
    }
}
