package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private final DadosPessoais dadosPessoais;
    private String emppresa;

    public Terceirizado(DadosPessoais dadosPessoais ) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmppresa() {
        return emppresa;
    }

    public void setEmppresa(String emppresa) {
        this.emppresa = emppresa;
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public void setNome(String nome) {
        dadosPessoais.setNome(nome);
    }

    public String getCpf() {
        return dadosPessoais.getCpf();
    }

    public void setCpf(String cpf) {
        dadosPessoais.setCpf(cpf);
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

    public void setCargo(Cargo cargo) {
        dadosPessoais.setCargo(cargo);
    }

    public BigDecimal getSalario() {
        return dadosPessoais.getSalario();
    }

    public void setSalario(BigDecimal salario) {
        dadosPessoais.setSalario(salario);
    }

}
