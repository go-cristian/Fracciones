import org.junit.Assert;
import org.junit.Test;

/**
 * Created by iyubinest on 5/14/16.
 */
public class MCDTests {

    @Test
    public void mcd() {
        Assert.assertEquals(1, new MCD(1, 1).value());
        Assert.assertEquals(2, new MCD(2, 2).value());
        Assert.assertEquals(4, new MCD(4, 4).value());
        Assert.assertEquals(4, new MCD(8, 4).value());
        Assert.assertEquals(5, new MCD(15, 10).value());
    }
}
