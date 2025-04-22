package lang.print.gaps.task5;

import java.sql.Time;

public class TimeConvertor {
    public void convert(float minutes) {

        int seconds = (int) (minutes * 60);
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConvertor convertor = new TimeConvertor();
        convertor.convert(-2.45f);
    }
}
