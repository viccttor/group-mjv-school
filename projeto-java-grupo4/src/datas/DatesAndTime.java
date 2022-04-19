package datas;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author diegocardosodev
 * @version 1.0
 */
public class DatesAndTime {

    public static void main(String[] args) {

        /*CLASSES QUE FORAM SUBSTITUIDAS A PARTIR DO JAVA 8*/
        Date date = new Date();
        Calendar calendar= new GregorianCalendar();

        /*NOVAS CLASSES TIME LOCALDATETIME*/
        /*GERANDO DATA*/
        LocalDate localDate = LocalDate.now();
        System.out.println("Localdate:" + localDate);

        LocalDate dt = LocalDate.of(1990, Month.MAY, 8);
        System.out.println("Meu Aniversário: " + dt);

        /*GERAR HORA*/
        LocalTime localTime = LocalTime.now().minusHours(1);
        System.out.println("Hora:" + localTime);

        /*LOCALDATETIME DATA E HORA*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora:" + localDateTime);

        /*FORMATAÇÃO DE DATA PADRÃO PORTUGUES BR*/
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("PT", "br"));

        /*LOCAZIZACAO*/
        ZonedDateTime zonedDateTime = java.time.ZonedDateTime
                .of(localDate,localTime, ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e Hora com A Localização: " + zonedDateTime);



        /*O MENU VAI RODAR ATÉ QUE RUN SEJA TRUE OPCAO [0] MENU TORNA FALSE E SAI*/
        boolean run = true;

        /*inicio do while*/
        while (run) {
            System.out.println("-------------------------------------+");
            System.out.println("Escolha uma Opção                    |");
            System.out.println("[1] - Quero saber que dia é hoje     |");
            System.out.println("[2] - Quero saber que mes  estamos   |");
            System.out.println("[3] - Quero saber que ano estamos    |");
            System.out.println("[4] - Quero saber que horas são      |");
            System.out.println("[5] - Exibir Data completa Formatada |");
            System.out.println("[0] - SAIR                           |");
            System.out.println("-------------------------------------+");
            System.out.print("Digite a Opção: ");


            Scanner scan = new Scanner(System.in);
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("-----------------------------------+");
                    System.out.println("Hoje é Dia: " + localDateTime.getDayOfMonth());//-> DIA
                    break;
                case 2:
                    System.out.println("-----------------------------------+");
                    System.out.println("Estamos no Mes: " + localDateTime.getMonth());//-> MÊS
                    break;
                case 3:
                    System.out.println("-----------------------------------+");
                    System.out.println("Estamos no Ano: " + localDateTime.getYear());//-> ANO
                    break;
                case 4:
                    System.out.println("-----------------------------------+");
                    System.out.println("Hora:" + localTime);
                    break;
                case 5:
                    System.out.println("-----------------------------------+");
                    System.out.println("Data Formatada: " + localDateTime.format(dateTimeFormatter));
                    break;
                case 0:
                    System.out.println("saindo...");
                    run = false;//SAI DO MENU DE OPÇOES
            }
        }
        /*fim do while*/


    }
}
