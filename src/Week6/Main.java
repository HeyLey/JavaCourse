package Week6;


import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer tokenizer = new StreamTokenizer(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Integer> numbers = new ArrayList<>();

        int i = 0;

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) tokenizer.nval;
            if (i % 2 == 1) {
                numbers.add(n);
            }
            i++;
        }

        for (int j = numbers.size()-1; j >= 0; j--) {
            out.print(numbers.get(j) + " ");
        }
        out.print("\n");

        out.close();
    }
}
