public class Moto extends Vehiculo {
    private int cilindraje;
    private String tipo;

    public Moto(String marca, String modelo, int año, int cilindraje, String tipo) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindraje: " + cilindraje + ", Tipo: " + tipo;
    }
}
