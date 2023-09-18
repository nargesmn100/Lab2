import java.util.List;

public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java. Done!
    public static long sum(List<Integer> numbers) {

        long s = 0; // type 'int' can only store so many numbers so it  gives us the incorrect number.

        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
