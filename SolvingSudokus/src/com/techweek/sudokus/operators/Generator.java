package com.techweek.sudokus.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import com.techweek.sudokus.individual.Cell;
import com.techweek.sudokus.individual.Individual;

public class Generator {
	public List<Individual> createPopulation(int[][] board, int size) {
		List<Individual> population = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			population.add(this.createIndividual(board));
		}
		return population;
	}

	private Individual createIndividual(int[][] board) {
		LinkedList<Integer> changes = new LinkedList<>();
		LinkedList<Integer> inputs = new LinkedList<>();
		Random rnd = new Random();
		Individual individual = new Individual();
		for (int i = 0; i < board.length; i++) {
			changes.clear();
			inputs.clear();
			for (int j = 0; j < board.length; j++) {
				changes.add(j + 1);
				if (board[i][j] != 0) {
					inputs.add(board[i][j]);
				}
			}
			changes.removeAll(inputs);
			for (int j = 0; j < board.length; j++) {
				Cell cell = null;
				if (board[i][j] == 0) {
					int pos = rnd.nextInt(changes.size());
					int value = changes.remove(pos);

					cell = new Cell(value, false);

				} else {
					cell = new Cell(board[i][j], true);
				}
				individual.getGenes()[i].getCells()[j] = cell;
			}
		}
		return individual;
	}

}
