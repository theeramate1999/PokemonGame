
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class renameGUI extends JFrame{
    private Trainer trainer;
    private Pokemon pokemon;
    
    public renameGUI(Pokemon pokemon,Trainer trainer){
        super("Pokemon Game");
        this.pokemon = pokemon;
        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200,100);
        Container c = getContentPane();
        JLabel bg = new JLabel();
        JTextField text = new JTextField();
        JButton nx = new JButton("OK");
        ImageIcon pic = new ImageIcon("renamebg.png");
        bg.setIcon(pic);
        text.setBounds(100, 100,200, 100);
        nx.setBounds(305, 100, 100, 100);
        c.add(bg);
        pack();
        bg.add(text);
        bg.add(nx);
        

        nx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                pokemon.setName(text.getText());
                System.out.print(""+pokemon.getName());
                PokemonStatus ps = new PokemonStatus(pokemon,trainer);
                setVisible(false);
               }
          });
    }
}