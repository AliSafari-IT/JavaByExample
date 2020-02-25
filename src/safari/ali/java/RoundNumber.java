package safari.ali.java;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundNumber {
        public static void main(String[] args) {
            double num = 1.34567;

            System.out.format("%.4f", num);
            System.out.println("-------------------------------");
            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.CEILING);

            System.out.println(df.format(num));
        }
    }
