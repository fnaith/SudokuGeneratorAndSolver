package vn.com.orismaster;

import java.io.FileWriter;
import java.util.Random;

public final class GenerateTest {
    private static final String ROOT_DIR_PATH = "./generated-test";

    private static void generate(int size, String formName, int[][] form, int seed) {
        Util.setSeed(seed);
        Generator.setSeed(seed);
        final var game = Generator.generate(size, 5 * 1000, 10, 1000000, form);
        final var questionFileName = String.format("%s/%d_%s_%d_q.txt", ROOT_DIR_PATH, size, formName, seed);
        try (final var fw = new FileWriter(questionFileName)) {
            fw.write(game.getQuestion().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        final var ansFileName = String.format("%s/%d_%s_%d_a.txt", ROOT_DIR_PATH, size, formName, seed);
        try (final var fw = new FileWriter(ansFileName)) {
            fw.write(game.getAnswer().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        final Random randomSeed = new Random();
        randomSeed.setSeed(42);
        generate(7, "form1", Puzzle7.FORM1.toArray(), randomSeed.nextInt());
    }
}
