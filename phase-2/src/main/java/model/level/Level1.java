package model.level;

import model.*;
import model.adapter.*;
import model.level.*;

public class Level1 extends MoveBasedLevel {

	public Level1() {
		// TODO Auto-generated constructor stub
		String[][] boardShape = {
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "StripedLokum", "StripedLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum", "NormalLokum"},
				{"NormalLokum", "NormalLokum", "NormalLokum", "StripedLokum", "StripedLokum", "NormalLokum", "NormalLokum", "NormalLokum"}
		};
		this.boardShape = boardShape;
		Board board = new Board(430, 430, boardShape);
		this.gamePlay = new GamePlay(board, this);
		remainingMove = 10;
		goalScore = 5000;
		AdapterManager.getInstance().newGame();
	}

}
