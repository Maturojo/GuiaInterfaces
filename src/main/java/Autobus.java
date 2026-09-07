public class Autobus implements Transporte{
    private int numeroLinea;
    private int cantidad;
    private TipoTransporte tipo;

    public Autobus(TipoTransporte tipo, int numeroLinea, int cantidad) {
        this.tipo = tipo;
        this.numeroLinea = numeroLinea;
        this.cantidad = cantidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void obtenerCapacidad() {

    }

    @Override
    public void detener() {

    }





}
