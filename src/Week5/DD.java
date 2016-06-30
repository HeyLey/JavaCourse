package Week5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class DD {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf= new byte[1024];
        int ret;
        while ((ret = inputStream.read(buf)) != -1) {
            out.write(buf, 0, ret);
        }
        return new String(out.toByteArray(), charset);
    }

}
