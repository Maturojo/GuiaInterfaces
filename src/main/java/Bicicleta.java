public class Bicicleta implements Transporte{

    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
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

        return 1;
    }

    void ajustarAsiento(int altura){
        System.out.println("Subiendo altura a " + altura);
    }


}
