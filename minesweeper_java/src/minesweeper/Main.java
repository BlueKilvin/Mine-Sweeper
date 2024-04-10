package minesweeper;

import minesweeper.model.cells.InheritanceCellFactory;
import minesweeper.view.MineFieldFrame;


public class Main {

	public static void main(String[] args) {
		new MineFieldFrame(new InheritanceCellFactory()).setVisible(true);
	}
}