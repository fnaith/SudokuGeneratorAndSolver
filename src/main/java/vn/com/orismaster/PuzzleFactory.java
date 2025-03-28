package vn.com.orismaster;

public class PuzzleFactory {
    public static Puzzle newSolvedPuzzle(Form form) {
        switch (form.getSize()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 16:
            case 25:
                break;
            case 3:
                // not supported yet, maybe in the feature!
                return null;
            default:
                // other puzzle type will be supported in the feature
                return null;
        }

        final var puzzle = new Puzzle(form);
        return puzzle.random();
    }
}
