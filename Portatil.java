public class Portatil extends ArCondicionado{
    private double voltagem;
    private String cor;

    public Portatil(String modelo, String codigo, String marca, int btu, boolean defeito, String tipoDefeito,
            double voltagem, String cor) {
        super(modelo, codigo, marca, btu, defeito, tipoDefeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
