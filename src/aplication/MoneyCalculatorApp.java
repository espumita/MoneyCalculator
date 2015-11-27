package aplication;

import control.ExchangeOperation;
import model.*;
import view.persistance.CurrencySetLoader;

import java.io.IOException;

public class MoneyCalculatorApp {
    public static void main(String[] args) throws IOException {
        CurrencySet currencySet = new CurrencySetLoader().load();
        new ExchangeOperation().execute(currencySet);
    }
}

