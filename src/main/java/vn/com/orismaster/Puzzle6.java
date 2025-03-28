package vn.com.orismaster;

public class Puzzle6 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_6, Form.CUSTOM_6_1, Form.CUSTOM_6_2};

    private Form newForm;

    public Puzzle6(Form form) {
        super(6);
        newForm = form;
        this.form = form.isClassic() ? null : form.getCustomLayout().getLayout();
    }

    @Override
    public int getWith(){
        return 2;
    }

    @Override
    public int getHeight() {
        return 3;
    }

    @Override
    public int getWithOfBox() {
        return 3;
    }

    @Override
    public int getHeightOfBox() {
        return 2;
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle6(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
