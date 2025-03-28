package vn.com.orismaster;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareFileTest {
    private static void compareTestData(int size, String formName, Form form, int seed, int comparePrefixLength) {
        try {
            final var previousTestData = GenerateTest.loadTestData(size, formName, seed);
            final var currentTestData = GenerateTest.generateTestData(size, form, seed);
            if (0 < comparePrefixLength) {
                assertEquals(previousTestData.substring(0, comparePrefixLength), currentTestData.substring(0, comparePrefixLength));
            } else {
                assertEquals(previousTestData, currentTestData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void compareTestDataForAllForm(Random randomSeed) {
        compareTestData(4, "classic", Form.CLASSIC_4, randomSeed.nextInt(), -1);
        compareTestData(4, "form1", Form.CUSTOM_4_1, randomSeed.nextInt(), -1);
        compareTestData(4, "form2", Form.CUSTOM_4_2, randomSeed.nextInt(), -1);
        compareTestData(5, "form1", Form.CUSTOM_5_1, randomSeed.nextInt(), -1);
        compareTestData(5, "form2", Form.CUSTOM_5_2, randomSeed.nextInt(), -1);
        compareTestData(5, "form3", Form.CUSTOM_5_3, randomSeed.nextInt(), -1);
        compareTestData(6, "classic", Form.CLASSIC_6, randomSeed.nextInt(), -1);
        compareTestData(6, "form1", Form.CUSTOM_6_1, randomSeed.nextInt(), -1);
        compareTestData(6, "form2", Form.CUSTOM_6_2, randomSeed.nextInt(), -1);
        compareTestData(7, "form1", Form.CUSTOM_7_1, randomSeed.nextInt(), -1);
        compareTestData(7, "form2", Form.CUSTOM_7_2, randomSeed.nextInt(), -1);
        compareTestData(7, "form3", Form.CUSTOM_7_3, randomSeed.nextInt(), -1);
        compareTestData(7, "form4", Form.CUSTOM_7_4, randomSeed.nextInt(), -1);
        compareTestData(7, "form5", Form.CUSTOM_7_5, randomSeed.nextInt(), -1);
        compareTestData(8, "classic", Form.CLASSIC_8, randomSeed.nextInt(), -1);
        compareTestData(9, "classic", Form.CLASSIC_9, randomSeed.nextInt(), -1);
    }

    @Test
    public void test() {
        final var randomSeed = new Random();
        randomSeed.setSeed(42);
        for (var i = 0; i < 1; ++i) {
            compareTestDataForAllForm(randomSeed);
        }
        randomSeed.setSeed(69);
        compareTestData(12, "classic", Form.CLASSIC_12, randomSeed.nextInt(), 928);
        compareTestData(16, "classic", Form.CLASSIC_16, randomSeed.nextInt(), 1505);
        compareTestData(25, "classic", Form.CLASSIC_25, randomSeed.nextInt(), 3371);
    }
}
