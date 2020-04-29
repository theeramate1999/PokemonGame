import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StarterPokemonGui extends JFrame{
    private Trainer trainer;
    public StarterPokemonGui(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
        Container c = getContentPane();
        ImageIcon pic = new ImageIcon("StarterPokemon.jpg");
        JLabel bgJLabel = new JLabel(pic);
        JButton bt1 = new JButton("Choose");
        JButton bt2 = new JButton("Choose");
        JButton bt3 = new JButton("Choose");
        JButton bt4 = new JButton("Choose");

        bt1.setBounds(200, 500, 100, 50);

        bt2.setBounds(400, 500, 100, 50);

        bt3.setBounds(750, 500, 100, 50);

        bt4.setBounds(950, 500, 100, 50);

        
        c.add(bgJLabel);
        pack();

        bgJLabel.add(bt1);
        bgJLabel.add(bt2);
        bgJLabel.add(bt3);
        bgJLabel.add(bt4);

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
                trainer.addPokemon(bulbasaur);
                trainer.printPokemon(trainer.getBag());
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
            }
        });
    
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                Charmander charmander = new Charmander("Charmander");
                trainer.addPokemon(charmander);
                trainer.printPokemon(trainer.getBag());
                MenuPlayGui mp = new MenuPlayGui(trainer);
                
                setVisible(false);
            }
        });
    
        bt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                Squirtle squirtle = new  Squirtle("Squirtle");
                trainer.addPokemon(squirtle);
                trainer.printPokemon(trainer.getBag());
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
            }
        });
    
        bt4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                Pikachu pikachu = new  Pikachu("Pikachu");
                trainer.addPokemon(pikachu);
                trainer.printPokemon(trainer.getBag());
                MenuPlayGui mp = new MenuPlayGui(trainer);
                
                setVisible(false);
            }
        });


    }


}
 