package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {

        double number =(double) toBeDivided / 5;
        System.out.println(number);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(219);
    }
}