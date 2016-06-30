package Week5;


import java.io.*;

public class D1 {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int ret;
        while ((ret = inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1)^ret;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        byte[] buf = new byte[1024];
        InputStream stream = new ByteArrayInputStream (new byte[] {0x33, 0x45, 0x01});
        System.out.println(checkSumOfStream(stream));
    }

}
