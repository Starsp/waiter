package by.waiter;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class BooleanUtil {

    public static boolean intAsBoolean(int value) {
        return value == 1;
    }

    public static int booleanAsInteger(boolean value) {
        return value ? 1 : 0;
    }

}
