import javax.swing.*;
import java.awt.event.ActionListener;

public class BankSelectionScreen extends JFrame {
    public BankSelectionScreen() {
        setTitle("Select Bank");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton bank1 = new JButton("ACB Bank");
        bank1.setBounds(80, 40, 140, 30);

        JButton bank2 = new JButton("Vietcombank");
        bank2.setBounds(80, 90, 140, 30);

        JButton bank3 = new JButton("TPBank");
        bank3.setBounds(80, 140, 140, 30);

        add(bank1);
        add(bank2);
        add(bank3);

        ActionListener login = e -> {
            dispose();
            new BankLoginScreen();
        };

        bank1.addActionListener(login);
        bank2.addActionListener(login);
        bank3.addActionListener(login);

        setVisible(true);
    }
}
