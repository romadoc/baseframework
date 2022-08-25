/**
 * Getting value from prop file by key
 * Write value to prop file by key and value
 */

package utils;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

        private final String userDir = System.getProperty("user.dir");
        private String nameOfPropertyFile;
        private final String propertyKey;
        private final String pathToProperties = userDir + "/src/test/resources/" + nameOfPropertyFile;
        private FileInputStream fileInputStream;
        private final Properties property = new Properties();

    public PropertiesManager(String nameOfPropertyFile, String propertyKey) {
        this.nameOfPropertyFile = nameOfPropertyFile;
        this.propertyKey = propertyKey;
    }

    public String getInfoFromProperties () {
        try {
            fileInputStream = new FileInputStream(pathToProperties);
        } catch (FileNotFoundException e) {
            System.err.println("can't find properties file!");
        }
        try {
            property.load(fileInputStream);
        } catch (IOException e) {
            System.err.println("no properties file!");
        }
        String propValue = property.getProperty(propertyKey);

        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return propValue;
    }
    public void writeValueToProperties(String writeValue) {
        if (!StringUtils.isWhitespace(writeValue)) {
            try {
                fileInputStream = new FileInputStream(pathToProperties);
                property.load(fileInputStream);
                fileInputStream.close();
                FileOutputStream fileOutputStream = new FileOutputStream(pathToProperties);
                property.setProperty(propertyKey, writeValue);
                property.store(fileOutputStream, null);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
