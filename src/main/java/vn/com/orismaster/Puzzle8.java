package vn.com.orismaster;

public class Puzzle8 extends Puzzle {
    public static Form[] FORMS = new Form[]{Form.CLASSIC_8};

    private Form newForm;

    public Puzzle8(Form form) {
        super(8);
        newForm = form;
        this.form = form.isClassic() ? null : form.getCustomLayout().getLayout();
    }

    public Puzzle8() {
        super(8);
    }

    @Override
    public int getWith(){
        return 2;
    }

    @Override
    public int getHeight() {
        return 4;
    }

    @Override
    public int getWithOfBox() {
        return 4;
    }

    @Override
    public int getHeightOfBox() {
        return 2;
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle8(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
