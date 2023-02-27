package FWK;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfiguration {
    private static Properties config = null;

    public static boolean load(String pathConfigFile){
        try{
            if (config == null)   
                config = new Properties();
            InputStream configInput = new FileInputStream(pathConfigFile);
            config.load(configInput);

            System.out.println(">> (ok) AppConfiguration.load()");
            return true;
        }  
        catch (IOException e) {  //FileNotFoundException
            System.out.println(">> (error) AppConfiguration.load() "+ e.getMessage());
        }
        return false;
    }

    public static String getDBPathConnection(){
        if (config != null && config.containsKey(APP.GLOBAL.KEY_DB_NAME) && config.containsKey(APP.GLOBAL.KEY_DB_FULLPATH)){
            String dbName  = config.getProperty(APP.GLOBAL.KEY_DB_NAME);
            String dbPath  = config.getProperty(APP.GLOBAL.KEY_DB_FULLPATH);
            dbPath =  "jdbc:sqlite:" + dbPath.replace('/', '\\') + "\\\\" + dbName;
            return dbPath;  
        }
        else
            System.out.println(">> (issue) AppConfiguration.getDBPathConnection(), llamar primero a AppConfiguration.load() y agregar KEY_DB_NAME y KEY_DB_FULLPATH en CONFIG ");
        return "";
    }
}