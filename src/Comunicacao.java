
public class Comunicacao {
    private int idComunicacao;
    private String tipo; 
    private String mensagem; 
    private String data; 
    private String hora;  
    private String remetente; 
    private String destinatario; 

    public Comunicacao() {}

    public int getIdComunicacao() { return idComunicacao; }
    public void setIdComunicacao(int idComunicacao) { this.idComunicacao = idComunicacao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getRemetente() { return remetente; }
    public void setRemetente(String remetente) { this.remetente = remetente; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
}