import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.prefs.BackingStoreException;


public class ShopGui extends JFrame{
    private Trainer trainer;
    private int money;

    public ShopGui(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        money = 0;
        

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    Container c = getContentPane();
    JMenuBar menuBar =new  JMenuBar();
    ImageIcon pic = new ImageIcon("shop.gif");
    ImageIcon picpotion = new ImageIcon("potion.png");
    ImageIcon picHigh = new ImageIcon("highpotion.png");
    ImageIcon picEither = new ImageIcon("Either.png");

    ImageIcon picpoke = new ImageIcon("pokeball.png");
    ImageIcon picgreat = new ImageIcon("greatball.png");
    ImageIcon picultra = new ImageIcon("ultraball.png");
    ImageIcon picmaster = new ImageIcon("masterball.png");

    ImageIcon picb = new ImageIcon("back.png");
    JLabel bg = new JLabel(pic);
    
    JMenu menu1 = new JMenu("Potion");
    JMenu menu2 = new JMenu("Pokeball");
    JMenu moneybarJMenu = new JMenu("Money in bag:"+trainer.getMoney()+"$");

    JMenuItem potion = new JMenuItem("Potion    25$",picpotion);
    JMenuItem Highpotion = new JMenuItem("Highpotion    100$",picHigh);
    JMenuItem Either = new JMenuItem("Either    25$",picEither);
    

    JMenuItem pokeballItem = new JMenuItem("Pokeball    50$",picpoke);
    JMenuItem greatballItem = new JMenuItem("Great Ball    100$",picgreat);
    JMenuItem ultraballItem = new JMenuItem("Ultra Ball    200$",picultra);
    JMenuItem masterballItem = new JMenuItem("Master Ball   10000000$",picmaster);

    JButton back = new JButton("");


    back.setIcon(picb);
    back.setBounds(600, 500, 150 , 80);
    


    menu1.add(potion);
    menu1.add(Highpotion);
    menu1.add(Either);
    menu2.add(pokeballItem);
    menu2.add(greatballItem);
    menu2.add(ultraballItem);
    menu2.add(masterballItem);
    menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(moneybarJMenu );
    menuBar.setBounds(0,0, 800,50);
    c.add(menuBar);
    c.add(bg);
    pack();
    bg.add(back);

    
    potion.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
        if(trainer.getMoney() >= 50){
            JOptionPane.showMessageDialog(null, "you got Potion 1 ea");
            trainer.addPotion(1);
            money -= 50;
            trainer.addMoney(money);
            money = 0;
            }
         else{
            JOptionPane.showMessageDialog(null, "Not enough money");
            trainer.setMoney(0);
            }
        }
        });

     Highpotion.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
         if(trainer.getMoney() >= 100){  
            JOptionPane.showMessageDialog(null, "you got High Potion 1 ea");
            trainer.addPotion(2);
            money -= 100;
            trainer.addMoney(money);
            money = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Not enough money");
                trainer.setMoney(0);
                money = 0;
                }
            }
            });

     Either.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
        if(trainer.getMoney() >= 50){  
        JOptionPane.showMessageDialog(null, "you got Either 1 ea");
        trainer.addPotion(3);
        money -= 50;
        trainer.addMoney(money);
        money = 0;
        }
        else{
            JOptionPane.showMessageDialog(null, "Not enough money");
            trainer.setMoney(0);
            }
            }
       });

       pokeballItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            if(trainer.getMoney() >= 50){
       JOptionPane.showMessageDialog(null, "you got Pokeball 1 ea");
       trainer.addPokeball(1);
       money -= 50;
        trainer.addMoney(money);
        money = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Not enough money");
                trainer.setMoney(0);
                }
           }
      });


      greatballItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
       
            if(trainer.getMoney() >= 100){
         trainer.addPokeball(2);
        money -= 100;
        JOptionPane.showMessageDialog(null, "you got Greatball 1 ea");
        trainer.addMoney(money);
        money = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Not enough money");
                trainer.setMoney(0);
                }
           }
      });


      ultraballItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
       if(trainer.getMoney() >= 200){
       trainer.addPokeball(3);
       money -= 100;
       JOptionPane.showMessageDialog(null, "you got Ultarball 1 ea");
       trainer.addMoney(money);
       money = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Not enough money");
                trainer.setMoney(0);
                }
           }
      });

      masterballItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
       
       if(trainer.getMoney() >= 10000000){
       trainer.addPokeball(4);
        money -= 10000000;
        JOptionPane.showMessageDialog(null, "you got MASTERBALL 1 ea!!!!!!!!!");
        trainer.addMoney(money);
        money = 0;
           }
           else{
            JOptionPane.showMessageDialog(null, "Not enough money");
            trainer.setMoney(0);
            }
        }         
      });
    

       back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            MenuPlayGui mp = new MenuPlayGui(trainer);
           }
      });

    }
}