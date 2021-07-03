package br.com.alura.rh.service;

import br.com.alura.rh.model.DadosPessoais;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    //List<ValidacaoReajuste> validacoes;

    /*public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }*/

    public void reajustarSalarioDoFuncionário(Funcionario funcionario, BigDecimal aumento){
        //this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        //Implementação com acoplamento concreto
        ValidacaoPercentualReajuste validacaoPercentualReajuste = new ValidacaoPercentualReajuste();
        validacaoPercentualReajuste.validar(funcionario, aumento);

        ValidacaoPeriocidadelReajuste validacaoPeriocidadelReajuste = new ValidacaoPeriocidadelReajuste();
        validacaoPeriocidadelReajuste.validar(funcionario, aumento);
        /*
        Veja que sempre uma nova classe que implementa uma nova regra surgir é preciso alterar a classe de serviço
        pois a classe de serviço depende de classes concretas. Ao utilizarmos a Lista de ValidacaoReajustes implementamos a
        inverção de controle, onde a classe de serviço depende uma abstração e não de um implementação concreta.
        * */


        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
