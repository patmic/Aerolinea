package BL.Entities;

public class VuelosG3 {
    private int id;
    private String desde;
    private String hasta;
    private String fecha;
    private String precio;
    private String duracion;
    private String clase;
    private String horaSalida;
    private String horaLlegada;
    
    public VuelosG3(int id, String desde, String hasta, String fecha, String precio, String duracion, String clase,
            String horaSalida, String horaLlegada) {
        this.id = id;
        this.desde = desde;
        this.hasta = hasta;
        this.fecha = fecha;
        this.precio = precio;
        this.duracion = duracion;
        this.clase = clase;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public VuelosG3() {
        // Constructor vacío
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
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
    
    
}
