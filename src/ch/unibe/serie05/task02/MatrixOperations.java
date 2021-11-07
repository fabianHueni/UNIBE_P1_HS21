package ch.unibe.serie05.task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class provide four static methods for handling matrices, which are stored in a file
 *  - read a matrix from the resource folder with a given file name
 *  - transpose a matrix
 *  - calculate the matrix product from two matrices
 *  - convert a matrix to a string representation for printing out
 */
public class MatrixOperations {

    private final static String PATH_NAME_MATRICES_RESOURCES = "src/ch/unibe/serie05/task02/resources/";

    /**
     * reads a given filename and convert the input into a matrix with int values
     *
     * @param fileName name of the file in the resource folder
     * @return the corresponding int nxm matrix as a tow dimensional array
     * @throws FileNotFoundException Exception if no file is found
     */
    public static int[][] readMatrix(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(PATH_NAME_MATRICES_RESOURCES + fileName));
        ArrayList<String> matrixLines = new ArrayList<>();
        int[][] matrix = null;

        // read all lines from input into an array list to get the size of the array
        while (scanner.hasNextLine()) {
            matrixLines.add(scanner.nextLine());
        }

        // iterate over all matrixLines
        for (int i = 0; i < matrixLines.size(); i++) {
            String[] elements = matrixLines.get(i).split(" ");

            // instantiate the matrix array with correct sizes.
            if (matrix == null)
                matrix = new int[matrixLines.size()][elements.length];

            //add all elements from one line to the array
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
        return matrix;
    }

    /**
     * transpose any given matrix, which is quadratic and not empty
     *
     * @param mat a matrix for transposing
     * @return transposed matrix
     */
    public static int[][] transpose(int[][] mat) {
        if(mat == null || mat.length < 1) {
            System.out.println("Die Matrix ist leer.");
            return mat;
        } else if (mat[0].length != mat.length){
            System.out.println("Die Matrix ist nicht quadratisch und kann nicht transponiert werden.");
            return null;
        }

        // instantiate the transposed matrix variable with given size
        int[][] transposedMat = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transposedMat[j][i] = mat[i][j];
            }
        }
        return transposedMat;
    }


    /**
     * calculate the product of two matrices and returns the result.
     *
     * @param matrixA the first matrix to get multiplied
     * @param matrixB the second matrix to get multiplied
     * @return the calculated matrix product if both matrix are compatible. Otherwise, the result is null.
     */
    public static int[][] product(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length, columnA = matrixA[0].length;
        int rowsB = matrixB.length, columnB = matrixB[0].length;
        int[][] resultMatrix = new int[rowsA][columnB];

        if (columnA != rowsB) {
            System.out.println("Die beiden Matrizen sind nicht kompatibel");
            return null;
        }

        for (int i = 0; i < resultMatrix.length; i ++) {
            for (int j = 0; j < resultMatrix[i].length; j ++) {
                int sum = 0;

                for (int k = 0; k < columnA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }

                resultMatrix[i][j] = sum;
            }
        }
        return resultMatrix;
    }

    /**
     * Returns a representation of a given matrix as a string. If the matrix is null, the returned string is empty
     *
     * @param mat the nxn matrix to convert to a string
     * @return string representation of a given matrix
     */
    public static String matrixToString(int[][] mat) {
        String matrixAsString = "";
        if (mat == null)
            return "";

        for (int[] line: mat) {
            for (int entry: line) {
                matrixAsString += entry + " ";
            }
            matrixAsString += "\n";
        }
        return matrixAsString;
    }
}
