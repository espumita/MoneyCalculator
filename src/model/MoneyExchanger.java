package model;

public class MoneyExchanger {

    public static Money exchange(Money money, ExchangeRate exchangeRate) {
        return new Money(exchangeRate.to(), money.amount() * exchangeRate.rate());
    }
}
