public class ConversorDolares{
    double pesos;
    public ConversorDolares(double pesos){
        this.pesos =pesos;
    }
    public double aDolares(){
        return 0.59*pesos;
    }
    public double getPesos() {
        return pesos;
    }
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    

}