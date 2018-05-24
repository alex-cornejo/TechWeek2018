package com.techweek.sudokus.operators;

import com.techweek.sudokus.individual.Individual;

public interface Crossover {
	public Individual cross(Individual parent1, Individual parent2);
}
