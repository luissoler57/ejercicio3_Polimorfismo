package supermercado;

/* Implementa la interface "EsLiquido" and "ConDescuentos*/
public class Detergente implements EsLiquido, ConDescuento {

    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    /* Constructor con parametor "marca" and "precio" */
    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    /* Getters and Setters */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /* Metodos implementados de interface */
    @Override /* Sobre Escribe un metodo - en este caso el definido en la interface */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String envase) {
        tipoEnvase = envase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override /* Sobre Escribe un metodo - en este caso el definido en la interface */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * (descuento / 100.00));
    }

    /* Metodo toString */
    @Override
    public String toString() {
        return "Detergente \nmarca= " + marca +
                ",\n precio= " + precio +
                ",\n volumen= " + volumen +
                ",\n tipoEnvase= " + tipoEnvase +
                ",\n descuento= " + descuento +
                ",\n Precion con descuento= " + getPrecioDescuento() +
                "\n";
    }

}
