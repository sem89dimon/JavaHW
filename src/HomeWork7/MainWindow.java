package HomeWork7;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private Keys keys = new Keys(this);


    public MainWindow(){
        prepareWindow();

        add(keys);
//        pack();
        setContentPane(keys);
        setVisible(true);

    }

    private void prepareWindow() {
        setSize(280, 350);
        setLocationRelativeTo(null);
//        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
    }
}
