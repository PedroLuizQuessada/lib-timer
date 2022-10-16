package exceptions;

import enums.UnidadesMedidaTempoEnum;

public class TimerUtilException extends Exception {
    public TimerUtilException(UnidadesMedidaTempoEnum unidadeMedida, long quantidadeTempo) {
        super(String.format("Falha ao aguardar %s %s", quantidadeTempo, unidadeMedida));
    }
}
