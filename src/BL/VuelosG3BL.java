package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAC.VuelosG3DAC;
import BL.Entities.VuelosG3;

public class VuelosG3BL {
    private VuelosG3DAC vuelosDAC;
    
    public VuelosG3BL(VuelosG3DAC vuelosDAC) {
        this.vuelosDAC = vuelosDAC;
    }

    public List<VuelosG3> obtenerVuelos() throws SQLException {
        List<VuelosG3> vuelos = new ArrayList<VuelosG3>();
        ResultSet rs = vuelosDAC.obtenerVuelos();

        while (rs.next()) {
            VuelosG3 vuelo = new VuelosG3();
            vuelo.setId(rs.getInt("ID_VUELOS"));
            vuelo.setDesde(rs.getString("DESDE"));
            vuelo.setHasta(rs.getString("HASTA"));
            vuelo.setFecha(rs.getString("FECHA"));
            vuelo.setPrecio(rs.getString("PRECIO"));
            vuelo.setDuracion(rs.getString("DURACION"));
            vuelo.setClase(rs.getString("CLASE_VUELO"));
            vuelo.setHoraSalida(rs.getString("HORA_SALIDA"));
            vuelo.setHoraLlegada(rs.getString("HORA_LLEGADA"));
            vuelos.add(vuelo);
        }

        return vuelos;
    }

    
}
