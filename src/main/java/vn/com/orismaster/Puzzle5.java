package vn.com.orismaster;

public class Puzzle5 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CUSTOM_5_1, Form.CUSTOM_5_2, Form.CUSTOM_5_3};

    private Form newForm;

    public Puzzle5(Form form) {
        super(5);
        this.newForm = form;
        this.form = form.getCustomLayout().getLayout();
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle5(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
