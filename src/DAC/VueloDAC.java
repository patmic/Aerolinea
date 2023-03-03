package DAC;

import java.sql.ResultSet;
import java.sql.SQLException;

import FWK.AppConfiguration;
import FWK.AppException;

public class VueloDAC extends DataHelperSQLite{
    public VueloDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllVuelo() throws AppException{
        try {
            String sql =    "SELECT  * " +
                            "FROM    VUELOS ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllVuelos()");
        }
    }
}
