package vn.com.orismaster;

public class Puzzle12 extends Puzzle {
    private Form newForm;

    public Puzzle12(Form form) {
        super(12);
        newForm = form;
        this.form = form.isClassic() ? null : form.getCustomLayout().getLayout();
    }

    @Override
    public int getWith(){
        return 3;
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
        return 3;
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle12(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
