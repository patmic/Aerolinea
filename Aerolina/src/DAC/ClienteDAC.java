package DAC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import FWK.AppConfiguration;
import FWK.AppException;

public class ClienteDAC extends DataHelperSQLite {
    public ClienteDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllCarlos() throws AppException{
        try {
            String sql =    "SELECT * FROM CLIENTE " +
                            "WHERE   ID_CLIENTE = 1 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCarlos()");
        }
    }

    public ResultSet getAllDamaris() throws AppException{
        try {
            String sql =    "SELECT * FROM CLIENTE " +
                            "WHERE   ID_CLIENTE = 2 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllDamaris()");
        }
    }

    public ResultSet getAllFrancis() throws AppException{
        try {
            String sql =    "SELECT * FROM CLIENTE " +
                            "WHERE   ID_CLIENTE = 3 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllFrancis()");
        }
    }

    public ResultSet getAllStalin() throws AppException{
        try {
            String sql =    "SELECT * FROM CLIENTE " +
                            "WHERE   ID_CLIENTE = 4 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllStalin()");
        }
    }

    public ResultSet getAllAlexa() throws AppException{
        try {
            String sql =    "SELECT * FROM CLIENTE " +
                            "WHERE   ID_CLIENTE = 5 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllAlexa()");
        }
    }

}