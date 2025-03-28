package vn.com.orismaster;

public final class Game {
    private final Puzzle question;
    private final Puzzle answer;
    private final int score;

    public Game(Puzzle question, Puzzle answer) {
        this.question = question;
        this.answer = answer;
        this.score = question.difficultyScore(answer);
    }

    public Puzzle getAnswer() {
        return answer;
    }

    public Puzzle getQuestion() {
        return question;
    }

    public int getScore() {
        return score;
    }
}
