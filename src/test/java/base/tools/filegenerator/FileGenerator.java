/**
 * @author Raman Darashenka  r.darashenka@andersenlab.com skype roman15940
 *
 * @description this file generator allows generate a file of any size and extension
 * @method createFile
 * @parameter float fileSize (bytes), String extension
 */

package base.tools.filegenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public final class FileGenerator {
    private final String userDir = System.getProperty("user.dir");
    private final String filePath = userDir + "/src/files/";

    public File createFile(float fileSize, String extension) {

        String newFileName = extension + LocalDateTime.now().getNano() + "." + extension;

        File file = new File(filePath, newFileName);
        try (BufferedWriter writer = new BufferedWriter ( new FileWriter (file))) {
            while (file.length() <= fileSize) {
                writer.write("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


}
