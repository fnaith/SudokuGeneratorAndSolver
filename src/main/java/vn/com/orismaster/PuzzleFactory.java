package vn.com.orismaster;

public class PuzzleFactory {
    public static Puzzle newSolvedPuzzle(int size, Form form) {
        Puzzle puzzle;
        int r;
        switch (size) {
            case 4:
                puzzle = new Puzzle4(form);
                break;
            case 5:
                puzzle = new Puzzle5(form);
                break;
            case 6:
                puzzle = new Puzzle6(form);
                break;
            case 7:
                puzzle = new Puzzle7(form);
                break;
            case 8:
                puzzle = new Puzzle8(form);
                break;
            case 9:
                puzzle = new Puzzle9(form);
                break;
            case 12:
                puzzle = new Puzzle12(form);
                break;
            case 16:
                puzzle = new Puzzle16(form);
                break;
            case 25:
                puzzle = new Puzzle25(form);
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
