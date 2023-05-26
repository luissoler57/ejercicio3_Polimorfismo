package supermercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento {

    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate caducidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
    }

    /* Metodos implementados */
    @Override
    public void setCaducidad(LocalDate fechaCaducidad) {
        caducidad = fechaCaducidad;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if (tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if (tipoCereal.equalsIgnoreCase("maiz")) {
            return 8;
        } else if (tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

    /* Metodo toString */
    @Override
    public String toString() {
        return "Cereales marca= " + marca +
                ",\n tipoCereal= " + tipoCereal +
                ",\n precio= " + precio +
                ",\n caducidad= " + caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\nCalorias= " + getCalorias() +
                "\n";
    }

}
