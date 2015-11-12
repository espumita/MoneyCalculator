package view;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeDialog {

    public Exchange execute(CurrencySet currencySet) throws IOException {
        System.out.println("Divisas disponibles para calcular: \n______________________________________\n"+currencySet.toString()+"______________________________________\n");
        System.out.println("Introduzca la divisa inicial: ");
        Currency from = readCurrency(currencySet);
        System.out.println("Introduzca la cantidad: ");
        double amount = readAmount();
        System.out.println("Introduzca la divisa final: ");
        Currency to = readCurrency(currencySet);
        return new Exchange(new Money(from,amount ), to);
    }

    private double readAmount() {
        try {
            return Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            return 0;
        }
    }

    private Currency readCurrency(CurrencySet currencySet) throws IOException {
        Currency currency;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String code = "";
        do{
            System.out.print("Código: ");
            code = buffer.readLine();
        }while ((currency = currencySet.findCurrencyInCurrencySetByCode(code))  == null);
        return currency;
    }
}
