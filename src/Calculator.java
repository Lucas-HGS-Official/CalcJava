import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int window_width = 360;
    int window_height = 540;

    JFrame window = new JFrame("Java Calculator");

    Calculator() {
        window.setVisible(true);
        window.setSize(window_width, window_height);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
    }
}
