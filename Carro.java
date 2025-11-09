
public class Carro extends Veiculo {

    private int QuantidadeDePortas;

    public int getQuantidadeDePortas() {
        return QuantidadeDePortas;
    }

    public void setQuantidadeDePortas(int QuantidadeDePortas) {
        this.QuantidadeDePortas = QuantidadeDePortas;
    }

    @Override
    public double calcularValorLocacao() {
        return 200.0;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nQuantidade de Portas: " + getQuantidadeDePortas();
    }
}
