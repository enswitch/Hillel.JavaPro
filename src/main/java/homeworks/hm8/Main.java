package homeworks.hm8;

public class Main {

    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArrayValueCalculator calculate = new ArrayValueCalculator();
        try {
            int result = calculate.doCalc(matrix);
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exc) {
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Thanks for using our service");
        }
    }
}
