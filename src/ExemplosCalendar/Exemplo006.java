package ExemplosCalendar;

import java.util.Calendar;

public class Exemplo006 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        //formas de exibir datas
        //Usa o printf e nao o println
        System.out.printf("%tc\n", agora);
        //qui. fev. 11 18:50:24 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-02-11

        System.out.printf("%tD\n", agora);
        //02/11/21

        System.out.printf("%tr\n", agora);
        //06:50:24 PM

        System.out.printf("%tT\n", agora);
         //18:50:24
    }
}