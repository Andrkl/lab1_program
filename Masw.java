public class Masw {
    public static void main(String[] args) {
        int sizew = 10;
        long[] w = new long[sizew];
        for (int i = 0; i < sizew; i++) {
           w[i] = 6 + i * 2;
        }
        System.out.println("\n");
        double[] x = new double[13];
        for (int j = 0; j < 13; j++) {
            x[j] = Math.floor(Math.random() * 22 - 10);
        }
        for (int i = 0; i < sizew; i++) {
            double[] w1 = new double[13];
              for (int j = 0; j < 13; j++) {
                if (w[i] == 24) { 
                   w1[j] = Math.asin(Math.pow(Math.cos(x[j]), 2));
        }
                if (w[i] == 6 || w[i] == 10 || w[i] == 12 || w[i] == 14 || w[i] == 20) { 
                   w1[j] = Math.pow(Math.E,Math.pow(Math.E,Math.pow(4*(1-x[j]),x[j])));
        }
                if (w[i] == 8 || w[i] == 16 || w[i] == 18 || w[i] == 22) { 
                   w1[j] = Math.atan (Math.sin (Math.atan (Math.pow( Math.E, Math.cbrt(-Math.pow (Math.cos(x[j]),2))))));
        }
        System.out.print(String.format("%.3f",w1[j]));
        if ((w1[j] - 1000) < 0) {
            System.out.print("   ");
           if ((w1[j] - 10) < 0) {
              System.out.print(" ");
           }
        } else {
            System.out.print(" ");
        }
        }
        System.out.println();
    }
  }
}
