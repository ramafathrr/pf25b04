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
        JButton pvpButton = new JButton("Player vs Player");
        pvpButton.setBounds(150, 200, 180, 40);
        backgroundLabel.add(pvpButton);

        JButton pvcButton = new JButton("Player vs Computer");
        pvcButton.setBounds(150, 260, 180, 40);
        backgroundLabel.add(pvcButton);

        // ✅ Set panel size to match GIF
        setPreferredSize(new Dimension(gifIcon.getIconWidth(), gifIcon.getIconHeight()));

        // ✅ Add the background
        add(backgroundLabel);

        // ✅ Button action
        pvpButton.addActionListener(e -> {
            parentFrame.dispose();
            new TTTGraphics(TTTGraphics.GameMode.PVP);
        });

        pvcButton.addActionListener(e -> {
            parentFrame.dispose();
            new TTTGraphics(TTTGraphics.GameMode.PVC);
        });
    }
}