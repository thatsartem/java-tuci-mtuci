import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.height = 3;
        range.width = 3;
        range.x = -2;
        range.y = -1.5
    }
    public static final int MAX_ITERATIONS = 2000;

    @Override
    public int numIterations(double x, double y) {
        ComplexNum cmplx = new ComplexNum(0, 0);
        int iterator = 0;

        while (iterator < LIMIT && cmplx.getSquaredModule() < 4) {
            cmplx.makeSquaredInPoint(x, y);

            iterator++;
        }

        if (iterator == LIMIT) return -1;

        return iterator;
    }
}
