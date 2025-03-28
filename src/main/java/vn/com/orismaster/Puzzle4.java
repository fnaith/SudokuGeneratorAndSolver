package vn.com.orismaster;

public class Puzzle4 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_4, Form.CUSTOM_4_1, Form.CUSTOM_4_2};

    public Puzzle4(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle4(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
