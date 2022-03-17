package TestNG19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDriveTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bagau\\IdeaProjects\\Learning\\src\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        prop.setProperty("browser", "firefox");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\bagau\\IdeaProjects\\Learning\\src\\data.properties");
        prop.store(fos, null);
    }
}
