package Exercícios;

import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args){

        //Descobrir o TimeInMilles do dia em que eu nasci
        Long currentTimeMillis = Date.parse("1999/06/18");

        //converter em um objeto Date
        Date nascimento = new Date(currentTimeMillis);
        //System.out.println(currentTimeMillis);

        //Verificar se ele é anterior ou posterior a 15 de maio de 2010
        Long dataAleatoria = Date.parse("2010/05/15");
        Date aleatoria = new Date(dataAleatoria);



        boolean isAfter = nascimento.after(aleatoria);
        System.out.println("R: " + isAfter);

        boolean isBefore = nascimento.before(aleatoria);
        System.out.println("R: " + isBefore);


    }
}
 /**/