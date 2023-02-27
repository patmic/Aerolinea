package DAC;


import java.sql.ResultSet;
import java.sql.SQLException;


public class VuelosG3DAC extends DataHelperSQLite {
    public VuelosG3DAC(String dbPathConnection) {
        super(dbPathConnection);
    }

    public ResultSet obtenerVuelos() throws SQLException {
        String sql = "SELECT * FROM VUELOS";
        ResultSet rs = getResultSet(sql);
        return rs;
    }
}