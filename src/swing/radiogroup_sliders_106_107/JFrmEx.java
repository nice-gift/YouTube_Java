package swing.radiogroup_sliders_106_107;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JFrmEx {
    static JButton jButton = new JButton(new MyAction());
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        JFrame jFrame = getJFrm();
        jFrame.add(jPanel);
        jPanel.add(jButton);

//        JRadioButton jRadioButton1 = new JRadioButton("one");
//        JRadioButton jRadioButton2 = new JRadioButton("two");
//        jRadioButton1.setEnabled(false);
//        jRadioButton2.setSelected(true);
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(jRadioButton1);
//        buttonGroup.add(jRadioButton2);
//        jPanel.add(jRadioButton1);
//        jPanel.add(jRadioButton2);

        JTextArea jTextArea = new JTextArea(4, 6);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);
        jPanel.revalidate();

//        JSlider jSlider = new JSlider(JSlider.VERTICAL, 0, 100, 30);
//        jSlider.setMinorTickSpacing(10);
//        jSlider.setPaintTicks(true);
//        jSlider.setSnapToTicks(true);
//        jPanel.add(jSlider);
    }

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
