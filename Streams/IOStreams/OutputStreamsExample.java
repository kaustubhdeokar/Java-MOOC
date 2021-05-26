import java.io.*;
import java.nio.file.Paths;

public class OutputStreamsExample {

    public static void main(String[] args) throws IOException {

//        writeByteStream();
//        writeByteArrayStream();
        writeCharStream();
    }

    private static void writeByteStream() throws IOException {
        OutputStream outputStream = new FileOutputStream(Paths.get("src", "somefile").toString());
        byte b = 100;
        outputStream.write(b);
    }

    private static void writeByteArrayStream() throws IOException {
        OutputStream outputStream = new FileOutputStream(Paths.get("src", "somefile").toString());
        byte[] b1 = new byte[]{100, 120, 101};
        outputStream.write(b1);
    }

    private static void writeCharStream() throws IOException {

        Writer writer = new FileWriter(Paths.get("src", "somefile").toString());
        char c = 'a';
        writer.write("ada asdasd");
        writer.close();
    }

}
