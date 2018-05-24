package com.techweek.sudokus.operators;

import java.util.Random;
import com.techweek.sudokus.fitness.FitnessFunction;
import com.techweek.sudokus.individual.Individual;

public class RowCrossover implements Crossover {

    private Random rnd;
    private FitnessFunction fitnessFunction;

    public RowCrossover(FitnessFunction fitnessFunction) {
        this.rnd = new Random();
        this.fitnessFunction = fitnessFunction;
    }

    @Override
    public Individual cross(Individual parent1, Individual parent2) {
        //add code of cross here
        return null;
    }

}
