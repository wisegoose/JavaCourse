
import javax.swing.*;

class Calculator extends JFrame {

    public Calculator()
    {
        //setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelCalculator().panel1);
        setVisible(true);
    }
}
