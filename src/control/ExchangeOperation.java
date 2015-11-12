package control;

import model.*;
import process.MoneyExchanger;
import persistance.CurrencyExchangeRateLoader;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

import java.io.IOException;

public class ExchangeOperation {
    public void execute(CurrencySet currencySet) throws IOException {
        Exchange exchange = new ExchangeDialog().execute(currencySet);
        ExchangeRate exchangeRate = new CurrencyExchangeRateLoader().load(exchange);
        Money money = new MoneyExchanger().exchange(new Money(exchange.getMoney().getCurrency(), exchange.getMoney().getAmount()), exchangeRate);
        new MoneyDisplay().execute(money);
    }
}
