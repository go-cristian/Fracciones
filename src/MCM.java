/**
 * Created by iyubinest on 5/14/16.
 */
public class MCM {
    private final int primero;
    private final int segundo;

    public MCM(int primero, int segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public int value() {
        return primero * segundo / new MCD(primero, segundo).value();
    }
}
