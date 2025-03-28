package vn.com.orismaster;

public class Puzzle4 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_4, Form.CUSTOM_4_1, Form.CUSTOM_4_2};

    private Form newForm;

    public Puzzle4(Form form) {
        super(4);
        newForm = form;
        this.form = form.isClassic() ? null : form.getCustomLayout().getLayout();
    }

    @Override
    public int getWith(){
        return newForm.getClassicLayout().getWidth();
    }

    @Override
    public int getHeight() {
        return newForm.getClassicLayout().getHeight();
    }

    @Override
    public int getWithOfBox() {
        return newForm.getClassicLayout().getWidthOfBox();
    }

    @Override
    public int getHeightOfBox() {
        return newForm.getClassicLayout().getHeightOfBox();
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle4(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
