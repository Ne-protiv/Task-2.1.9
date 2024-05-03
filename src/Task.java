import java.util.Objects;

public class Task {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2.2, 0);
        ComplexNumber b = new ComplexNumber(2.2, 0);
        boolean x = a.equals(b);
        System.out.println(x);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        public boolean equals(ComplexNumber b) {
            return Objects.equals(im, b.getIm()) && Objects.equals(re, b.getRe());
        }

        public int hashCode() {
            long reHash = Double.doubleToLongBits(re);
            long imHash = Double.doubleToLongBits(im);
            int reResult = Long.hashCode(reHash);
            int imResult = Long.hashCode(imHash);
            return 2 * reResult + imResult;
        }
    }


}



