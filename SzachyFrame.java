import javax.swing.*;
import java.awt.*;

public class SzachyFrame extends JFrame {
    JButton wyjdz = new JButton("Click to close!");

    public SzachyFrame() {
        super("Szachy");
      
        JPanel buttonChess = new button_work();
        add(buttonChess);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 100));
        pack();
        setVisible(true);
    }

}
