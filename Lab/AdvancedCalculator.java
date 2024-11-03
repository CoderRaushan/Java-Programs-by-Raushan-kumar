import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class AdvancedCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input;

    public AdvancedCalculator() {
        input = new StringBuilder();
        
        // Set up the calculator frame
        setTitle("Advanced Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Display
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);
        
        // Buttons layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));
        
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "(", ")", "√", "^",
            "sin", "cos", "tan", "C"
        };
        
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            panel.add(button);
        }
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "=":
                try {
                    double result = evaluateExpression(input.toString());
                    display.setText(String.valueOf(result));
                    input.setLength(0);  // Reset input after calculating
                } catch (Exception ex) {
                    display.setText("Error");
                    input.setLength(0);
                }
                break;
            case "C":
                input.setLength(0);
                display.setText("");
                break;
            case "√":
                input.append("sqrt(");
                display.setText(input.toString());
                break;
            case "^":
                input.append("^");
                display.setText(input.toString());
                break;
            case "sin":
                input.append("sin(");
                display.setText(input.toString());
                break;
            case "cos":
                input.append("cos(");
                display.setText(input.toString());
                break;
            case "tan":
                input.append("tan(");
                display.setText(input.toString());
                break;
            default:
                input.append(command);
                display.setText(input.toString());
                break;
        }
    }

    private double evaluateExpression(String expression) {
        expression = expression.replaceAll("sin", "Math.sin");
        expression = expression.replaceAll("cos", "Math.cos");
        expression = expression.replaceAll("tan", "Math.tan");
        expression = expression.replaceAll("sqrt", "Math.sqrt");

        return eval(expression);
    }

    private double eval(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expression.length()) {
            char ch = expression.charAt(i);

            if (Character.isWhitespace(ch)) {
                i++;
                continue;
            }

            if (Character.isDigit(ch)) {
                int j = i;
                while (j < expression.length() && 
                       (Character.isDigit(expression.charAt(j)) || expression.charAt(j) == '.')) {
                    j++;
                }
                double number = Double.parseDouble(expression.substring(i, j));
                numbers.push(number);
                i = j;
            } else if (ch == '(') {
                operators.push(ch);
                i++;
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop();
                i++;
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(ch);
                i++;
            } else {
                throw new IllegalArgumentException("Unexpected character: " + ch);
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        if (op1 == '^' && op2 != '^')
            return false;
        return true;
    }

    private double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
            case '^': return Math.pow(a, b);
            default: throw new IllegalArgumentException("Unexpected operator: " + op);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdvancedCalculator());
    }
}
