import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MaingameGUI extends JFrame{
    private Trainer trainer;

    public MaingameGUI(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("startBG.jpg");
        ImageIcon BTfirst = new ImageIcon("stBT.png");
        
        JLabel pic = new JLabel(img);
        c.add(pic);
        pack();

        JButton Play = new JButton("");
        Play.setBounds(450,500,400,100);
        Play.setIcon(BTfirst);
        // Play.setFont(new Font("Pokemon X and Y", Font.PLAIN, 60));    
        pic.add(Play);

        Play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                MainMenuGUI mn = new MainMenuGUI(trainer);
                setVisible(false);
            }
        });
    }
}