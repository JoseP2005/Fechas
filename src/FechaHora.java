// Importamos las clases necesarias
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechaHora {

    public static void main(String[] args) {
        // Creamos un objeto LocalDateTime con la fecha y hora actual local
        LocalDateTime ahora = LocalDateTime.now();
        // Creamos un objeto DateTimeFormatter con el formato de España
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Mostramos la fecha y hora actual local con el formato deseado
        System.out.println("1. La fecha actual local es: " + ahora.format(formato));

        // Creamos un objeto ZoneId con la zona horaria de Caracas
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        // Creamos un objeto LocalDateTime con la fecha y hora actual en Caracas
        LocalDateTime ahoraCaracas = LocalDateTime.now(zonaCaracas);
        // Mostramos la fecha y hora actual en Caracas con el mismo formato
        System.out.println("2. La fecha actual en Caracas es: " + ahoraCaracas.format(formato));

        // Creamos un objeto LocalDateTime con la fecha del descubrimiento de América (12 de octubre de 1492)
        LocalDateTime descubrimiento = LocalDateTime.of(1492, 10, 12, 0, 0);
        // Calculamos los años transcurridos desde el descubrimiento hasta ahora usando el método between de ChronoUnit
        long años = ChronoUnit.YEARS.between(descubrimiento, ahora);
        // Mostramos los años transcurridos
        System.out.println("3. Los años transcurridos desde el descubrimiento de América son: " + años);

        // Mostramos la hora actual local usando el método getHour de LocalDateTime
        System.out.println("4. La hora actual local es: " + ahora.getHour() + ":" + ahora.getMinute() + ":" + ahora.getSecond());

        // Mostramos la hora actual en Caracas usando el mismo método
        System.out.println("5. La hora actual en Caracas es: " + ahoraCaracas.getHour() + ":" + ahoraCaracas.getMinute() + ":" + ahoraCaracas.getSecond());

        // Calculamos las horas de diferencia entre Madrid y Caracas usando el método getOffset de ZoneId
        int diferencia = zonaCaracas.getRules().getOffset(ahora).getTotalSeconds() / 3600;
        // Mostramos la diferencia horaria
        System.out.println("6. Las horas de diferencia entre Madrid y Caracas son: " + diferencia);

        // Creamos un objeto LocalDateTime con la fecha y la hora cuando Neil Armstrong pisó la luna (21 de julio de 1969 a las 3:56 hora de Madrid)
        LocalDateTime luna = LocalDateTime.of(1969, 7, 21, 3, 56);
        // Mostramos la fecha y la hora con el formato deseado
        System.out.println("7. La fecha y la hora cuando Neil Armstrong pisó la luna son: " + luna.format(formato));
    }
}