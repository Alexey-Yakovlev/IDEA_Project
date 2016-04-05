/**
 * Created by Lexx on 05.04.2016.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {

    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public static void main(String[] args) {

        //инициализируем специальный объект Properties типа Hashtable для удобной работы с данными
        Properties prop = new Properties();

        try {
            //обращаемся к файлу и получаем данные
            FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);

            String site = prop.getProperty("site");
            String loginToSite = prop.getProperty("login");
            String passwordToSite = prop.getProperty("password");

            //печатаем полученные данные в консоль
            System.out.println("site: " + site + "\nloginToSite: " + loginToSite + "\npasswordToSite: " + passwordToSite);

        } catch (IOException e) {
            System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            e.printStackTrace();
        }

    }

}