public class CostoAuto{
    private double costoa,costof,pgv,impuestos;
    
    public double getCostoa() {
        return costoa;
    }
    public void setCostoa(double costoa) {
        this.costoa = costoa;
    }
    public double getPgv() {
        return pgv;
    }
    public void setPgv(double pgv) {
        this.pgv = costoa*.12;
    }
    public double getImpuestos() {
        return impuestos;
    }
    public void setImpuestos(double impuestos) {
        this.impuestos = costoa*.06;
    }
    
    public double getCostof() {
        return costof;
    }
    public void setCostof(double costof) {
        this.costof = costoa+pgv+impuestos;
    }
    public double calcularCosto(){
        return costoa+pgv+impuestos;
    }
    
    @Override
    public String toString() {
        return "CostoAuto [costoa=" + costoa + ", costof=" + costof + ", pgv=" + pgv + ", impuestos=" + impuestos + "]";
    }
    
}