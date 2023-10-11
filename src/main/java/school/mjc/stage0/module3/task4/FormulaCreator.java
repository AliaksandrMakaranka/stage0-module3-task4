package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        int f = 9 * (a * a) - 5 * b + 2 + a - 7;
        int s = (a + b - 4 * a * b) / 2;
        int result = f * s;
        System.out.println(result);
    }
}
