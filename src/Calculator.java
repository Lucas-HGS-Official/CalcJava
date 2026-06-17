import java.awt.*;
import javax.swing.*;

public class Calculator {
    int window_width = 360;
    int window_height = 540;

    Color customBlack = new Color(0x071721);
    Color customDarkBlue = new Color(0x30455c);
    Color customPaleOrange = new Color(0xc07e53);
    Color customEggshellWhite =new Color(0xf8eacf);

    String[] buttonValues = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ",", "√", "="
    };
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame window = new JFrame("Java Calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    Calculator() {
        window.setVisible(true);
        window.setSize(window_width, window_height);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        displayLabel.setBackground(customBlack);
        displayLabel.setForeground(customEggshellWhite);
        displayLabel.setFont(new Font("Ariel", Font.PLAIN, 80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        window.add(displayPanel, BorderLayout.NORTH);

        buttonsPanel.setLayout(new GridLayout(5,4));
        buttonsPanel.setBackground(customBlack);
        window.add(buttonsPanel);

        for (int i=0; i<buttonValues.length; i++) {
            JButton button = new JButton();
            String buttonValue = buttonValues[i];
            button.setFont(new Font("Ariel", Font.PLAIN, 30));
            button.setText(buttonValue);
            buttonsPanel.add(button);
        }
    }
}
