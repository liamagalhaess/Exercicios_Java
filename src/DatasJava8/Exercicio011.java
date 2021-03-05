package DatasJava8;

import java.time.LocalDateTime;
//import java.time.LocalTime;

public class Exercicio011 {
    public static void main(String[] args){
        LocalDateTime hoje = LocalDateTime.now();

        LocalDateTime ontem = hoje.minusHours(1);
        System.out.println(hoje);
        //2021-02-11

        System.out.println(ontem);
        //2021-02-10
    }
}
