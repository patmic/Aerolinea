package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BL.Entities.Vuelo;
import DAC.VueloDAC;
import FWK.AppException;

public class VueloBL {
    public List<Vuelo> getAllVuelo() throws AppException{
        try {
            VueloDAC VueloDAC = new VueloDAC(); 
            List<Vuelo> lstVuelo = new ArrayList<Vuelo>();

            ResultSet rs =  VueloDAC.getAllVuelo();
            while(rs.next())    {
                String[] equipaje;
                equipaje = rs.getString("EQUIPAJE_PERMITIDO").split(",");
                Vuelo v = new Vuelo(rs.getInt("ID"),rs.getString("ORIGEN"),rs.getString("DESTINO"), rs.getString("FECHA"), rs.getString("CLASE_VUELO"),rs.getString("HORA_SALIDA"),rs.getString("HORA_LLEGADA"),rs.getInt("PRECIO"), equipaje); 
                lstVuelo.add(v);
            }
            return lstVuelo; 
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(),"getAllVuelo()");
        }
    }
}
