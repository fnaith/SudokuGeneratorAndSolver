package vn.com.orismaster;

public class Puzzle12 extends Puzzle {
    public Puzzle12(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle12(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
