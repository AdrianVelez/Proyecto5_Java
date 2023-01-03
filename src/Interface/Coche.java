package Interface;

public class Coche {

    private String modelo;
    private String marca;
    private int puertas;

    public Coche(String modelo, String marca, int puertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
