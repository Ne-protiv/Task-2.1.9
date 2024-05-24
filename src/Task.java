public class Task {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1.3);
        ComplexNumber b = new ComplexNumber(-1, -1.3);
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
            return im == b.getIm() && re == b.getRe();
        }

        public int hashCode() {
            int total = 31;
            long reHash = Double.doubleToLongBits(re);
            long imHash = Double.doubleToLongBits(im);
            int reResult = Long.hashCode(reHash);
            int imResult = Long.hashCode(imHash);
            total = 31 * total + reResult;
            total = 31 * total + imResult;
            return total;
        }
    }
}



