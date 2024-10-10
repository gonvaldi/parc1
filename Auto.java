public class Auto extends Vehiculo {
    private int numeroPuertas;
    private boolean esAutomatico;

    public Auto(String marca, String modelo, int año, int numeroPuertas, boolean esAutomatico) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.esAutomatico = esAutomatico;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Puertas: " + numeroPuertas + ", Es Automático: " + esAutomatico;
    }
}
