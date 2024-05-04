public class ConversionTemp{
    private double cel;

    public ConversionTemp(double cel){
        this.cel=cel;
    }
    public double obFarenheit(){
        return (9*cel + 160)/5;
    }
    public double getCel() {
        return cel;
    }
    public void setCel(double cel) {
        this.cel = cel;
    }
    
}