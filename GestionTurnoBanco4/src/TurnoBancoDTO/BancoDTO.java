package TurnoBancoDTO;

public class BancoDTO {

    private  Integer id;
    private String tomarturno;
    private String llamarcliente;

    private String coladeespera;
     private String turnos;
     private  static int ultimoId;

    public BancoDTO(){
        this. id = ++ ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTomarturno() {
        return tomarturno;
    }

    public void setTomarturno(String tomarturno) {
        this.tomarturno = tomarturno;
    }

    public String getLlamarcliente() {
        return llamarcliente;
    }

    public void setLlamarcliente(String llamarcliente) {
        this.llamarcliente = llamarcliente;
    }

    public String getColadeespera() {
        return coladeespera;
    }

    public void setColadeespera(String coladeespera) {
        this.coladeespera = coladeespera;
    }

    public String getTurnos() {
        return turnos;
    }

    public void setTurnos(String turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "BancoDTO{" +
                "id=" + id +
                ", tomarturno='" + tomarturno + '\'' +
                ", llamarcliente='" + llamarcliente + '\'' +
                ", coladeespera='" + coladeespera + '\'' +
                ", turnos='" + turnos + '\'' +
                '}';
    }
}
