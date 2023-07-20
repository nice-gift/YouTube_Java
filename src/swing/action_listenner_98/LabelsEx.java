package swing.action_listenner_98;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LabelsEx {
    public static void main(String[] args) throws MalformedURLException {
        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.yellow, 5);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        URL url = new URL("https://jufc.ru/wp-content/uploads/avatars/25155/1680547330-bpfull.jpg");
        Image image = new ImageIcon(url).getImage();
        jFrame.setIconImage(image);
        jFrame.setVisible(true);
        jFrame.add(jLabel);
//        jFrame.setLayout(null);
        jFrame.pack();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds((dimension.width - 800) / 2, (dimension.height - 900) / 2, 800, 900);

//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String f:fonts
//             ) {System.out.println(f);}

        jLabel.setText("Fino Alla Fine");
        Font font = new Font("Warnock Pro Caption", Font.BOLD, 56);
        jLabel.setFont(font);
        jLabel.setBackground(Color.black);
        jLabel.setOpaque(true);
        jLabel.setBorder(border);

        jLabel.setIconTextGap(-16);
        jLabel.setForeground(Color.white);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
//        jLabel.setBounds(0,0,700,900);
        jLabel.setIcon(new ImageIcon("D:\\Загрузки\\151604850312599248.jpg"));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
    }
}
