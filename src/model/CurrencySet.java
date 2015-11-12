package model;

import java.util.HashMap;
import java.util.Map;

public class CurrencySet {
    private final Map<String,Currency> currencyMap;

    public CurrencySet() {
        this.currencyMap = new HashMap<>();
    }

    public Map<String, Currency> getCurrencyMap() {
        return currencyMap;
    }

    public void add(Currency currency){
        currencyMap.put(currency.getCode(),currency);
    }

    @Override
    public String toString(){
        String string = "";
        for ( String code : currencyMap.keySet()) string += currencyMap.get(code).toString() + "\n";
        return string;
    }

    public Currency findCurrencyInCurrencySetByCode(String code) {
        return currencyMap.get(code);
    }
}
