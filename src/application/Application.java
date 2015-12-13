package application;

import control.CalculateMoneyCommand;
import control.Command;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application extends JFrame {
    private Map<String, Command> commands = new HashMap<>();

    public static void main(String[] args) throws IOException {
        new Application().setVisible(true);
    }

    public Application() throws HeadlessException {
        deployUI();
        addCommands();
    }

    private void addCommands() {
        commands.put("Calculate",new CalculateMoneyCommand());
    }

    private void deployUI() {
        this.setTitle("Money Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(800,200));
        this.setLocationRelativeTo(null);
        this.getContentPane().add(applicationPanel());
    }

    private JPanel applicationPanel() {
        JPanel panel = new JPanel();
        panel.add(originalLabel());
        panel.add(originalCombo());
        panel.add(originalMoneyLabel());
        panel.add(originalMoneyTextField());
        panel.add(exchangeToLabel());
        panel.add(exchangeToCombo());
        panel.add(exchangeButton());
        panel.add(resultLabel());
        panel.add(resultField());
        return panel;
    }

    private JButton exchangeButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(e -> commands.get("Calculate").execute());
        return button;
    }

    private JTextField resultField() {
        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(140,24));
        return text;
    }

    private JLabel resultLabel() {
        JLabel label = new JLabel("Result: ");
        return label;
    }

    private JTextField originalMoneyTextField() {
        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(140,24));
        return text;
    }

    private JComboBox exchangeToCombo() {
        JComboBox combo = new JComboBox();
        return combo;
    }

    private JLabel originalMoneyLabel() {
        JLabel label = new JLabel("Money: ");
        return label;
    }

    private JLabel exchangeToLabel() {
        JLabel label = new JLabel("Exchange to: ");
        return label;
    }

    private JComboBox originalCombo() {
        JComboBox combo = new JComboBox();
        return combo;
    }

    private JLabel originalLabel() {
        JLabel label = new JLabel("Original: ");
        return label;
    }
}

