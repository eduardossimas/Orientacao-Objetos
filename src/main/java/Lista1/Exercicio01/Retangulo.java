package Lista1.Exercicio01;

public class Retangulo extends FormasGeometricas{
    private float largura;
    private float comprimento;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public double calcularArea() {
        return largura * comprimento;
    }
    public double calcularPerimetro() {
        return (2 * largura) + (2 * comprimento);
    }
}
