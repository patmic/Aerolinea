package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BL.Entities.Cliente;
import DAC.ClienteDAC;
import Framework.AppException;


public class ClienteStalin {
    public List<Cliente> getAllStalin( ) throws AppException{
        try {
            ClienteDAC ClienteDAC = new ClienteDAC();  
            List<Cliente> Cliente = new ArrayList<Cliente>();
            ResultSet rs = ClienteDAC.getAllCarlos();
            while(rs.next())    {
                Cliente l = new Cliente(rs.getInt("ID_CLIENTE")
                                            , rs.getString("CLIENTE")
                                            , rs.getString("TIPOCLIENTE")
                                            , rs.getString("CORREO")); ;
                Cliente.add(l);
            }
            return Cliente;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllStalin");
        }
    } 
   
}