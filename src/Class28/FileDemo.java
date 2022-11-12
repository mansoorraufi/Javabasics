package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        //right click on your file and click copypathreferance then click from Content root

        var path = "Data/config.properties"; // location of the file
        var fileInputStream = new FileInputStream(path); // it help us Navigate to the file (Opens the file)
        var properties = new Properties(); // that special software which helps us read the file
        properties.load(fileInputStream); // loads all the data from the file inside (Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); // close the file. its very important
    }
}
