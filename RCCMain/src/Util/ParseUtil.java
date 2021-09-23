package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ParseUtil {
    private static ParseUtil instance;
    private ParseUtil(){

    }
    public static ParseUtil getInstance(){
        if(instance==null)
            instance = new ParseUtil();
        return instance;
    }
    public Properties getProperties() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\pattn\\IdeaProjects\\RCCDetailing\\RCCMain\\src\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
