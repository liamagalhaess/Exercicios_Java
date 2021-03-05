package DateFormat;

import java.util.Date;
import java.text.DateFormat;

public class Exemplo007 {
    public static void main(String[] args){
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        //11/02/2021 19:22

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        //11 de fevereiro de 2021 19:22

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        //11 de fevereiro de 2021 19:26:17 BRT
    }
}