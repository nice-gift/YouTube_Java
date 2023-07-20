package swing.jframe_96;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.net.MalformedURLException;
import java.net.URL;

public class JFrmEx {
    public static void main(String[] args) {
        JFrame jFrame = getJFrm();
        jFrame.add(new MyComponent());

//        String[] list = GraphicsEnvironment.getLocalGraphicsEnvironment()
//                .getAvailableFontFamilyNames();
//        for (String s : list) {
//            System.out.println(s);
    }

    static JFrame getJFrm() {
        JFrame jFrame = new JFrame() {
        };
        URL url = null;
        try {
            url = new URL("https://photobooth.cdn.sports.ru/preset/message/5/25/06069832a4b61a21f51e09e7289d4.jpeg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image image = new ImageIcon(url).getImage();
        jFrame.setIconImage(image);
        jFrame.setVisible(true);
        jFrame.setTitle("Hello");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(((dimension.width - 500) / 2),
                ((dimension.height - 300) / 2), 500, 300);
        return jFrame;
    }
}

class MyComponent extends Component {
    @Override
    public void paint(Graphics g) {
        Font font = new Font("Tahoma", Font.BOLD, 16);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Hello world", 30, 30);

        Point point1 = new Point(50, 50);
        Point point2 = new Point(150, 150);
        Line2D line2D = new Line2D.Double(point1, point2);
        g2.draw(line2D);
        Ellipse2D ellipse2D = new Ellipse2D.Double(120, 100, 170, 40);
        g2.setPaint(Color.red);
        g2.draw(ellipse2D);
        g2.fill(ellipse2D);

//        Image image = new ImageIcon("D:\\Загрузки\\151604850312599248.jpg").getImage();
//        g2.drawImage(image, 50, 50, null);
    }
}
