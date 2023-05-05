package homeworks.hm8;

public class ArrayValueCalculator {

    public int doCalc(String[][] matrix) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (String[] strings : matrix) {
            if (matrix.length != 4 || strings.length != 4) {
                throw new ArraySizeException("Invalid length! Matrix must be Square 4x4!");
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                try {
                    sum += Integer.parseInt(matrix[row][col]);
                } catch (NumberFormatException exc) {
                    String msg = String.format("Invalid data in matrix at row %d, column %d, %s", row + 1, col + 1, "key: " + matrix[row][col]);
                    throw new ArrayDataException(msg);
                } catch (Throwable exc) {
                    System.out.println(exc.getMessage());
                }
            }
        }
        return sum;
    }
}
