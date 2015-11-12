package model;

public class Currency {
    private final String code;
    private final String name;
    private final String symbol;

    public Currency(String name, String symbol,String code) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Moneda: "+ name +" Código: "+ code +"  Símbolo: "+symbol;
    }
}
