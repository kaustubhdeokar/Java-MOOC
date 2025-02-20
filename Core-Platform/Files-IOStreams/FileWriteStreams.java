import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class FileWriteStreams {

    public void writeBinary() throws IOException {
        OutputStream outputStream = null;
        byte byteVal = 100;
        outputStream.write(byteVal);
    }

    public void writeBinaryArray() throws IOException {
        OutputStream outputStream = null;
        byte[] byteVal = {1,2,3,4};
        outputStream.write(byteVal);
    }

    public void writeCharacter() throws IOException {

        Writer writer = null;
        char charBuffer = 'a';
        writer.write(charBuffer);

    }

    public void writeCharacterArray() throws IOException {

        Writer writer = null;
        char[] charBuffer = {'a','b','c','d'};
        writer.write(charBuffer);

    }




}
