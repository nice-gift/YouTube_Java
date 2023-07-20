package swing.action_listenner_98;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class JFrmEx {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Click");
        jFrame.add(jPanel);
        jPanel.add(jButton);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setTitle(((JButton) e.getSource()).getText());
            }
        };

        ActionListener listener1 = e -> jPanel.setBackground(Color.black);

//        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
        jButton.addActionListener(e -> jFrame.setTitle(((JButton) e.getSource()).getText()));

        jPanel.setOpaque(true);
//        jButton.addActionListener(listener);

        jFrame.getContentPane().setBackground(Color.red);
        jFrame.setVisible(true);
        jFrame.setResizable(true);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds((dimension.width - 500) / 2, (dimension.height - 300) / 2, 500, 300);
//        jFrame.setSize();

    }
}
