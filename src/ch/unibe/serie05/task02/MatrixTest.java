// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie05.task02;

/**
 * represents a test class for the MatrixOperations class.
 */
public class MatrixTest {

    public static String[] testFiles = {"matrix-a", "matrix-b","matrix-c", "matrix-d","matrix-e", "matrix-notFound",};

    public static void main(String[] args) {
        System.out.println("-------- Testcases for read input files and matrix transpose " +
                "------------------------------------------");
        testMatrixReadAndTranspose();

        System.out.println("-------- Testcase for the matrix product method " +
                "------------------------------------------");
        testMatrixProduct();

    }

    /**
     * test the matrix product method with the given test case from the task
     */
    public static void testMatrixProduct() {
        int[][] matrixA, matrixB, matrixProduct;

        try {
            matrixA = MatrixOperations.readMatrix("matrix-product-a");
            matrixB = MatrixOperations.readMatrix("matrix-product-b");
            matrixProduct = MatrixOperations.product(matrixA, matrixB);

            System.out.println(MatrixOperations.matrixToString(matrixA));
            System.out.println(MatrixOperations.matrixToString(matrixB));
            System.out.println(MatrixOperations.matrixToString(matrixProduct));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * tests the read matrix method with:
     *  - multiple correct matrix input file with different sizes
     *  - empty matrix input file
     *  - wrong formatted matrix input (different row length)
     *  - file name without an existing file
     *
     * and then transpose these matrices and print them out. with the give inputs files
     * the transpose and print methods are tested with non-quadratic, empty, small and big matrices
     */
    public static void testMatrixReadAndTranspose() {
        int[][] matrix, transposedMatrix;

        try {
            for (String fileName: testFiles) {
                matrix = MatrixOperations.readMatrix(fileName);
                transposedMatrix = MatrixOperations.transpose(matrix);

                System.out.println(MatrixOperations.matrixToString(matrix));
                System.out.println(MatrixOperations.matrixToString(transposedMatrix));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
