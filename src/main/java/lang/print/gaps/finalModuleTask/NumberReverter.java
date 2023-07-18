package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int reversed = (number % 10) * 100;
        number /= 10;
        reversed += (number % 10) * 10;
        number /= 10;
        reversed += number;

        System.out.println(reversed);

    }
}
