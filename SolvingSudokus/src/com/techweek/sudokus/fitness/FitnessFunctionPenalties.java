package com.techweek.sudokus.fitness;

import com.techweek.sudokus.individual.Individual;

public class FitnessFunctionPenalties implements FitnessFunction {

    @Override
    public float evaluate(Object object) {
        Individual individual = (Individual) object;
        int[][] board = individual.getBoard();
        float fitness = 0;
        int penaltiesInRows = penaltiesInRows(board);
        int penaltiesInColumns = penaltiesInColumns(board);
        int penaltiesInGrid = penaltiesInGrid(board);
        fitness = penaltiesInRows + penaltiesInColumns + penaltiesInGrid;
        return fitness;
    }

    public int penaltiesInRows(int[][] board) {
        int penalties = 0;
        //add code here

        return penalties;
    }

    public int penaltiesInColumns(int[][] board) {
        int penalties = 0;
        //add code here
        return penalties;
    }

    public int penaltiesInGrid(int[][] board) {
        int penalties = 0;
        //add code here
        
        return penalties;
    }

    public int penaltiesInSubBoard(int[][] board, int i, int j, int scope) {

        int penalties = 0;
        //add code here
        
        return penalties;
    }

}
