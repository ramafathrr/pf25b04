import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePanel extends JPanel {

    public WelcomePanel(JFrame parentFrame) {
        setLayout(null); // manual layout

        // ✅ Load GIF as resource
        ImageIcon gifIcon = new ImageIcon(getClass().getResource("/assets/bg.gif"));
        JLabel backgroundLabel = new JLabel(gifIcon);
        backgroundLabel.setBounds(0, 0, gifIcon.getIconWidth(), gifIcon.getIconHeight());
        backgroundLabel.setLayout(null);

        // ✅ Add start button
        JButton startButton = new JButton("Start Game");
        startButton.setBounds(175, 250, 150, 40); // tweak position if needed
        backgroundLabel.add(startButton);

        // ✅ Set panel size to match GIF
        setPreferredSize(new Dimension(gifIcon.getIconWidth(), gifIcon.getIconHeight()));

        // ✅ Add the background
        add(backgroundLabel);

        // ✅ Button action
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
                new TTTGraphics(); // open game window
            }
        });
    }
}