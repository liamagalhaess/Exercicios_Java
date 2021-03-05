package ExemplosDate;

import java.util.Date;

public class Exemplo002 {
    public static void main (String[] args){
        Date dataNoPassado = new Date(1513124807691L);
        //tue Dec 12 22:26:47 BRST 2017
        Date dataNoFuturo = new Date(1613124807691L);
        //fri Feb 12 08:13:27 BRST 2021

        //compara se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        //compara se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true
    }
}
