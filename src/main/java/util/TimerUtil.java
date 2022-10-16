package util;

import enums.UnidadesMedidaTempoEnum;
import exceptions.TimerUtilException;

public class TimerUtil {
    public static void aguardar(UnidadesMedidaTempoEnum unidadeMedida, long segundos) throws TimerUtilException {
        int multiplicador = 1;

        switch (unidadeMedida){
            case SEGUNDOS:
                break;

            case MINUTOS:
                multiplicador = 60;
                break;
        }

        try {
            Thread.sleep(segundos * 1000 * multiplicador);
        } catch (InterruptedException e) {
            throw new TimerUtilException(unidadeMedida, segundos);
        }
    }
}
