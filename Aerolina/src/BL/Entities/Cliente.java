package BussinesLogic.Entities;

public class Cliente {
    private int ID_CLIENTE;
    private String CLIENTE;
    private String TIPOCLIENTE;
    private String CORREO;

    public Cliente(int iD_CLIENTE, String cLIENTE, String tIPOCLIENTE, String cORREO) {
        ID_CLIENTE = iD_CLIENTE;
        CLIENTE = cLIENTE;
        TIPOCLIENTE = tIPOCLIENTE;
        CORREO = cORREO;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int iD_CLIENTE) {
        ID_CLIENTE = iD_CLIENTE;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String cLIENTE) {
        CLIENTE = cLIENTE;
    }

    public String getTIPOCLIENTE() {
        return TIPOCLIENTE;
    }

    public void setTIPOCLIENTE(String tIPOCLIENTE) {
        TIPOCLIENTE = tIPOCLIENTE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String cORREO) {
        CORREO = cORREO;
    }

    public static void add(Cliente l) {
    }
}

