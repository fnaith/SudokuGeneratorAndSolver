package vn.com.orismaster;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareFileTest {
    private static final String ROOT_DIR_PATH = "./generated-test";

    private static void compare(int size, String formName, int[][] form, int seed) {
        Util.setSeed(seed);
        Generator.setSeed(seed);
        final var game = Generator.generate(size, 5 * 1000, 10, 1000000, form);
        final var questionFileName = String.format("%s/%d_%s_%d_q.txt", ROOT_DIR_PATH, size, formName, seed);
        try {
            final var content = new String(Files.readAllBytes(Paths.get(questionFileName)));
            assertEquals(content, game.getQuestion().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        final var ansFileName = String.format("%s/%d_%s_%d_a.txt", ROOT_DIR_PATH, size, formName, seed);
        try {
            final var content = new String(Files.readAllBytes(Paths.get(ansFileName)));
            assertEquals(content, game.getAnswer().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test() {
        final Random randomSeed = new Random();
        randomSeed.setSeed(42);
        compare(7, "form1", Puzzle7.FORM1.toArray(), randomSeed.nextInt());
    }
}
