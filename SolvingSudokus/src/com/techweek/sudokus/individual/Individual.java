package com.techweek.sudokus.individual;

import com.techweek.sudokus.util.SudokuUtil;

public class Individual {
	private Gene[] genes;
	private float fitness;
	private float score;
	private float scoreAcu;
	private boolean elite;

	public Individual() {
		this.genes = new Gene[SudokuUtil.SIZE];
		for (int i = 0; i < this.genes.length; i++) {
			this.genes[i] = new Gene();
		}
	}

	public Gene[] getGenes() {
		return genes;
	}

	public void setGenes(Gene[] genes) {
		this.genes = genes;
	}

	public float getFitness() {
		return fitness;
	}

	public void setFitness(float fitness) {
		this.fitness = fitness;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public float getScoreAcu() {
		return scoreAcu;
	}

	public void setScoreAcu(float scoreAcu) {
		this.scoreAcu = scoreAcu;
	}

	public boolean isElite() {
		return elite;
	}

	public void setElite(boolean elite) {
		this.elite = elite;
	}

	@Override
	public String toString() {
		return print(getBoard());
	}

	public static String print(int[][] board) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (j > 0 && (j + 1) % 3 == 0 && j < board.length - 1) {
					sb.append(board[i][j] + "|");
				} else {
					sb.append(board[i][j] + " ");
				}
			}

			if ((i + 1) % 3 == 0 && i < board.length - 1) {
				sb.append("\n-----------------\n");
			} else {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	public int[][] getBoard() {
		int[][] board = new int[SudokuUtil.SIZE][SudokuUtil.SIZE];
		for (int i = 0; i < board.length; i++) {
			Gene gene = this.genes[i];
			int[] row = new int[SudokuUtil.SIZE];
			for (int j = 0; j < row.length; j++) {
				row[j] = gene.getCells()[j].getValue();
			}
			board[i] = row;
		}
		return board;
	}
}
