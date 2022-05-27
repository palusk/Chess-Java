import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class button_work extends JPanel implements ActionListener{

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton uruchomSzachy;
    public JButton wyjdz;

    JFrame frame = new JFrame();

    public button_work() {
        uruchomSzachy = new JButton("Uruchom Szachy");
        wyjdz = new JButton("Wyjdz z okna");

        uruchomSzachy.addActionListener(this);
        wyjdz.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(uruchomSzachy);
        add(wyjdz);
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == uruchomSzachy) {
            Plansza szachownica = new Plansza();
            Figury akcja = new Figury();
            int y_czarnego = 0;
            int x_czarnego = 3;
            int y_bialego = 7;
            int x_bialego = 3;
            int wsp_krola = -1;

            while(1==1){
              System.out.println("Ruch bialych: ");
            szachownica.wypisz();
            wsp_krola = szachownica.turn("biale");
            if(wsp_krola>=0){
                y_bialego = wsp_krola>>1;
                x_bialego = wsp_krola-((wsp_krola>>1)*10);
                }

              /*  if(akcja.mat(y_czarnego, x_czarnego, szachownica.board, "czarny")==true){
                    System.out.println("Szach!");
            } */

              System.out.println("Ruch czarnych: ");
           szachownica.wypisz();
            wsp_krola = szachownica.turn("czarny");
            if(wsp_krola>=0){
                y_czarnego = wsp_krola>>1;
                x_czarnego = wsp_krola-((wsp_krola>>1)*10);
                }

             /*   if(akcja.mat(y_bialego, x_bialego, szachownica.board, "biale")==true){
                    System.out.println("Szach!");
            } */
            }
        }

        else if(source == wyjdz){    
         System.exit(0);
        }
    }
}
