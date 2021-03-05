package ExemplosDate;

import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1513124807691L);
        //tue Dec 12 22:26:47 BRST 2017
        Date dataNoFuturo = new Date(1613124807691L);
        //fri Feb 12 08:13:27 BRST 2021
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        //compara se as datas são iguais
        boolean isEquals = dataNoPassado.equals(mesmaDataNoFuturo);

        System.out.println(isEquals);
        //false

        //compara uma data com outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);

        System.out.println(compareCase1); //-1 data no passado
        System.out.println(compareCase2); // 1 data no futuro
        System.out.println(compareCase3); //0 datas iguais
    }
}
