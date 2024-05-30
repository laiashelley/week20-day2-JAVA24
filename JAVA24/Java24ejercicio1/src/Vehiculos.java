public class Vehiculos {
   
    protected String marca;
    protected float precio;
    protected int ruedas;

    private static float descuento = 0.50f;

    public Vehiculos() {
    }

    public Vehiculos(String marca, float precio, int ruedas) {
        this.marca = marca;
        this.precio = precio;
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public double getDescuento(){
        return precio * ( 1 - descuento);
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Precio: " + getPrecio() + "; " +
            "¿Cuantas ruedas tiene? " + getRuedas() + "; " + "El precio con el descuento correspondiente: " + getDescuento() +
            "}";
    }

}