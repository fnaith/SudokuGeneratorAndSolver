package vn.com.orismaster;

public class Puzzle6 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_6, Form.CUSTOM_6_1, Form.CUSTOM_6_2};

    public Puzzle6(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle6(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
