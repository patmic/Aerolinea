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

    public static String getDBName(){
        if (config != null)  
            return config.getProperty(APP.GLOBAL.DB_NAME);  
        else
            System.out.println(">> (issue) AppConfiguration.getDB_NAME(), llamar primero a AppConfiguration.load() y agregar DB_NAME en CONFIG ");
        return "";
    }
    public static String getDBPathConnection(){
        if (config != null && config.containsKey(APP.GLOBAL.DB_PATH)){
            String dbName  = getDBName();
            String dbPath  = config.getProperty(APP.GLOBAL.DB_PATH); 
            dbPath =  "jdbc:sqlite:" + dbPath.replace('/', '\\') + "\\\\" + dbName;
            return dbPath;  
        }
        else
            System.out.println(">> (issue) AppConfiguration.DB_PATH(), llamar primero a AppConfiguration.load() y agregar DB_PATH en CONFIG ");
        return "";
    }
}
