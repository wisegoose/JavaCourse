
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelCalculator extends JPanel {
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JTextField txt1;
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMulti;
    private JButton bDivision;
    private JButton bRes;
    private JButton bPoint;
    private JButton bClear;
    static double num = 0;
    static double num1 = 0;
    static String operation = "";
    static double res;

    public JPanelCalculator()
    {
        try
        {
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 1);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    txt1.setText(txt1.getText() + 2);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 3);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 4);
                    if (num==0)
                    {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 5);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 6);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 7);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 8);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 9);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 0);
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    num = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    operation = "+";
                }
            });

            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    num = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    operation = "-";
                }
            });

            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    num = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    operation = "*";
                }
            });

            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    num = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    operation = "/";
                }
            });

            bClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText("");
                    num = 0;
                    num1 = 0;
                    res = 0;
                    operation = "";
                }
            });

            bPoint.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText(txt1.getText() + ".");
                    if (num==0) {
                        num = Double.valueOf(txt1.getText());
                    } else {
                        num1 = Double.valueOf(txt1.getText());
                    }

                }
            });

            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    String strOp = operation;

                    MetodCalc mc = new MetodCalc();
                    res = mc.MetodCalc(num, strOp, num1);
                    txt1.setText(String.valueOf(res));
                    new Log();
                }
            });

        }catch (ArithmeticException exception) { exception.printStackTrace(); }


    }

}
