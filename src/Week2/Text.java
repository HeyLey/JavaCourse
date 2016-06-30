package Week2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by leyla on 02/10/15.
 */
public class Text {

    static StreamTokenizer in;

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    static String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    public static void main(String[] args) throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <LinkedList<String>> list = new ArrayList<LinkedList<String>>();

        String s = br.readLine();
        int persons = 0;

        for (int i = 0; ; i++) {
            s = br.readLine();
            if (s.equals("textLines:")) {
                break;
            }
            list.add(new LinkedList<String>());
            list.get(i).add(s + ":");
            persons++;
        }

        int lineNumber = 1;

        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            String[] array = s.split(":");
            for (int j = 0; j < persons; j++) {
                if ((array[0]+ ":").equals(list.get(j).get(0))) {
                    list.get(j).add(lineNumber + ") " + s.substring(array[0].length() + 2));
                }
            }
            lineNumber++;
        }


        for (int k = 0; k < list.size(); k++) {
            out.println(list.get(k).get(0));
            for (int m = 1; m < list.get(k).size(); m++) {
                out.println(list.get(k).get(m));
            }
            out.println();
        }

        out.close();
    }
}
