package decimalformat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


/*è uma classe que estende de number fortmat*/
public class DecimalFormatExample {



    public static void main(String[] args) {



        /*INSTACIA DE UM PRADDAO NO CASO PT BR*/
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormatSymbols.setGroupingSeparator('.');

        String padrao2 = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao2,decimalFormatSymbols);
        df.setGroupingSize(4);
        System.out.println("Numero formatado para padrao Brasileiro:" + df.format(123456789.123));

    }
}
