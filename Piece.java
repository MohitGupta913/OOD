package chess;

public class Piece {
	public String color;
	public String name;
	public Block block;
	public Piece(String color, String name, Block b) {
		this.color = color;
		this.name = name;
		this.block = b;
	}
	
	public void move(Block nextBlock) {
		this.block = nextBlock;
	}
	
	public void cutPiece(Piece p) {
		this.block = p.block;
		p.block = null;
	}
}
