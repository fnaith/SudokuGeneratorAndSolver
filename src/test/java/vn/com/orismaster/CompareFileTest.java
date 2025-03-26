package vn.com.orismaster;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareFileTest {
    private static void compareTestData(int size, String formName, int[][] form, int seed, int comparePrefixLength) {
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
        compareTestData(4, "classic", Puzzle4.CLASSIC.toArray(), randomSeed.nextInt(), -1);
        compareTestData(4, "form1", Puzzle4.FORM1.toArray(), randomSeed.nextInt(), -1);
        compareTestData(4, "form2", Puzzle4.FORM2.toArray(), randomSeed.nextInt(), -1);
        compareTestData(5, "form1", Puzzle5.FORM1.toArray(), randomSeed.nextInt(), -1);
        compareTestData(5, "form2", Puzzle5.FORM2.toArray(), randomSeed.nextInt(), -1);
        compareTestData(5, "form3", Puzzle5.FORM3.toArray(), randomSeed.nextInt(), -1);
        compareTestData(6, "classic", Puzzle6.CLASSIC.toArray(), randomSeed.nextInt(), -1);
        compareTestData(6, "form1", Puzzle6.FORM1.toArray(), randomSeed.nextInt(), -1);
        compareTestData(6, "form2", Puzzle6.FORM2.toArray(), randomSeed.nextInt(), -1);
        compareTestData(7, "form1", Puzzle7.FORM1.toArray(), randomSeed.nextInt(), -1);
        compareTestData(7, "form2", Puzzle7.FORM2.toArray(), randomSeed.nextInt(), -1);
        compareTestData(7, "form3", Puzzle7.FORM3.toArray(), randomSeed.nextInt(), -1);
        compareTestData(7, "form4", Puzzle7.FORM4.toArray(), randomSeed.nextInt(), -1);
        compareTestData(7, "form5", Puzzle7.FORM5.toArray(), randomSeed.nextInt(), -1);
        compareTestData(8, "classic", Puzzle8.CLASSIC.toArray(), randomSeed.nextInt(), -1);
        compareTestData(9, "classic", Puzzle9.CLASSIC.toArray(), randomSeed.nextInt(), -1);
    }

    @Test
    public void test() {
        final var randomSeed = new Random();
        randomSeed.setSeed(42);
        for (var i = 0; i < 1; ++i) {
            compareTestDataForAllForm(randomSeed);
        }
        randomSeed.setSeed(69);
        compareTestData(12, "classic", Puzzle12.CLASSIC.toArray(), randomSeed.nextInt(), 928);
        compareTestData(16, "classic", Puzzle16.CLASSIC.toArray(), randomSeed.nextInt(), 1505);
        compareTestData(25, "classic", Puzzle25.CLASSIC.toArray(), randomSeed.nextInt(), 3371);
    }
}
