
public class Moto extends Veiculo {

    private float cilindrada;

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorLocacao() {
        return 120.0;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nCilindrada: " + getCilindrada() + "cc";
    }
}
