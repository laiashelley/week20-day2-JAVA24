public class Coche extends Vehiculos{

    private boolean tienePantalla;

    public Coche(String marca, float precio, int ruedas, boolean tienePantalla){
        super (marca, precio, ruedas);
        this.tienePantalla = tienePantalla;
    }

    public Coche() {
    }

    public Coche(boolean tienePantalla) {
        this.tienePantalla = tienePantalla;
    }

    public boolean isTienePantalla() {
        return this.tienePantalla;
    }

    public boolean getTienePantalla() {
        return this.tienePantalla;
    }

    public void setTienePantalla(boolean tienePantalla) {
        this.tienePantalla = tienePantalla;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Precio: " + getPrecio() + "; " +
            "¿Cuantas ruedas tiene? " + getRuedas() + "; " + "¿Tiene pantalla de navegación? " + getTienePantalla() + "; " + "El precio con el descuento correspondiente: " + getDescuento() +
            "}";
    }

}
