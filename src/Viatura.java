
public class Viatura {
    private int idViatura; 
    private String tipo; 
    private String prefixo; 
    private String placa; 
    private String status; 
    private String localizacao; 

    public Viatura() {}

    public int getIdViatura() { return idViatura; }
    public void setIdViatura(int idViatura) { this.idViatura = idViatura; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getPrefixo() { return prefixo; }
    public void setPrefixo(String prefixo) { this.prefixo = prefixo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}