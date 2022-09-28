package POO.exercise01;

public class Transporte {

    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;


    public Transporte(){}

    public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.carga_maxima = carga_maxima;
        this.potencia = potencia;
    }


    public Double consumo(){
        return (potencia * carga_maxima * 100);
    }

    public String leiaModelo(){
        return "Modelo: " + modelo;
    }

    public void gravaModelo(String mod){
        modelo = mod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(Double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }


}
