import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by iyubinest on 5/14/16.
 */
public class Tests {

    @Test(expected = DenominadorZeroException.class)
    public void arroja_error_con_denominador_cero() throws Throwable {
        new Fraccion(1, 0);
    }

    @Test
    public void dos_fracciones_son_equivalentes() throws Throwable {
        Fraccion primera = new Fraccion(1, 1);
        Fraccion segunda = new Fraccion(2, 2);
        Assert.assertTrue(primera.equals(segunda));

        primera = new Fraccion(4, 2);
        segunda = new Fraccion(2, 1);
        Assert.assertTrue(primera.equals(segunda));
    }

    @Test
    public void dos_fracciones_no_son_equivalentes() throws Throwable {
        Fraccion primera = new Fraccion(2, 1);
        Fraccion segunda = new Fraccion(2, 2);
        Assert.assertFalse(primera.equals(segunda));
    }

    @Test
    public void generar_fraccion_simplificada() throws Throwable {
        Fraccion fraccion = new Fraccion(4, 4);
        Fraccion simplificada = fraccion.simplificar();
        Assert.assertEquals(1, simplificada.numerador());
        Assert.assertEquals(1, simplificada.denominador());
        Assert.assertTrue(fraccion.equals(simplificada));
    }

    @Test
    public void sumar_fracciones() throws Throwable {
        Fraccion oringinal = new Fraccion(3, 5);
        Fraccion adicion = new Fraccion(15, 7);
        Fraccion resultado = new Fraccion(96, 35);
        Assert.assertTrue(resultado.equals(oringinal.suma(adicion)));
    }
}
