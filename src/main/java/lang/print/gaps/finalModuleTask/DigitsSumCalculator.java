package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number;

        System.out.println(sum);

    }
}
