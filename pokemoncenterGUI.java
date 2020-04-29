import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class pokemoncenterGUI extends JFrame{
    private Trainer trainer; 
    private ArrayList<Pokemon> PokemonInBag;

    public  pokemoncenterGUI(Trainer trainer) {
        super("Pokemon Game");
        this.trainer = trainer;
        PokemonInBag = trainer.getBag();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        Container c = getContentPane();

        ImageIcon pic = new ImageIcon("pokemoncenter.jpg");
        ImageIcon pich = new ImageIcon("heal.png");

        JButton heal = new JButton("");
        JLabel bg = new JLabel(pic);
        
        c.add(bg);
        pack();

        heal.setBounds(600, 550, 150, 80);
        heal.setIcon(pich);

        bg.add(heal);

        heal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for(Pokemon p:PokemonInBag){
                    p.hp = p.maxhp;
                    p.mp = p.maxmp;
                }
                JOptionPane.showMessageDialog(null, "You heal your Pokemon!!!!!!");
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
               }
          });
    }
}