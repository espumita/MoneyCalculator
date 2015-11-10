public class MoneyCalculator {
    public static void main(String[] args) {
        Currency euro = new Currency("EUR", "euro", "€");
        Currency dolar = new Currency("USD", "Dolar americano", "$");
        Currency libra = new Currency("GBP","Libra británica","£");
        Money money = new Money(euro,800);
        ExchangeRate exchangeRate = new ExchangeRate(euro,dolar,1.21);
        Money result = MoneyExchanger.exchange(money,exchangeRate);


    }
}
