package view;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class CurrencyExchangeLoader {

    public Exchange execute() {
        Currency euro = new Currency("EUR","euro","€");//ME LO DA EL USUARIO
        Currency libra = new Currency("asd","libra","X");//ME LO DA EL USUARIO
        double amount = 800; //ME LO DA EL USUARIO
        return new Exchange(new Money(euro, amount), libra);
    }
}
