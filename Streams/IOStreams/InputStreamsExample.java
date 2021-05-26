import java.io.*;
import java.nio.file.Paths;

public class InputStreamsExample {

    public static void main(String[] args) {
        try {
            readByteStream();
            readTextStream();
            readByteArrayStream();
            readTextArrayStream();
        } catch (IOException e) {
            System.out.println("Handling error" + e);
        }
    }

    /*
    Streams
    Unidirectional.
    Byte streams - binary streams
    Text streams - unicode characters
     */

    static void readByteStream() throws IOException {
        //input stream to be used.
        InputStream inputStream = new FileInputStream(Paths.get("src", "somefile").toString());
        int retVal;
        while ((retVal = inputStream.read()) >= 0) {
            byte byteVal = (byte) retVal;
            System.out.print(byteVal+" ");
        }
        System.out.println();
    }
    static void readTextStream() throws IOException {
        //reader to be used.
        Reader reader = new FileReader(Paths.get("src","somefile").toString());
        int retVal = 0;
        while((retVal=reader.read())>=0){
            System.out.print((char)retVal+" ");
        }
        System.out.println();
    }

    private static void readByteArrayStream() throws IOException {
        InputStream inputStream = new FileInputStream(Paths.get("src","somefile").toString());
        int retVal;
        byte[] byteArr = new byte[10];
        while((retVal=inputStream.read(byteArr))>=0){
            for(int i=0;i<retVal;i++){
                System.out.print(byteArr[i]+" ");
            }
        }
        System.out.println();
    }

    private static void readTextArrayStream() throws IOException{
        Reader fileReader = new FileReader(Paths.get("src","somefile").toString());
        int retVal;
        char[] charArr = new char[10];
        while((retVal=fileReader.read(charArr))>=0){
            for(int i=0;i<retVal;i++){
                System.out.print(charArr[i]+" ");
            }
        }
        System.out.println();
    }
}
