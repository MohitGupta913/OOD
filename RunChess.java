package chess;

public class RunChess {
	public static void main(String[] args) {
		Block b1 = new Block(3, 0);
		Piece p1 = new Piece("White", "Pon", b1);
		
		Block b2 = new Block(1, 4);
		Piece p2 = new Piece("White", "Rook", b2);
		System.out.println(p1.block.getX());
		System.out.println(p1.block.getY());
		p1.cutPiece(p2);
		System.out.println(p1.block.getX());
		System.out.println(p1.block.getY());
		System.out.println(p2.block);
	}
}
