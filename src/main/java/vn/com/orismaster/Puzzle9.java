package vn.com.orismaster;

public class Puzzle9 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_9};

    public Puzzle9(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle9(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
