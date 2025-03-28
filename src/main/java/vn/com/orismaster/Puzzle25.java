package vn.com.orismaster;

public class Puzzle25 extends Puzzle {
    private Form newForm;

    public Puzzle25(Form form) {
        super(25);
        newForm = form;
        this.form = form.isClassic() ? null : form.getCustomLayout().getLayout();
    }

    @Override
    public int getWith(){
        return 5;
    }

    @Override
    public int getHeight() {
        return 5;
    }

    @Override
    public int getWithOfBox() {
        return 5;
    }

    @Override
    public int getHeightOfBox() {
        return 5;
    }

    @Override
    public Puzzle copy() {
        Puzzle puzzle = new Puzzle25(newForm);
        for(int row = 0; row < puzzle.size(); row++) {
            for(int col = 0; col < puzzle.size(); col++) {
                puzzle.set(row, col, this.get(row, col));
            }
        }
        return puzzle;
    }
}
