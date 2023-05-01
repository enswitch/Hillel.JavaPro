package homeworks.hm6;

public class HomeWorkApp {

    public void printThreeWords() {
        String s1 = "Orange, Banana, Apple";
        String[] s2 = s1.split(",\\s*");
        for (String s : s2) {
            System.out.print(s + "\n");
        }
    }

    public void checkSumSign() {
        int a = 6;
        int b = -7;
        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean isBetweenTenAndTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public void printPositiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public boolean isPositiveOrNegativeNumber(int a) { // negative number = true, positive = false
        return a < 0;
    }

    public void printStringIntTimes(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }


    public static void main(String[] args) {
        HomeWorkApp hm = new HomeWorkApp();
        hm.printThreeWords();
        hm.checkSumSign();
        hm.printColor();
        hm.compareNumbers();
        System.out.println(hm.isBetweenTenAndTwenty(-10, 20));
        hm.printPositiveOrNegativeNumber(-1);
        System.out.println(hm.isPositiveOrNegativeNumber(0));
        hm.printStringIntTimes("Error", 3);
        System.out.println(hm.isLeapYear(1604));
    }
}
