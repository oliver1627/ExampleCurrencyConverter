package Currency;

public class Converter {
    private double usdToCad;
   

    public Converter(double usdToCad) {
        this.usdToCad = usdToCad;
     
    }

    public double convertToCad(double usdAmount) {
        return usdAmount * usdToCad;
    }

 
    }

