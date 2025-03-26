package vn.com.orismaster;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public final class GenerateTest {
    private static final String ROOT_DIR_PATH = "./generated-test";

    private static String buildTestFileName(int size, String formName, int seed) {
        return String.format("%s/%d_%s_%d.txt", ROOT_DIR_PATH, size, formName, seed);
    }

    public static String generateTestData(int size, int[][] form, int seed) {
        Util.setSeed(seed);
        Generator.setSeed(seed);
        Puzzle.setSeed(seed);
        final var game = Generator.generate(size, 3 * 1000, 10, 1000000, form);
        return game.getAnswer().toString() + '\n' + game.getQuestion().toString() + '\n' + game.getScore() + '\n';
    }

    private static void saveTestData(int size, String formName, int[][] form, int seed) {
        final var testFileName = buildTestFileName(size, formName, seed);
        try (final var fw = new FileWriter(testFileName)) {
            fw.write(generateTestData(size, form, seed));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String loadTestData(int size, String formName, int seed) {
        final var testFileName = buildTestFileName(size, formName, seed);
        try {
            return new String(Files.readAllBytes(Paths.get(testFileName)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void generateTestForAllForm(Random randomSeed) {
        saveTestData(4, "classic", Puzzle4.CLASSIC.toArray(), randomSeed.nextInt());
        saveTestData(4, "form1", Puzzle4.FORM1.toArray(), randomSeed.nextInt());
        saveTestData(4, "form2", Puzzle4.FORM2.toArray(), randomSeed.nextInt());
        saveTestData(5, "form1", Puzzle5.FORM1.toArray(), randomSeed.nextInt());
        saveTestData(5, "form2", Puzzle5.FORM2.toArray(), randomSeed.nextInt());
        saveTestData(5, "form3", Puzzle5.FORM3.toArray(), randomSeed.nextInt());
        saveTestData(6, "classic", Puzzle6.CLASSIC.toArray(), randomSeed.nextInt());
        saveTestData(6, "form1", Puzzle6.FORM1.toArray(), randomSeed.nextInt());
        saveTestData(6, "form2", Puzzle6.FORM2.toArray(), randomSeed.nextInt());
        saveTestData(7, "form1", Puzzle7.FORM1.toArray(), randomSeed.nextInt());
        saveTestData(7, "form2", Puzzle7.FORM2.toArray(), randomSeed.nextInt());
        saveTestData(7, "form3", Puzzle7.FORM3.toArray(), randomSeed.nextInt());
        saveTestData(7, "form4", Puzzle7.FORM4.toArray(), randomSeed.nextInt());
        saveTestData(7, "form5", Puzzle7.FORM5.toArray(), randomSeed.nextInt());
        saveTestData(8, "classic", Puzzle8.CLASSIC.toArray(), randomSeed.nextInt());
        saveTestData(9, "classic", Puzzle9.CLASSIC.toArray(), randomSeed.nextInt());
    }

    public static void main(String[] args) {
        final var randomSeed = new Random();
        randomSeed.setSeed(42);
        for (var i = 0; i < 1; ++i) {
            generateTestForAllForm(randomSeed);
        }
        randomSeed.setSeed(69);
        saveTestData(12, "classic", Puzzle12.CLASSIC.toArray(), randomSeed.nextInt());
        saveTestData(16, "classic", Puzzle16.CLASSIC.toArray(), randomSeed.nextInt());
        saveTestData(25, "classic", Puzzle25.CLASSIC.toArray(), randomSeed.nextInt());
    }
}
