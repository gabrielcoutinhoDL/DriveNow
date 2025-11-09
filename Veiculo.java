
public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDados() {
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno();
    }

    public abstract double calcularValorLocacao();
}
