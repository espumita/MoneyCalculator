package control;

import model.*;
import view.ExchangeDialog;
import view.CurrencyExchangeRateLoader;
import view.CurrencySetLoader;

import java.io.IOException;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException {
        CurrencySet currencySet = new CurrencySetLoader().load();
        Exchange exchange = new ExchangeDialog().execute(currencySet);
        ExchangeRate exchangeRate = new CurrencyExchangeRateLoader().load(exchange);
        Money money = new MoneyExchanger().exchange(new Money(exchange.getMoney().getCurrency(), exchange.getMoney().getAmount()), exchangeRate);
        //Se lo muestro al usuario
    }
}
