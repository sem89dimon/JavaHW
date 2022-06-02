package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class Keys extends JPanel {

    private JTextField display;
//    private JPanel p;
    private JLabel label;

    private JPanel keyBoard;

    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonPoint;
    private JButton buttonEqual;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDibide;
    private JButton buttonMultiply;
    private MainWindow mainWindow;

    public Keys(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(3, 1));


        prepareButtons();
        prepareOutput();


        add(label = new JLabel("===CALC==="));

        add(display);

        add(keyBoard);



    }



    private void prepareOutput() {
//        p = new JPanel();
//        p.setLayout(new BorderLayout());
//        p.add(display = new JTextField(30));

        display = new JTextField(30);


        display.setBounds(10,10,245, 50);

        display.setEditable(false);
//        display.setVisible(true);

    }

    private void prepareButtons() {
        keyBoard = new JPanel();
        keyBoard.setLayout(new GridLayout(4, 4));
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        buttonDibide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonMinus = new JButton("-");
        buttonPlus = new JButton("+");






        keyBoard.add(button1);
        keyBoard.add(button2);
        keyBoard.add(button3);
        keyBoard.add(buttonDibide);
        keyBoard.add(button4);
        keyBoard.add(button5);
        keyBoard.add(button6);
        keyBoard.add(buttonMultiply);
        keyBoard.add(button7);
        keyBoard.add(button8);
        keyBoard.add(button9);
        keyBoard.add(buttonMinus);
        keyBoard.add(button0);
        keyBoard.add(buttonPoint);
        keyBoard.add(buttonEqual);
        keyBoard.add(buttonPlus);



    }


}
