/**
 * Transforms file with json content to string which is ready to send in request
 */

package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonReader {

    public static String readFileAsStringFromDataFolder(String filePath) {
        String fileData = null;
        try {
            fileData = new String(Files.readAllBytes(Paths.get(Constants.DEFAULT_PROJECT_RELATIVE_PATH + filePath)));
        } catch (IOException e) { e.printStackTrace();
        } return fileData;
    }
}
