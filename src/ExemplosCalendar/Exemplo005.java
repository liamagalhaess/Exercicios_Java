package ExemplosCalendar;

import java.util.Calendar;

public class Exemplo005 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        System.out.println(agora.getTime());

        //menos 15 dias do dia atual
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " + agora.getTime());

        // mais 4 meses do mes atual
        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses atras: " + agora.getTime());

        //mais 2 anos do ano atual
        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos atras: " + agora.getTime());

    }
}
