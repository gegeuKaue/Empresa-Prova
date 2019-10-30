package br.com.contmatic.empresa.model.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.contmatic.empresa.model.empresa.EmpresaTest;
import br.com.contmatic.empresa.model.empresa.FuncionarioTest;
import br.com.contmatic.empresa.model.endereco.CidadeTest;
import br.com.contmatic.empresa.model.endereco.EnderecoTest;
import br.com.contmatic.empresa.model.endereco.EstadoTest;
import br.com.contmatic.empresa.model.telefone.TelefoneDDDTest;
import br.com.contmatic.empresa.model.telefone.TelefoneTest;

@RunWith(Suite.class)
@SuiteClasses({ EmpresaTest.class, FuncionarioTest.class, TelefoneTest.class, EnderecoTest.class, EstadoTest.class,
		TelefoneDDDTest.class, CidadeTest.class })
public class TestRunners {

}
