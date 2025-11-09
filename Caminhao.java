
public class Caminhao extends Veiculo {

    private double capacidadeDeCarga;

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public double calcularValorLocacao() {
        return 350.0;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nCapacidade de Carga: " + getCapacidadeDeCarga() + " toneladas";
    }
}
