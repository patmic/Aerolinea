import BL.VueloBL;
import BL.Entities.Vuelo;
import FWK.AppConfiguration;
import GUI.pantalla;


public class App {
    public static void main(String[] args) throws Exception {
        AppConfiguration.load("src/appConfig.properties");
        pantalla x = new pantalla();
        x.setVisible(true);
        try {
            VueloBL vuelo = new VueloBL();
            for (Vuelo v : vuelo.getAllVuelo()) {
                System.out.println("Id: " + v.getId());
                System.out.println("Origen: " + v.getOrigen());
                System.out.println("Destino: " + v.getDestino());
                System.out.println("Fecha: " + v.getFecha());
                System.out.println("Clase: " + v.getClaseVuelo());
                System.out.println("Hora Salida: " + v.getHoraSalida());
                System.out.println("Hora Llegada: " + v.getHoraLlegada());
                System.out.println("Precio: " + v.getPrecio());
                System.out.println("Equipaje: ");
                for (String string : v.getEquipajePermitido()) {
                    System.out.println("\t- " + string);
                }
                System.out.println("-----------------------------------------------");
            }
        } catch (Exception e) {
            // TODO
        }
    }
}
