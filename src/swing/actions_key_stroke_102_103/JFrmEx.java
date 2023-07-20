package swing.actions_key_stroke_102_103;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class JFrmEx {
    static JButton jButton = new JButton(new MyAction());
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        JFrame jFrame = getJFrm();
        jFrame.add(jPanel);
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap= jPanel.getInputMap(JComponent.WHEN_FOCUSED);
        inputMap.put(keyStroke, "ChangeColor");
        ActionMap actionMap=jPanel.getActionMap();
        actionMap.put("ChangeColor", new MyAction());    }

    static class MyAction extends AbstractAction {
        public MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "click");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.red);
        }
    }

    static JFrame getJFrm() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(((dimension.width - 500) / 2),
                ((dimension.height - 300) / 2), 500, 300);
        return jFrame;
    }
}
