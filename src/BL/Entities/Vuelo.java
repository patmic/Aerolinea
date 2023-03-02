package BL.Entities;

public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private String fecha; 
    private String claseVuelo;
    private String horaSalida;
    private String horaLlegada;
    private int precio;
    private String[] equipajePermitido;

    
    public Vuelo(int id, String origen, String destino, String fecha, String claseVuelo, String horaSalida, String horaLlegada,
            int precio, String[] equipajePermitido) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.claseVuelo = claseVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.precio = precio;
        this.equipajePermitido = equipajePermitido;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getClaseVuelo() {
        return claseVuelo;
    }
    public void setClaseVuelo(String claseVuelo) {
        this.claseVuelo = claseVuelo;
    }
    public String getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    public String getHoraLlegada() {
        return horaLlegada;
    }
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String[] getEquipajePermitido() {
        return equipajePermitido;
    }
    public void setEquipajePermitido(String[] equipajePermitido) {
        this.equipajePermitido = equipajePermitido;
    }
}
