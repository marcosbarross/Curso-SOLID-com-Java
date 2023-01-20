package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel{

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return null;
    }
}
