import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAndTime {

    public static void main(String[] args) throws InterruptedException {

        // now
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // natal
        LocalDate natal = LocalDate.of(2022, Month.DECEMBER, 25);

        // meses para o natal
        int meses = natal.getMonthValue() - hoje.getMonthValue();
        System.out.println(meses);

        // meses com Period
        Period period = Period.between(hoje, natal);
        System.out.println(period.getMonths());

        // plusDays
        LocalDate anoNovo = natal.plusDays(7);
        System.out.println(anoNovo);

        // formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(anoNovo.format(formatter));

        // data e hora
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // formatter com tempo
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss");
        System.out.println(dateTime.format(formatterDateTime));

        // LocalTime
        LocalTime academia = LocalTime.now().plusHours(4);
        System.out.println(academia);

        // formatter tempo
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(academia.format(formatterTime));

        // of
        LocalTime termino = LocalTime.of(14,0);
        System.out.println(termino);

        // Instant
        Instant now = Instant.now();
        Thread.sleep(2000);
        Instant after= Instant.now();

        Duration duration = Duration.between(now, after);
        System.out.println(duration.getSeconds() + " segundos");

    }

}
