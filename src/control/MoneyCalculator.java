package control;

import model.*;
import view.CurrencyExchangeReader;
import view.CurrencyExchangeRateLoader;
import view.CurrencySetLoader;

import java.io.IOException;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException {
        CurrencySet currencySet = new CurrencySetLoader().load();
        //Se los muestro al usuario
        Exchange exchange = new CurrencyExchangeReader().read();
        ExchangeRate exchangeRate = new CurrencyExchangeRateLoader().load(exchange);
        Money money = new MoneyExchanger().exchange(new Money(exchange.getMoney().getCurrency(), exchange.getMoney().getAmount()), exchangeRate);
        //Se lo muestro al usuario
    }
}
