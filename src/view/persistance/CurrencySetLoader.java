package view.persistance;

import model.Currency;
import model.CurrencySet;

import java.io.*;

public class CurrencySetLoader {
    public CurrencySet load() throws IOException {
        CurrencySet currencySet = new CurrencySet();
        File file = new File("currency.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null){
            String[] fields = line.split(",");
            currencySet.add(new Currency(fields[0],fields[1],fields[2]));
        }
        return currencySet;
    }
}
