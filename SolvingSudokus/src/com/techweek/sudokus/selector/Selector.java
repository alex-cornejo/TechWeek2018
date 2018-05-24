package com.techweek.sudokus.selector;

import java.util.List;

import com.techweek.sudokus.individual.Individual;

public interface Selector {
	public List<Individual> selection(List<Individual> population);
}
