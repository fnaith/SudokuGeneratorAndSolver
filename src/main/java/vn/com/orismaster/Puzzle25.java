package vn.com.orismaster;

public class Puzzle25 extends Puzzle {
    public Puzzle25(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle25(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
