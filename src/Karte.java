public class Karte {
    int wert;
    int symbol;

    public Karte(int wert, int symbol){
        this.wert = wert;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Karte{" +
                "wert=" + wert +
                ", symbol=" + symbol +
                '}';
    }

     public int getWert(){
        return wert;
    }

    public int getSymbol(){
        return symbol;
    }
}
