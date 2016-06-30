package Week2;

/**
 * Created by leyla on 22/09/15.
 */
public class Bool {

    public boolean booleanExpression(boolean a, boolean b, boolean c) {
        return ((c & secretFunction()) || (a ^ b));
    }

    static boolean secretFunction() {
        return true;
    }
}
