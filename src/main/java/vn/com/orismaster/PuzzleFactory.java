package vn.com.orismaster;

public class PuzzleFactory {
    public static Puzzle newSolvedPuzzle(int size, int[][] form) {
        Puzzle puzzle;
        int r;
        switch (size) {
            case 4:
                if (form == null) {
                    puzzle = new Puzzle4(Puzzle4.FORMS[0]);
                } else {
                    puzzle = new Puzzle4(Form.of(4, CustomLayout.of(form)));
                }
                break;
            case 5:
                if (form == null) {
                    puzzle = new Puzzle5(Puzzle5.FORMS[0]);
                } else {
                    puzzle = new Puzzle5(Form.of(5, CustomLayout.of(form)));
                }
                break;
            case 6:
                if (form == null) {
                    puzzle = new Puzzle6(Puzzle6.FORMS[0]);
                } else {
                    puzzle = new Puzzle6(Form.of(6, CustomLayout.of(form)));
                }
                break;
            case 7:
                if (form == null) {
                    puzzle = new Puzzle7(Puzzle7.FORMS[0]);
                } else {
                    puzzle = new Puzzle7(Form.of(7, CustomLayout.of(form)));
                }
                break;
            case 8:
                if (form == null) {
                    puzzle = new Puzzle8(Puzzle8.FORMS[0]);
                } else {
                    puzzle = new Puzzle8(Form.of(8, CustomLayout.of(form)));

                }
                break;
            case 9:
                if (form == null) {
                    puzzle = new Puzzle9(Puzzle9.FORMS[0]);
                } else {
                    puzzle = new Puzzle9(Form.of(9, CustomLayout.of(form)));
                }
                break;
            case 12:
                puzzle = new Puzzle12(Form.CLASSIC_12);
                break;
            case 16:
                puzzle = new Puzzle16(Form.CLASSIC_16);
                break;
            case 25:
                puzzle = new Puzzle25(Form.CLASSIC_25);
                break;
            case 3:
                // not supported yet, maybe in the feature!
                return null;
            default:
                // other puzzle type will be supported in the feature
                return null;
        }

        return puzzle.random();
    }
}
