package br.com.contmatic.empresa.model.easy.random.campo;

import java.util.Random;

import org.jeasy.random.api.Randomizer;

public class IdadeEasyRandom implements Randomizer<Integer> {

	@Override
	public Integer getRandomValue() {

		return new Random().nextInt(40) + 18;
	}

}
