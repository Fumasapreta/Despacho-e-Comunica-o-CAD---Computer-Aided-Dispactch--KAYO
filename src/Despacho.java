
public class Despacho {
    private int idDespacho; 
    private String dataDespacho; 
    private String horaDespacho; 
    private String status;

    public Despacho() {}

    public int getIdDespacho() { return idDespacho; }
    public void setIdDespacho(int idDespacho) { this.idDespacho = idDespacho; }

    public String getDataDespacho() { return dataDespacho; }
    public void setDataDespacho(String dataDespacho) { this.dataDespacho = dataDespacho; }

    public String getHoraDespacho() { return horaDespacho; }
    public void setHoraDespacho(String horaDespacho) { this.horaDespacho = horaDespacho; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}