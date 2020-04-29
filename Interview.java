import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.prefs.BackingStoreException;


public class Interview extends JFrame{
private Trainer trainer;
private Pokemon pokemon;

public Interview(Trainer Trainer){
    super("Pokemon Game");

    this.trainer = trainer;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    Container c = getContentPane();

    

    ImageIcon pic = new ImageIcon("Interview.gif");
    ImageIcon picinfoIcon  = new ImageIcon("howto.png");
    ImageIcon picBack = new ImageIcon("back.png");
    JLabel bg = new JLabel(pic);
    JLabel info = new JLabel(picinfoIcon);
    JButton backButton = new JButton("");
    backButton.setBounds(1100,600, 150, 80);
    backButton.setIcon(picBack);
    info.setBounds(230, 100, 800, 1000);
    c.add(info);
    c.add(bg);

    pack();
    bg.add(backButton);

    backButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            MenuPlayGui mp = new MenuPlayGui(trainer);
            setVisible(false);
            }
        });
        
    }
}
