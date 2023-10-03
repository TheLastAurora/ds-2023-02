package com.newton;

public class AproximacaoNewtoniana {

    public static double raizQuadrada(double n, double tol, int maxIter) {
        double x1 = n / 2.0;

        for (int i = 0; i < maxIter; i++) {
            double x0 = x1;
            x1 = x1 - (x1 * x1 - n) / (2 * x1);
            if (Math.abs(x1 - x0) < tol) {
                return x1;
            }
        }
        return Double.NaN;
    }
}
