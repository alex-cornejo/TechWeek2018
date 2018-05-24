package com.techweek.sudokus.algorithm;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import com.techweek.sudokus.fitness.FitnessFunction;
import com.techweek.sudokus.individual.Individual;
import com.techweek.sudokus.selector.Selector;

public class GeneticAlgorithm {

    private float mutationProbability;
    private int numberOfGenerations;
    private List<Individual> population;
    private Individual bestIndividual;
    private FitnessFunction fitnessFunction;
    private Selector selector;
    private Random rnd = new Random();

    public GeneticAlgorithm(float mutationProbability, int numberOfGenerations, List<Individual> population,
            FitnessFunction fitnessFunction, Selector selector) {
        this.mutationProbability = mutationProbability;
        this.numberOfGenerations = numberOfGenerations;
        this.population = population;
        this.fitnessFunction = fitnessFunction;
        this.selector = selector;
    }

    public void run() {

    }

    public void selection() {
        this.population = selector.selection(population);
    }

    public void evaluation() {
        //add evaluation code here and replace best individual
    }

    public Individual getBestIndividual() {
        return bestIndividual;
    }
}
