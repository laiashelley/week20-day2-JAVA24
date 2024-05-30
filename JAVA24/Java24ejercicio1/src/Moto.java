public class Moto extends Vehiculos{

    private boolean derrapar;

    public Moto(String marca, float precio, int ruedas, boolean derrapar){
        super (marca, precio, ruedas);
        this.derrapar = derrapar;
    }

    public Moto() {
    }

    public Moto(boolean derrapar) {
        this.derrapar = derrapar;
    }

    public boolean isDerrapar() {
        return this.derrapar;
    }

    public boolean getDerrapar() {
        return this.derrapar;
    }

    public void setDerrapar(boolean derrapar) {
        this.derrapar = derrapar;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Precio: " + getPrecio() + "; " +
            "¿Cuantas ruedas tiene? " + getRuedas() + "; " + "¿La moto derrapa? " + getDerrapar() + "; " + "El precio con el descuento correspondiente: " + getDescuento() +
            "}";
    }
    
}
