package br.com.contmatic.empresa.model.easy.random.campo;

import java.util.Random;

import org.jeasy.random.api.Randomizer;

import br.com.contmatic.empresa.model.telefone.TelefoneDDD;

public class DDDEasyRandom implements Randomizer<TelefoneDDD> {
	
	@Override
	public TelefoneDDD getRandomValue() {
		return TelefoneDDD.values()[new Random().nextInt(new Random().nextInt(TelefoneDDD.values().length - 1))];
	}
	
}
