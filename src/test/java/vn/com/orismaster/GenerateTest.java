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

    public static String generateTestData(Form form, int seed) {
        Util.setSeed(seed);
        Generator.setSeed(seed);
        Puzzle.setSeed(seed);
        final var game = Generator.generate(3 * 1000, 10, 1000000, form);
        return game.getAnswer().toString() + '\n' + game.getQuestion().toString() + '\n' + game.getScore() + '\n';
    }

    private static void saveTestData(String formName, Form form, int seed) {
        final var testFileName = buildTestFileName(form.getSize(), formName, seed);
        try (final var fw = new FileWriter(testFileName)) {
            fw.write(generateTestData(form, seed));
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
        saveTestData("classic", Form.CLASSIC_4, randomSeed.nextInt());
        saveTestData("form1", Form.CUSTOM_4_1, randomSeed.nextInt());
        saveTestData("form2", Form.CUSTOM_4_2, randomSeed.nextInt());
        saveTestData("form1", Form.CUSTOM_5_1, randomSeed.nextInt());
        saveTestData("form2", Form.CUSTOM_5_2, randomSeed.nextInt());
        saveTestData("form3", Form.CUSTOM_5_3, randomSeed.nextInt());
        saveTestData("classic", Form.CLASSIC_6, randomSeed.nextInt());
        saveTestData("form1", Form.CUSTOM_6_1, randomSeed.nextInt());
        saveTestData("form2", Form.CUSTOM_6_2, randomSeed.nextInt());
        saveTestData("form1", Form.CUSTOM_7_1, randomSeed.nextInt());
        saveTestData("form2", Form.CUSTOM_7_2, randomSeed.nextInt());
        saveTestData("form3", Form.CUSTOM_7_3, randomSeed.nextInt());
        saveTestData("form4", Form.CUSTOM_7_4, randomSeed.nextInt());
        saveTestData("form5", Form.CUSTOM_7_5, randomSeed.nextInt());
        saveTestData("classic", Form.CLASSIC_8, randomSeed.nextInt());
        saveTestData("classic", Form.CLASSIC_9, randomSeed.nextInt());
    }

    public static void main(String[] args) {
        final var randomSeed = new Random();
        randomSeed.setSeed(42);
        for (var i = 0; i < 1; ++i) {
            generateTestForAllForm(randomSeed);
        }
        randomSeed.setSeed(69);
        saveTestData("classic", Form.CLASSIC_12, randomSeed.nextInt());
        saveTestData("classic", Form.CLASSIC_16, randomSeed.nextInt());
        saveTestData("classic", Form.CLASSIC_25, randomSeed.nextInt());
    }
}
