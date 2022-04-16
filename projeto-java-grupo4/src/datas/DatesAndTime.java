package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTime {

    public static void main(String[] args) {

        /*CLASSES QUE FORAM SUBSTITUIDAS A PARTIR DO JAVA 8*/
        Date date = new Date();
        Calendar calendar= new GregorianCalendar();

        /*NOVAS CLASSES TIME LOCALDATE TIME*/

        /*GERANDO DATA*/
        LocalDate localDate = LocalDate.now();
        System.out.println("Localdate:" + localDate);

        /*GERAR HORA*/
        LocalTime localTime = LocalTime.now();
        System.out.println("Hora:" + localTime);

        /*LOCALDATETIME DATA E HORA*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora:" + localDateTime);

        /*PEGAR SEPARADAMENTE*/
        System.out.println("Dia: " + localDateTime.getDayOfMonth());//-> DIA
        System.out.println("Mes: " + localDateTime.getMonth());//-> MÊS
        System.out.println("Ano: " + localDateTime.getYear());//-> ANO
        System.out.println("Hora: " + localDateTime.getHour());//-> HORA
        System.out.println("Minutos: " + localDateTime.getMinute());//-> MINUTOS
        System.out.println("Segundos: " + localDateTime.getSecond());//-> SEGUNDOS

    }
}
