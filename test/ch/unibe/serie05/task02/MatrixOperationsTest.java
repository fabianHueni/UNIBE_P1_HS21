package ch.unibe.serie05.task02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {
    // private String[] testFiles = {"matrix-a", "matrix-b","matrix-c", "matrix-d","matrix-e"};
    private String[] testFiles = {"matrix-c"};
    private ArrayList<int[][]> testMatrices = new ArrayList<>();
    private ArrayList<int[][]> testMatricesResult = new ArrayList<>();

    @BeforeEach
    void setUp() throws FileNotFoundException {
        for (String testFile : testFiles) {
            testMatrices.add(MatrixOperations.readMatrix(testFile));
            testMatricesResult.add(MatrixOperations.readMatrix("transpose-results/" + testFile));
        }
    }

    @Test
    void readMatrix() {
    }

    @Test
    void transpose() {
        int[][] result = MatrixOperations.transpose(testMatrices.get(0));
        assertTrue(Arrays.deepEquals(result, testMatricesResult.get(0)));
    }

    @Test
    void product() {
    }
}