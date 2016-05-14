import org.junit.Assert;
import org.junit.Test;

/**
 * Created by iyubinest on 5/14/16.
 */
public class MCMTests {

    @Test
    public void calcular() {
        Assert.assertEquals(2, new MCM(2, 2).value());
        Assert.assertEquals(6, new MCM(2, 3).value());
        Assert.assertEquals(4, new MCM(2, 4).value());
    }
}
