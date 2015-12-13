package view.UI;

import model.Money;

public class MoneyDisplay {

    public void execute(Money money) {
        System.out.println(money.amount() +"  "+ money.currency().symbol());
    }
}
