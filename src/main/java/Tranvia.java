public class Tranvia implements Transporte {

    private String numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public void obtenerCapacidad() {

    }



}
