public class Aviao extends VeiculoAereo implements Transporte {

    private double capacidadeCarga;
    private double volumePMD;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getVolumePMD() {
        return volumePMD;
    }

    public void setVolumePMD(double volumePMD) {
        this.volumePMD = volumePMD;
    }

    @Override
    public double calcularFrete(double peso, double altura,
                                double largura, double distancia) {

        return ((peso * peso) + (altura * largura))
                * distancia * 9.99;
    }
}