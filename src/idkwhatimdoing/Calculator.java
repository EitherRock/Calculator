package idkwhatimdoing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFormattedTextField firstNumTxt;
    private JFormattedTextField secondNumTxt;
    private JButton addBut;
    private JButton multBut;
    private JButton subBut;
    private JButton divideButton;
    private JLabel first_number;
    private JLabel second_number;
    private JLabel resultShow;
    private JLabel result;
    private JPanel panelMain;

    public int parseNum1(){
        return Integer.parseInt(firstNumTxt.getText());
    }
    public int parseNum2(){
        return Integer.parseInt(secondNumTxt.getText());
    }

    public Calculator() {
        addBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultShow.setText(Integer.toString(parseNum1() + parseNum2()));
            }
        });
        subBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultShow.setText(Integer.toString(parseNum1() - parseNum2()));
            }
        });
        multBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultShow.setText(Integer.toString(parseNum1() * parseNum2()));
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultShow.setText((Integer.toString(parseNum1() / parseNum2())));
            }
        });
    }


    public static void main(String[] args) {
    JFrame frame = new JFrame("MyCalculator");
    frame.setContentPane(new Calculator().panelMain);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}