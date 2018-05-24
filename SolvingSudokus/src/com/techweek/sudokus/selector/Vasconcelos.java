package com.techweek.sudokus.selector;

import java.util.ArrayList;
import java.util.List;
import com.techweek.sudokus.individual.Individual;
import com.techweek.sudokus.operators.Crossover;

public class Vasconcelos implements Selector {

    private Crossover crossover;

    public Vasconcelos(Crossover crossover) {
        this.crossover = crossover;
    }

    @Override
    public List<Individual> selection(List<Individual> population) {
        List<Individual> newPopulation = new ArrayList<>(population.size());
        //add code to generate new population here
        
        return newPopulation;
    }

}
