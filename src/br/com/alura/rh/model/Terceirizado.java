package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario{

    private String emppresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    public String getEmppresa() {
        return emppresa;
    }

    public void setEmppresa(String emppresa) {
        this.emppresa = emppresa;
    }
}
