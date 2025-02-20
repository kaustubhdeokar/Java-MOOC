import java.io.*;
import java.nio.file.Paths;

public class TryWithResourcesMulti {

    public static void main(String[] args) throws IOException {

        tryWithResourcesMulti();

    }

    private static void tryWithResourcesMulti() throws IOException {

        char[] buffer = new char[10];

        try (Reader reader = new FileReader(Paths.get("src", "somefile").toString());
             Writer writer = new FileWriter(Paths.get("src", "somefile2").toString())) {

            int read;
            while ((read = reader.read(buffer)) >= 0) {
                writer.write(buffer, 0, read);
            }
        }

    }

}
