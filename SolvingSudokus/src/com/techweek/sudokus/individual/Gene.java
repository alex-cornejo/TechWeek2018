package com.techweek.sudokus.individual;

import com.techweek.sudokus.util.SudokuUtil;

public class Gene {
	private Cell[] cells;

	public Gene() {
		this.cells = new Cell[SudokuUtil.SIZE];
	}

	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}
}
