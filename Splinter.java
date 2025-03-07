public class Splinter extends ArCondicionado{
    private String tipoSplinter;
    private double tamanho;
    
    public Splinter(String modelo, String codigo, String marca, int btu, boolean defeito, String tipoDefeito,
            String tipoSplinter, double tamanho) {
        super(modelo, codigo, marca, btu, defeito, tipoDefeito);
        this.tipoSplinter = tipoSplinter;
        this.tamanho = tamanho;
    }

    public String getTipoSplinter() {
        return tipoSplinter;
    }

    public void setTipoSplinter(String tipoSplinter) {
        this.tipoSplinter = tipoSplinter;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
}
