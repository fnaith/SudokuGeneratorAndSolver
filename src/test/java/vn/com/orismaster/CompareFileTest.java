package vn.com.orismaster;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareFileTest {
    private static void compareTestData(String formName, Form form, int seed, int comparePrefixLength) {
        try {
            final var previousTestData = GenerateTest.loadTestData(form.getSize(), formName, seed);
            final var currentTestData = GenerateTest.generateTestData(form, seed);
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
        compareTestData("classic", Form.CLASSIC_4, randomSeed.nextInt(), -1);
        compareTestData("form1", Form.CUSTOM_4_1, randomSeed.nextInt(), -1);
        compareTestData("form2", Form.CUSTOM_4_2, randomSeed.nextInt(), -1);
        compareTestData("form1", Form.CUSTOM_5_1, randomSeed.nextInt(), -1);
        compareTestData("form2", Form.CUSTOM_5_2, randomSeed.nextInt(), -1);
        compareTestData("form3", Form.CUSTOM_5_3, randomSeed.nextInt(), -1);
        compareTestData("classic", Form.CLASSIC_6, randomSeed.nextInt(), -1);
        compareTestData("form1", Form.CUSTOM_6_1, randomSeed.nextInt(), -1);
        compareTestData("form2", Form.CUSTOM_6_2, randomSeed.nextInt(), -1);
        compareTestData("form1", Form.CUSTOM_7_1, randomSeed.nextInt(), -1);
        compareTestData("form2", Form.CUSTOM_7_2, randomSeed.nextInt(), -1);
        compareTestData("form3", Form.CUSTOM_7_3, randomSeed.nextInt(), -1);
        compareTestData("form4", Form.CUSTOM_7_4, randomSeed.nextInt(), -1);
        compareTestData("form5", Form.CUSTOM_7_5, randomSeed.nextInt(), -1);
        compareTestData("classic", Form.CLASSIC_8, randomSeed.nextInt(), -1);
        compareTestData("classic", Form.CLASSIC_9, randomSeed.nextInt(), -1);
    }

    @Test
    public void test() {
        final var randomSeed = new Random();
        randomSeed.setSeed(42);
        for (var i = 0; i < 1; ++i) {
            compareTestDataForAllForm(randomSeed);
        }
        randomSeed.setSeed(69);
        compareTestData("classic", Form.CLASSIC_12, randomSeed.nextInt(), 928);
        compareTestData("classic", Form.CLASSIC_16, randomSeed.nextInt(), 1505);
        compareTestData("classic", Form.CLASSIC_25, randomSeed.nextInt(), 3371);
    }
}
