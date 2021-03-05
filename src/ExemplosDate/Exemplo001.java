package ExemplosDate;

import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args){

        Long currentTimeMillis = System.currentTimeMillis();
        //Date novaData = new Date();
        Date novaData = new Date(currentTimeMillis);
        //Thu Feb 11 17:36:46 BRT 2021
        System.out.println(novaData);
        //retorno: Thu Feb 11 17:23:43 BRT 2021
    }
}
