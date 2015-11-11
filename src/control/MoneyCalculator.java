package control;

import model.*;
import view.CurrencyExchangeLoader;
import view.CurrencySetLoader;

import java.io.IOException;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException {
        CurrencySet currencySet = new CurrencySetLoader().load();
        Exchange exchange = new CurrencyExchangeLoader().execute();
        ExchangeRate exchangeRate = new ExchangeRate(exchange.getMoney().getCurrency(),exchange.getCurrency(),1.2); //Esto debe de venir de la db
        new MoneyExchanger().exchange(new Money(exchange.getMoney().getCurrency(), exchange.getMoney().getAmount()),exchangeRate);
    }
}
