import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackImage extends JFrame {

    public BlackImage() {
        setTitle("TOP SECRET");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("C:\\Users\\sidor\\Desktop\\Darian\\Dari - Wichtig\\icon (2).JPEG");
        setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        add(panel, BorderLayout.CENTER);

        JButton fileButton =new JButton("File");
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new JFrame("New Frame");
                newFrame.setSize(400, 400);
                newFrame.setLocationRelativeTo(null);
                newFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                JPanel newPanel = new JPanel();
                newPanel.setBackground(Color.WHITE);
                newFrame.add(newPanel, BorderLayout.CENTER);

                JButton newButton = new JButton("New");
                newButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new BlackImage();
                    }
                });
                newPanel.add(newButton);

                newFrame.setVisible(true);
            }
        });
        add(fileButton, BorderLayout.NORTH);

        setVisible(true);
        }

        public static void main(String[] args) {
            new BlackImage();
    }
}