public class PortaContainer extends VeiculoFluvial implements Transporte {

    private double capacidadeCarga;
    private String categoria;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularFrete(double peso, double altura,
                                double largura, double distancia) {

        return peso + (altura * largura * distancia);
    }
}