public class Gasolinera {
    private double galón, precio, litros;
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    
    public Gasolinera(double galón) {
        this.galón = galón;
    }
    
    public double Alitros() {
        return galón * 3.785411784;
    }
    
    public double calcularPrecio() {
        return Alitros() * 25.749;
    }
    

}