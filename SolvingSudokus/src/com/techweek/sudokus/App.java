package com.techweek.sudokus;

import java.util.List;

import com.techweek.sudokus.algorithm.GeneticAlgorithm;
import com.techweek.sudokus.fitness.FitnessFunction;
import com.techweek.sudokus.fitness.FitnessFunctionPenalties;
import com.techweek.sudokus.individual.Individual;
import com.techweek.sudokus.operators.Crossover;
import com.techweek.sudokus.operators.Generator;
import com.techweek.sudokus.operators.RowCrossover;
import com.techweek.sudokus.selector.Selector;
import com.techweek.sudokus.selector.Vasconcelos;
import com.techweek.sudokus.util.SudokuUtil;

public class App {

	private static void printDemoSudoku() {
		System.out.println(Individual.print(SudokuUtil.BOARD3));
		Generator generator = new Generator();
		List<Individual> population = generator.createPopulation(SudokuUtil.BOARD3, 2);
		for (Individual individual : population) {
			System.out.println("\n");
			System.out.println(individual);
		}
	}

	public static void main(String[] args) {
		
		printDemoSudoku();
		
		
		
		 // conf params
//		 int sizePopulation = 500;
//		 int numberOfGenerations = 1500;
//		 float mutationProbability = 0f;
//		
//		 Generator generator = new Generator();
//		 List<Individual> population = generator.createPopulation(SudokuUtil.BOARD3,
//		 sizePopulation);
//
//		 FitnessFunction fitnessFunction = new FitnessFunctionPenalties();
//		
//		 Crossover crossover = new RowCrossover(fitnessFunction);
//		
//		 Selector vasconcelos = new Vasconcelos(crossover);
//		
//		 GeneticAlgorithm ga = new GeneticAlgorithm(mutationProbability,
//		 numberOfGenerations, population, fitnessFunction, vasconcelos);
//		 ga.run();
//		
//		 System.out.println("\n");
//		 System.out.println(ga.getBestIndividual());

	}
}
