package br.com.contmatic.empresa.model.easy.random.campo;

import org.jeasy.random.api.Randomizer;
import org.joda.time.LocalDate;

public class DataEasyRandom implements Randomizer<LocalDate> {

	@Override
	public LocalDate getRandomValue() {
		return LocalDate.now();
	}

}