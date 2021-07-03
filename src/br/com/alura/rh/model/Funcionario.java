package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {

	private final DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
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

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}


	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
}
