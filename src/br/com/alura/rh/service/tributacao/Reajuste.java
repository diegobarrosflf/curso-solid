package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

    BigDecimal valor();
    BigDecimal impostoDeRenda();
    LocalDate data();


}
