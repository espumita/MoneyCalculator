package control;

import model.*;
import view.CurrencySetLoader;

import java.io.IOException;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException {
        CurrencySet currencySet = new CurrencySetLoader().load();
       // Exchange exchange = new Exchange(new Money("EUR", 800), new Currency("EUR","euro","€"));
        Currency euro = new Currency("EUR","euro","€");
        ExchangeRate exchangeRate = new ExchangeRate(euro,new Currency("Otro","otro","X"),1.2);
        new MoneyExchanger().exchange(new Money(euro, 800),exchangeRate);
    }
}
