public class ArCondicionado {

    private String modelo;
    private String codigo;
    private String marca;
    private int btu;
    private boolean defeito;
    private String tipoDefeito;
    
    public ArCondicionado(String modelo, String codigo, String marca, int btu, boolean defeito, String tipoDefeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
        this.tipoDefeito = tipoDefeito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBtu() {
        return btu;
    }

    public void setBtu(int btu) {
        this.btu = btu;
    }

    public boolean isDefeito() {
        return defeito;
    }

    public void setDefeito(boolean defeito) {
        this.defeito = defeito;
    }

    public String getTipoDefeito() {
        return tipoDefeito;
    }

    public void setTipoDefeito(String tipoDefeito) {
        this.tipoDefeito = tipoDefeito;
    }
    

}