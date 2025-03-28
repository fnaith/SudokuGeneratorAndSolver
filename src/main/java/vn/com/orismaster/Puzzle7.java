package vn.com.orismaster;

public class Puzzle7 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CUSTOM_7_1, Form.CUSTOM_7_2, Form.CUSTOM_7_3, Form.CUSTOM_7_4, Form.CUSTOM_7_5};

    public Puzzle7(Form form) {
        super(form);
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle7(form);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
