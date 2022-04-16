package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DatesAndTime {

    public static void main(String[] args) {

        /*CLASSES QUE FORAM SUBSTITUIDAS A PARTIR DO JAVA 8*/
        Date date = new Date();
        Calendar calendar= new GregorianCalendar();

        /*NOVAS CLASSES TIME LOCALDATETIME*/
        /*GERANDO DATA*/
        LocalDate localDate = LocalDate.now();
        System.out.println("Localdate:" + localDate);

        /*GERAR HORA*/
        LocalTime localTime = LocalTime.now();
        System.out.println("Hora:" + localTime);

        /*LOCALDATETIME DATA E HORA*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora:" + localDateTime);

        /*FORMATAÇÃO DE DATA PARA PORTUGUES BR*/
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy", new Locale("PT", "br"));

        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------+");
        System.out.println("Escolha uma Opção                  |");
        System.out.println("[1] - quero saber que dia é hoje   |");
        System.out.println("[2] - quero saber que mes  estamos |");
        System.out.println("[3] - quero saber que ano estamos  |");
        System.out.println("[4] - quero saber que horas são    |");
        System.out.println("[5] - Data completa formatada      |");
        System.out.println("-----------------------------------+");
        System.out.print("Digite a Opção:");

        int op = scan.nextInt();

        switch (op){
            case  1:
                System.out.println("Hoje é Dia: " + localDateTime.getDayOfMonth());//-> DIA
                break;
            case 2:
                System.out.println("Estamos no Mes: " + localDateTime.getMonth());//-> MÊS
                break;
            case 3:
                System.out.println("Estamos no Ano: " + localDateTime.getYear());//-> ANO
                break;
            case 4:
                System.out.println("Hora:" + localTime);
                break;
            case 5:
                System.out.println("Data Formatada: " + localDateTime.format(dateTimeFormatter));
                break;
        }


    }
}
