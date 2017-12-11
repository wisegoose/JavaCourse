
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JTextField passwordRepeat;
    private JButton signInButton;
    private JButton loginButton;
    private JPanel loginForm;
    public JLabel info;


    LoginForm() {
         setContentPane(loginForm);
         setVisible(true);
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = usernameTextField.getText();
                String pass = passwordTextField.getText();

                new Login(name, pass);
            }
        });
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = usernameTextField.getText();
                String pass = passwordTextField.getText();
                String pass2 = passwordRepeat.getText();

                new Login(name, pass, pass2);
            }
        });
    }
}
