package br.com.contmatic.empresa.model.easy.random.campo;

import org.jeasy.random.api.Randomizer;

import br.com.contmatic.empresa.model.easy.random.TelefoneEasyRandom;
import br.com.contmatic.empresa.model.telefone.Telefone;

public class ModelTelefoneEasyRandom implements Randomizer<Telefone> {

	@Override
	public Telefone getRandomValue() {
		return TelefoneEasyRandom.telefone();
	}
}
