import BL.*;
import BL.Entities.Cliente;
import FWK.AppConfiguration;

public class App6 {
    public static void main(String[] args) throws Exception {
        AppConfiguration.load("src/config.properties"); 
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.print("ID_CLIENTE\t\t");
        System.out.print("NOMBRE\t");
        System.out.print("TIPOCLIENTE\t\t");
        System.out.print("CORREO\t\t");

        try {
            ClienteCarlos carlos = new ClienteCarlos();
            for (Cliente p : carlos.getAllCarlos()) {
                System.out.print(p.getID_CLIENTE() + "\t\t");
                System.out.print(p.getCLIENTE() + "\t\t");
                System.out.print(p.getTIPOCLIENTE() + "\t\t");               
                System.out.print(p.getCORREO() + "\t\t");
            }
        } catch (Exception e) {

        }

        try {
            ClienteDamaris damaris = new ClienteDamaris();
            for (Cliente p : damaris.getAllDamaris()) {
                System.out.print(p.getID_CLIENTE() + "\t\t");
                System.out.print(p.getCLIENTE() + "\t\t");
                System.out.print(p.getTIPOCLIENTE() + "\t\t");               
                System.out.print(p.getCORREO() + "\t\t");
            }
        } catch (Exception e) {

        }

        try {
            ClienteFrancis francis = new ClienteFrancis();
            for (Cliente p : francis.getAllFrancis()) {
                System.out.print(p.getID_CLIENTE() + "\t\t");
                System.out.print(p.getCLIENTE() + "\t\t");
                System.out.print(p.getTIPOCLIENTE() + "\t\t");               
                System.out.print(p.getCORREO() + "\t\t");
            }
        } catch (Exception e) {

        }

        try {
            ClienteStalin stalin = new ClienteStalin();
            for (Cliente p : stalin.getAllStalin()) {
                System.out.print(p.getID_CLIENTE() + "\t\t");
                System.out.print(p.getCLIENTE() + "\t\t");
                System.out.print(p.getTIPOCLIENTE() + "\t\t");               
                System.out.print(p.getCORREO() + "\t\t");
            }
        } catch (Exception e) {

        }

        try {
            ClienteAlexa alexa = new ClienteAlexa();
            for (Cliente p : alexa.getAllAlexa()) {
                System.out.print(p.getID_CLIENTE() + "\t\t");
                System.out.print(p.getCLIENTE() + "\t\t");
                System.out.print(p.getTIPOCLIENTE() + "\t\t");               
                System.out.print(p.getCORREO() + "\t\t");
            }
        } catch (Exception e) {

        }

    }
}