import javax.swing.JFrame;

public class CalculatorApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("나의 계산기");

        frame.setSize(350, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}