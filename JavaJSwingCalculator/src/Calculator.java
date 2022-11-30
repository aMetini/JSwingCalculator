import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private JFrame frame;
    private JTextField outputField;
    private JRadioButton onButton;
    private JRadioButton offButton;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton addButton;
    private JButton subButton;
    private JButton multButton;
    private JButton divButton;
    private JButton decButton;
    private JButton equButton;
    private JButton delButton;
    private JButton clrButton;
    private JButton sqButton;
    private JButton reciprocalButton;
    private JButton sqRtButton;

    private double inputNo;
    private double solution;
    private char operator;

    Calculator() {
        inputNo = 0;
        solution = 0;

        initializeGuiComponents();
        createCalculatorFrame();
        addCalComponents();
    }

    public void initializeGuiComponents() {
        frame = new JFrame("Calculator");
        outputField = new JTextField();
        onButton = new JRadioButton("On");
        offButton = new JRadioButton("Off");
        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("AC");
        sqButton = new JButton("x\u00B2");
        reciprocalButton = new JButton("1/x");
        sqRtButton = new JButton("\u221A");
    }

    public void createCalculatorFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 490); // 420, 550
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(44, 203, 188));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void addCalComponents() {
        addOutputField();
        addOnButton();
        addOffButton();
        addButtonGroup();
        addSevenButton();
        addEightButton();
        addNineButton();
        addFourButton();
        addFiveButton();
        addSixButton();
        addOneButton();
        addTwoButton();
        addThreeButton();
        addDecButton();
        addZeroButton();
        addEquButton();
        addDivButton();
        addSqRtButton();
        addSqButton();
        addReciprocalButton();
        addMultButton();
        addSubButton();
        addAddButton();
        addDelButton();
        addClrButton();
    }

    private void addOutputField() {
        outputField.setBounds(10, 40, 270, 40); // 50, 25, 300, 50
        outputField.setFont(new Font("Sans Serif", Font.BOLD, 20));
        outputField.setEditable(false);
        outputField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(outputField);
        // outputField.setText("0"); I want to be able to set the calculator to 0 but
        // replace it with another # if another # is pressed
        // Problem: If you start at 0 and then press (ex) 2, the display will look like
        // "02".
    }

    private void addOnButton() {
        onButton.setBounds(10, 95, 60, 40);
        onButton.setSelected(true);
        onButton.setFont(new Font("Sans Serif", Font.BOLD, 14));
        onButton.setBackground(Color.black);
        onButton.setForeground(Color.white);
        onButton.setFocusable(false);
        frame.add(onButton);
        onButton.addActionListener(this);
    }

    private void addOffButton() {
        offButton.setBounds(10, 120, 60, 40);
        offButton.setSelected(false);
        offButton.setFont(new Font("Sans Serif", Font.BOLD, 14));
        offButton.setBackground(Color.black);
        offButton.setForeground(Color.white);
        offButton.setFocusable(false);
        frame.add(offButton);
        offButton.addActionListener(this);
    }

    private void addButtonGroup() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onButton);
        buttonGroup.add(offButton);
    }

    private void addSevenButton() {
        sevenButton.setBounds(10, 230, 60, 40);
        sevenButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(sevenButton);
        sevenButton.addActionListener(this);
    }

    private void addEightButton() {
        eightButton.setBounds(80, 230, 60, 40);
        eightButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(eightButton);
        eightButton.addActionListener(this);
    }

    private void addNineButton() {
        nineButton.setBounds(150, 230, 60, 40);
        nineButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(nineButton);
        nineButton.addActionListener(this);
    }

    private void addFourButton() {
        fourButton.setBounds(10, 290, 60, 40);
        fourButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(fourButton);
        fourButton.addActionListener(this);
    }

    private void addFiveButton() {
        fiveButton.setBounds(80, 290, 60, 40);
        fiveButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(fiveButton);
        fiveButton.addActionListener(this);
    }

    private void addSixButton() {
        sixButton.setBounds(150, 290, 60, 40);
        sixButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(sixButton);
        sixButton.addActionListener(this);
    }

    private void addOneButton() {
        oneButton.setBounds(10, 350, 60, 40);
        oneButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(oneButton);
        oneButton.addActionListener(this);
    }

    private void addTwoButton() {
        twoButton.setBounds(80, 350, 60, 40);
        twoButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(twoButton);
        twoButton.addActionListener(this);
    }

    private void addThreeButton() {
        threeButton.setBounds(150, 350, 60, 40);
        threeButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(threeButton);
        threeButton.addActionListener(this);
    }

    private void addDecButton() {
        decButton.setBounds(150, 410, 60, 40);
        decButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(decButton);
        decButton.addActionListener(this);
    }

    private void addZeroButton() {
        zeroButton.setBounds(10, 410, 130, 40);
        zeroButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        frame.add(zeroButton);
        zeroButton.addActionListener(this);
    }

    private void addEquButton() {
        equButton.setBounds(220, 350, 60, 100);
        equButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        equButton.setBackground(new Color(239, 188, 2));
        frame.add(equButton);
        equButton.addActionListener(this);
    }

    private void addDivButton() {
        divButton.setBounds(220, 110, 60, 40);
        divButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        divButton.setBackground(new Color(230, 201, 54));
        frame.add(divButton);
        divButton.addActionListener(this);
    }

    private void addSqRtButton() {
        sqRtButton.setBounds(10, 170, 60, 40);
        sqRtButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        sqRtButton.setBackground(new Color(230, 201, 54));
        frame.add(sqRtButton);
        sqRtButton.addActionListener(this);
    }

    private void addSqButton() {
        sqButton.setBounds(80, 170, 60, 40);
        sqButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        sqButton.setBackground(new Color(230, 201, 54));
        frame.add(sqButton);
        sqButton.addActionListener(this);
    }

    private void addReciprocalButton() {
        reciprocalButton.setBounds(150, 170, 60, 40);
        reciprocalButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        reciprocalButton.setBackground(new Color(230, 201, 54));
        frame.add(reciprocalButton);
        reciprocalButton.addActionListener(this);
    }

    private void addMultButton() {
        multButton.setBounds(220, 170, 60, 40);
        multButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        multButton.setBackground(new Color(230, 201, 54));
        frame.add(multButton);
        multButton.addActionListener(this);
    }

    private void addSubButton() {
        subButton.setBounds(220, 230, 60, 40);
        subButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        subButton.setBackground(new Color(230, 201, 54));
        frame.add(subButton);
        subButton.addActionListener(this);
    }

    private void addAddButton() {
        addButton.setBounds(220, 290, 60, 40);
        addButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        addButton.setBackground(new Color(230, 201, 54));
        frame.add(addButton);
        addButton.addActionListener(this);
    }

    private void addDelButton() {
        delButton.setBounds(150, 110, 60, 40);
        delButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        delButton.setBackground(new Color(216, 87, 51));
        frame.add(delButton);
        delButton.addActionListener(this);
    }

    private void addClrButton() {
        clrButton.setBounds(80, 110, 60, 40);
        clrButton.setFont(new Font("Sans Serif", Font.BOLD, 20));
        clrButton.setBackground(new Color(216, 87, 51));
        frame.add(clrButton);
        clrButton.addActionListener(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object cmdSource = e.getSource();

        // Exception handle for cases of NaN or Infinity. Sets these values to 0 to
        // avoid an exception error.
        if (outputField.getText().equals("NaN") || outputField.getText().equals("Infinity")) {
            outputField.setText("0");
        }

        if (cmdSource == onButton) {
            enable();
        } else if (cmdSource == offButton) {
            disable();
        } else if (cmdSource == clrButton) {
            // label.setText("");
            outputField.setText("");
        } else if (cmdSource == delButton) {
            // Takes length of getText (i.e. calculator entry in outputField)
            // We will use StringBuilder to create a mutable string of chars like an array
            // from the outputField entry.
            int length = outputField.getText().length();
            // Val removes one number from the length of getText entry so that it starts
            // deleting from the last element of our string of chars
            int val = length - 1;

            // If outputField length is NOT empty or begins at the 0 index start deleting
            if (length > 0) {
                StringBuilder delBack = new StringBuilder(outputField.getText());
                delBack.deleteCharAt(val);
                outputField.setText(delBack.toString());
            } else {
                outputField.setText("0"); // Problem: If you press another # afterward, it appears like (ex. 02)
            }
        } else if (cmdSource == zeroButton) {
            // If zero is pressed and is the first number in the outputField, set the
            // outputField to blank
            if (outputField.getText().equals("0")) {
                outputField.setText("0");
            } else {
                outputField.setText(outputField.getText() + "0");
            }
        } else if (cmdSource == decButton) {
            if (outputField.getText().contains(".")) {
                return;
            } else {
                outputField.setText(outputField.getText() + ".");
            }
        } else if (cmdSource == oneButton) {
            outputField.setText(outputField.getText() + "1");
        } else if (cmdSource == twoButton) {
            outputField.setText(outputField.getText() + "2");
        } else if (cmdSource == threeButton) {
            outputField.setText(outputField.getText() + "3");
        } else if (cmdSource == fourButton) {
            outputField.setText(outputField.getText() + "4");
        } else if (cmdSource == fiveButton) {
            outputField.setText(outputField.getText() + "5");
        } else if (cmdSource == sixButton) {
            outputField.setText(outputField.getText() + "6");
        } else if (cmdSource == sevenButton) {
            outputField.setText(outputField.getText() + "7");
        } else if (cmdSource == eightButton) {
            outputField.setText(outputField.getText() + "8");
        } else if (cmdSource == nineButton) {
            outputField.setText(outputField.getText() + "9");
        } else if (cmdSource == addButton) {
            inputNo = Double.parseDouble(outputField.getText());
            outputField.setText("");
            operator = '+';
        } else if (cmdSource == subButton) {
            inputNo = Double.parseDouble(outputField.getText());
            outputField.setText("");
            operator = '-';
        } else if (cmdSource == multButton) {
            inputNo = Double.parseDouble(outputField.getText());
            outputField.setText("");
            operator = '*';
        } else if (cmdSource == divButton) {
            inputNo = Double.parseDouble(outputField.getText());
            outputField.setText("");
            operator = '/';
        } else if (cmdSource == sqButton) {
            // Error handling for squaring an empty field
            if (outputField.getText().equals("")) {
                outputField.setText("NaN");
            } else {
                inputNo = Double.parseDouble(outputField.getText());
                double square = Math.pow(inputNo, 2);
                String squareStr = Double.toString(square);
                if (squareStr.endsWith(".0")) {
                    outputField.setText(squareStr.replace(".0", ""));
                } else {
                    outputField.setText(squareStr);
                }
                outputField.setText(squareStr);
            }
        } else if (cmdSource == sqRtButton) {
            // Error handling for square rooting an empty field
            if (outputField.getText().equals("")) {
                outputField.setText("NaN");
            } else {
                inputNo = Double.parseDouble(outputField.getText());
                Double squareRt = Math.sqrt(inputNo);
                String sqRtStr = Double.toString(squareRt);
                if (sqRtStr.endsWith(".0")) {
                    outputField.setText(sqRtStr.replace(".0", ""));
                } else {
                    outputField.setText(sqRtStr);
                }
                outputField.setText(Double.toString(squareRt));
            }
        } else if (cmdSource == reciprocalButton) {
            // Error handling for getting the reciprocal of an empty field
            if (outputField.getText().equals("")) {
                outputField.setText("NaN");
            } else {
                inputNo = Double.parseDouble(outputField.getText());
                Double reciprocal = 1 / inputNo;
                String reciprocalStr = Double.toString(reciprocal);
                if (reciprocalStr.endsWith(".0")) {
                    outputField.setText(reciprocalStr.replace(".0", ""));
                }
                outputField.setText(reciprocalStr);
            }
        } else if (cmdSource == equButton) {
            // We will replace the .0 for all of our double calculations that are not a
            // decimal (i.e. Double)
            switch (operator) {
                case '+':
                    solution = inputNo + Double.parseDouble(outputField.getText());
                    if (Double.toString(solution).endsWith(".0")) {
                        outputField.setText(Double.toString(solution).replace(".0", ""));
                    } else {
                        outputField.setText(Double.toString(solution));
                    }
                    break;
                case '-':
                    solution = inputNo - Double.parseDouble(outputField.getText());
                    if (Double.toString(solution).endsWith(".0")) {
                        outputField.setText(Double.toString(solution).replace(".0", ""));
                    } else {
                        outputField.setText(Double.toString(solution));
                    }
                    break;
                case '*':
                    solution = inputNo * Double.parseDouble(outputField.getText());
                    if (Double.toString(solution).endsWith(".0")) {
                        outputField.setText(Double.toString(solution).replace(".0", ""));
                    } else {
                        outputField.setText(Double.toString(solution));
                    }
                    break;
                case '/':
                    solution = inputNo / Double.parseDouble(outputField.getText());
                    if (Double.toString(solution).endsWith(".0")) {
                        outputField.setText(Double.toString(solution).replace(".0", ""));
                    } else {
                        outputField.setText(Double.toString(solution));
                    }
                    break;
            }
        }
    }

    /**
     * Set all calculator components to false except offButton so that we can allow the calcualtor to be turned off
     * The onButton is enabled so that the user can click on the button to turn the calculator back on.
     */
    private void disable() {
        onButton.setEnabled(true);
        offButton.setEnabled(false);
        nineButton.setEnabled(false);
        eightButton.setEnabled(false);
        sevenButton.setEnabled(false);
        sixButton.setEnabled(false);
        fiveButton.setEnabled(false);
        fourButton.setEnabled(false);
        threeButton.setEnabled(false);
        twoButton.setEnabled(false);
        oneButton.setEnabled(false);
        zeroButton.setEnabled(false);
        decButton.setEnabled(false);
        sqRtButton.setEnabled(false);
        reciprocalButton.setEnabled(false);
        sqButton.setEnabled(false);
        divButton.setEnabled(false);
        multButton.setEnabled(false);
        subButton.setEnabled(false);
        addButton.setEnabled(false);
        equButton.setEnabled(false);
        delButton.setEnabled(false);
        clrButton.setEnabled(false);
    }

    /**
     * Set all calculator components to true except onButton so that we can allow the calculator to be turned on.
     * The offButton is enabled as well as the other buttons in order for the user to click the button
     */
    public void enable() {
        onButton.setEnabled(false);
        offButton.setEnabled(true);
        nineButton.setEnabled(true);
        eightButton.setEnabled(true);
        sevenButton.setEnabled(true);
        sixButton.setEnabled(true);
        fiveButton.setEnabled(true);
        fourButton.setEnabled(true);
        threeButton.setEnabled(true);
        twoButton.setEnabled(true);
        oneButton.setEnabled(true);
        zeroButton.setEnabled(true);
        decButton.setEnabled(true);
        sqRtButton.setEnabled(true);
        reciprocalButton.setEnabled(true);
        sqButton.setEnabled(true);
        divButton.setEnabled(true);
        multButton.setEnabled(true);
        subButton.setEnabled(true);
        addButton.setEnabled(true);
        equButton.setEnabled(true);
        delButton.setEnabled(true);
        clrButton.setEnabled(true);
    }
}