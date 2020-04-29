import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BagbattleGui extends JFrame{
    private Trainer trainer;
    private Pokemon pokemon;

    public BagbattleGui(Trainer trainer,Pokemon pokemon,Pokemon wildpokemon,int p){
        super("Pokemon Game");
        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon pic = new ImageIcon("bag.jpg");
        ImageIcon picpotion = new ImageIcon("potion.png");
        ImageIcon pichigh = new ImageIcon("highpotion.png");
        ImageIcon piceither = new ImageIcon("Either.png");
        ImageIcon picb = new ImageIcon("back.png");
        JButton back = new JButton("");
        
        JLabel bg = new JLabel(pic);
        JMenuBar menuBar =new  JMenuBar();
        JMenu menu2 = new JMenu("POTION");
        JMenuItem potion = new JMenuItem("POTION: "+trainer.getPotion(1),picpotion);
        JMenuItem highpotion = new JMenuItem("HIGHPOTION: "+trainer.getPotion(2),pichigh);
        JMenuItem either = new JMenuItem("EiTHER: "+trainer.getPotion(3),piceither);
        c.add(bg);
        pack();
        back.setIcon(picb);
        back.setBounds(580, 500, 150 , 80);
        menuBar.setBounds(0,0, 800,50);
        menuBar.add(menu2);
        menu2.add(potion);
        menu2.add(highpotion);
        menu2.add(either);
        bg.add(back);
        bg.add(menuBar);
        
        potion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
              if(trainer.getPotion(1)>0) {
              trainer.usePotion(1);
               if(pokemon.getHP()+50 >pokemon.getMaxhp())
               pokemon.hp = pokemon.maxhp;
               else
               pokemon.hp += 50;
               JOptionPane.showMessageDialog(null, "you use Potion \n "+pokemon.getName()+"HP: "+pokemon.getHP());
              }
              else
              JOptionPane.showMessageDialog(null, "you don't have Potion");
               }
          });

          highpotion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(trainer.getPotion(2)>0) {
               trainer.usePotion(2);
               if(pokemon.getHP()+200 >pokemon.getMaxhp())
               pokemon.hp = pokemon.maxhp;
               else
               pokemon.hp += 200;
               JOptionPane.showMessageDialog(null, "you use HIGHPotion \n "+pokemon.getName()+"HP: "+pokemon.getHP());
                }
              else
              JOptionPane.showMessageDialog(null, "you don't have Potion");
               }
          });

          either.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(trainer.getPotion(3)>0) {
               trainer.usePotion(3);
               pokemon.mp = pokemon.maxmp;
               JOptionPane.showMessageDialog(null, "you use Either \n "+pokemon.getName()+"MP: "+pokemon.getMP());
               }
               else 
               JOptionPane.showMessageDialog(null, "you don't have Potion");
            }
          });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                BattleGUI mp = new BattleGUI(trainer,pokemon,wildpokemon,p);
                setVisible(false);
               }
          });
    }
}