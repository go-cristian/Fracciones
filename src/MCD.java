/**
 * Created by iyubinest on 5/14/16.
 */
public class MCD {

    private final int primero;
    private final int segundo;

    public MCD(int primero, int segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public int value() {
        return segundo == 0 ? primero : new MCD(segundo, primero % segundo).value();
    }
}
