public class CostoAuto {
    // Variables para el costo inicial del automóvil, el costo final, el pago del vendedor (pgv) y los impuestos
    private double costoa, costof, pgv, impuestos;
    
    // Método para obtener el costo inicial del automóvil
    public double getCostoa() {
        return costoa;
    }
    
    // Método para establecer el costo inicial del automóvil
    public void setCostoa(double costoa) {
        this.costoa = costoa;
    }
    
    // Método para obtener el pago del vendedor (pgv)
    public double getPgv() {
        return pgv;
    }
    
    // Método para establecer el pago del vendedor (pgv)
    public void setPgv(double pgv) {
        this.pgv = costoa * 0.12;
    }
    
    // Método para obtener los impuestos
    public double getImpuestos() {
        return impuestos;
    }
    
    // Método para establecer los impuestos
    public void setImpuestos(double impuestos) {
        this.impuestos = costoa * 0.06;
    }
    
    // Método para obtener el costo final del automóvil
    public double getCostof() {
        return costof;
    }
    
    // Método para establecer el costo final del automóvil
    public void setCostof(double costof) {
        this.costof = costoa + pgv + impuestos;
    }
    
    // Método para calcular el costo total del automóvil
    public double calcularCosto() {
        return costoa + pgv + impuestos;
    }
    
    // Método toString para representar la información del costo del automóvil
    @Override
    public String toString() {
        return "CostoAuto [costoa=" + costoa + ", costof=" + costof + ", pgv=" + pgv + ", impuestos=" + impuestos + "]";
    }
}