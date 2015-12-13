package control;


import application.CurrentSelectedExchange;
import model.Exchange;

public class CalculateMoneyCommand implements Command {
    private Exchange exchange;
    public CalculateMoneyCommand() {
        this.exchange = new CurrentSelectedExchange().load();
    }

    @Override
    public void execute() {

    }
}
