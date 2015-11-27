package control;

import model.*;
import model.MoneyExchanger;
import view.persistance.CurrencyExchangeRateLoader;
import view.UI.ExchangeDialog;
import view.UI.MoneyDisplay;

import java.io.IOException;

public class ExchangeOperation {
    public void execute(CurrencySet currencySet) throws IOException {
        Exchange exchange = new ExchangeDialog().execute(currencySet);
        ExchangeRate exchangeRate = new CurrencyExchangeRateLoader().load(exchange);
        Money money = new MoneyExchanger().exchange(new Money(exchange.getMoney().getCurrency(), exchange.getMoney().getAmount()), exchangeRate);
        new MoneyDisplay().execute(money);
    }
}
