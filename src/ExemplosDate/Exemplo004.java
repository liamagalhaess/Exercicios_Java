package ExemplosDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args){
        Date dataInicial = new Date(1513124807691L);
        System.out.println(dataInicial);
        //Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicial.toInstant();
        System.out.println(instant);
        //2017-12-13T00:26:47.691Z
    }
}
