import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReadStreams {


    public void readBinary() throws IOException {

        InputStream inputStream = null;
        int intVal;

        while((intVal=inputStream.read())>=0){

            byte byteVal = (byte) intVal;

        }

    }

    public void readBinaryArray() throws IOException {

        InputStream inputStream = null;
        int length;
        byte[] byteBuffer = new byte[10];
        while((length=inputStream.read(byteBuffer))>=0){
            for(int i=0;i<length;i++){
                byte byteVal = byteBuffer[i];

            }
        }
    }

    public void readCharacter() throws IOException {

        Reader reader = null;
        int intVal;

        while((intVal = reader.read())>=0){

            char charVal = (char) intVal;
        }

    }


    public void readCharacterArray() throws IOException {

        Reader reader = null;
        int length;
        char[] charBuffer = new char[10];

        while((length = reader.read(charBuffer))>=0){
            for(int i=0;i<length;i++){
                char charVal = charBuffer[i];

            }
        }

    }
}
