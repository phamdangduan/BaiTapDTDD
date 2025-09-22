import javax.swing.*;

public class BankLoginScreen extends JFrame {
    public BankLoginScreen() {
        setTitle("Bank Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(80, 30, 140, 40);
        usernameField.setBorder(BorderFactory.createTitledBorder("Username"));

        JPasswordField passField = new JPasswordField();
        passField.setBounds(80, 70, 140, 40);
        passField.setBorder(BorderFactory.createTitledBorder("Password"));

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 120, 100, 40);

        add(usernameField);
        add(passField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Bank Login Success!");
            // Có thể mở màn hình tiếp theo tại đây
        });

        setVisible(true);
    }
}
