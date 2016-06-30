package Week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            res[j] = arr[i];
            if (arr[i] == "10" && i != 0 && arr[i-1] == "13") {
                res[j-1] = arr[i];
                j--;
            }
            j++;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
