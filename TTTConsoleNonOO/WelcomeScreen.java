import javax.swing.*;

public class WelcomeScreen {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new WelcomePanel(frame));
            frame.pack();                        // <== IMPORTANT
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}