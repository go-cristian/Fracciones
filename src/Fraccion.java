/**
 * Created by iyubinest on 5/14/16.
 */
public class Fraccion {
    private final int numerador;
    private final int denominador;

    public Fraccion(int numerador, int denominador) throws DenominadorZeroException {
        if (denominador == 0) throw new DenominadorZeroException();
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public boolean equals(Object obj) {
        Fraccion comparacion = (Fraccion) obj;
        double resultadoFraccion = numerador / denominador;
        double resultadoFraccionComparacion = comparacion.numerador / comparacion.denominador;
        return resultadoFraccion == resultadoFraccionComparacion;
    }

    public Fraccion simplificar() throws DenominadorZeroException {
        int mcd = new MCD(numerador, denominador).value();
        return new Fraccion(numerador / mcd, denominador / mcd);
    }

    public int numerador() {
        return numerador;
    }

    public int denominador() {
        return denominador;
    }

    public Fraccion suma(Fraccion adicion) throws DenominadorZeroException {
        int mcm = new MCM(denominador, adicion.denominador).value();
        int a = (mcm / denominador) * numerador;
        int b = (mcm / adicion.denominador) * adicion.numerador;
        return new Fraccion(a + b, mcm);
    }
}
