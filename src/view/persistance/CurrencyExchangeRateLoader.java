package view.persistance;

import model.Exchange;
import model.ExchangeRate;

public class CurrencyExchangeRateLoader {

    public ExchangeRate load(Exchange exchange) {
       return new ExchangeRate(exchange.getMoney().getCurrency(),exchange.getCurrency(),1.2);
    }
}
