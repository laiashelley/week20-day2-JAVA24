public class Camion extends Vehiculos{
    
    private double volumen;

    public Camion(String marca, float precio, int ruedas, double volumen){
        super (marca, precio, ruedas);
        this.volumen = volumen;
    }

    public Camion() {
    }

    public Camion(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Precio: " + getPrecio() + "; " +
            "¿Cuantas ruedas tiene? " + getRuedas() + "; " + "¿Que volumen tiene el camión? " + getVolumen() + "; " + "El precio con el descuento correspondiente: " + getDescuento() +
            "}";
    }

}
