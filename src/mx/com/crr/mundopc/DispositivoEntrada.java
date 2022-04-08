package mx.com.crr.mundopc;

/**
 * @author ClaudioNicolas
 */
public class DispositivoEntrada {

    private String topoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.topoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTopoEntrada() {
        return topoEntrada;
    }

    public void setTopoEntrada(String topoEntrada) {
        this.topoEntrada = topoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "topoEntrada=" + topoEntrada + ", marca=" + marca + '}';
    }

}
