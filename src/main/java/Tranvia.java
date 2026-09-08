public class Tranvia implements Transporte {

    private String numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    public String getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(String numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
    public void detener() {

    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    void cambiarVia(int nuevaVia){
        System.out.println("Cambiando a la via: " + nuevaVia);
    }

}
