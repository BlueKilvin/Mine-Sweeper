package minesweeper.model;

public interface GameStateListener {

	public void mineHit(MineField mineField, int x, int y);

	public void foundAllMines(MineField mineField);
	
}