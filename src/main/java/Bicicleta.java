public class Bicicleta implements Transporte{

    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;

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
