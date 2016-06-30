package Week5;

import java.io.*;
import java.text.DecimalFormat;

public class D2 {
    static StreamTokenizer in;

    public static void main(String[] args) throws IOException {

        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        double sum = 0;

        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            sum += in.nval;
        }

        DecimalFormat myFormatter = new DecimalFormat("0.000000");
        System.out.println(myFormatter.format(sum));
    }
}