import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class bagGUI extends JFrame{
    private Trainer trainer;
    private ArrayList<Pokemon> pokeBag;

    public bagGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        pokeBag = trainer.getBag();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container c = getContentPane();
        ImageIcon pic = new ImageIcon("bag.jpg");
        ImageIcon picpotion = new ImageIcon("potion.png");
        ImageIcon pichigh = new ImageIcon("highpotion.png");
        ImageIcon piceither = new ImageIcon("Either.png");
        ImageIcon picb = new ImageIcon("back.png");
        ImageIcon picpoke = new ImageIcon("pokeball.png");
        ImageIcon picgreat = new ImageIcon("greatball.png");
        ImageIcon picultra = new ImageIcon("ultraball.png");
        ImageIcon picmaster = new ImageIcon("masterball.png");
        ImageIcon piccharmander = new ImageIcon("charmander8bit.png");
        ImageIcon picsquirtle = new ImageIcon("squirtle8bit.jpg");
        ImageIcon picbulbasaur = new ImageIcon("bulbasaur8bit.png");
        ImageIcon picpikachu = new ImageIcon("pikachu8bit.png");
        ImageIcon picrattata = new ImageIcon("rattata8bit.png");
        ImageIcon picpidgey = new ImageIcon("pidgey8bit.png");
        ImageIcon piccaterpie = new ImageIcon("caterpie8bit.png");
        ImageIcon picweedle = new ImageIcon("weedle8bit.png");
        ImageIcon picspearow = new ImageIcon("spearow8bit.png");
        ImageIcon picekans = new ImageIcon("ekans8bit.png");
        ImageIcon picsandshrew = new ImageIcon("sandshrew8bit.png");
        ImageIcon picfreezer = new ImageIcon("freezer8bit.png");
        ImageIcon picfirer = new ImageIcon("firer8bit.png");
        ImageIcon picthunder = new ImageIcon("thunder8bit.png");
        ImageIcon picmew = new ImageIcon("mew8bit.png");
        ImageIcon picmewtwo = new ImageIcon("mewtwo8bit.png");

        JButton back = new JButton("");
        
        JLabel bg = new JLabel(pic);
        c.add(bg);
        pack();
        JMenuBar menuBar =new  JMenuBar();
        JMenu menu1 = new JMenu("POKEMON");
        JMenu menu2 = new JMenu("POTION");
        JMenu menu3 = new JMenu("POKEBALL");
        JMenu money = new JMenu("Money in bag:"+trainer.getMoney()+"$");
        JMenuItem potion = new JMenuItem("POTION: "+trainer.getPotion(1),picpotion);
        JMenuItem highpotion = new JMenuItem("HIGHPOTION: "+trainer.getPotion(2),pichigh);
        JMenuItem either = new JMenuItem("EiTHER: "+trainer.getPotion(3),piceither);
        JMenuItem pokeball = new JMenuItem("POKEBALL: "+trainer.getPokeball(1),picpoke);
        JMenuItem greatball = new JMenuItem("GREATBALL: "+trainer.getPokeball(2),picgreat);
        JMenuItem ultraball = new JMenuItem("ULTRABALL: "+trainer.getPokeball(3),picultra);
        JMenuItem masterball = new JMenuItem("MASTERBALL !!!: "+trainer.getPokeball(4),picmaster);
            
        for(Pokemon p:pokeBag){
            switch(p.getNo()){
                case 1 : JMenuItem bulbasaur = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picbulbasaur);
                         menu1.add(bulbasaur);
                         bulbasaur.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
                case 2 : JMenuItem charmander = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),piccharmander);
                         menu1.add(charmander);
                         charmander.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
                case 3 : JMenuItem squirtle = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picsquirtle);
                         menu1.add(squirtle);
                         squirtle.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
                case 4 : JMenuItem pikachu = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picpikachu);
                         menu1.add(pikachu);
                         pikachu.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
             case 5 : JMenuItem caterpie = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),piccaterpie);
                         menu1.add(caterpie);
                         caterpie.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
             case 6: JMenuItem weedle = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picweedle);
                         menu1.add(weedle);
                         weedle.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                            PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
            case 7 : JMenuItem rattata = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picrattata);
                         menu1.add(rattata);
                         rattata.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
            case 8 : JMenuItem pidgey = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picpidgey);
                         menu1.add(pidgey);
                         pidgey.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
            case 9 : JMenuItem spearow = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picspearow);
                         menu1.add(spearow);
                         spearow.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
            case 10 : JMenuItem sandshrew = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picsandshrew);
                         menu1.add(sandshrew);
                         sandshrew.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                PokemonStatus ps = new PokemonStatus(p,trainer);
                               }
                          });
                         break;
            case 11 :JMenuItem ekans = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picekans);
                        menu1.add(ekans);
                    ekans.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
                    break;
            case 12 :JMenuItem freezer = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picfreezer);
                        menu1.add(freezer);
                    freezer.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
            break;
            case 14 :JMenuItem firer = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picfirer);
                        menu1.add(firer);
                    firer.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
            break;
            case 13 :JMenuItem thunder = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picthunder);
                        menu1.add(thunder);
                    thunder.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
            break;
            case 15 :JMenuItem mew = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picmew);
                        menu1.add(mew);
                    mew.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
            break;
            case 16 :JMenuItem mewtwo = new JMenuItem(""+p.getName()+" HP:"+p.getHP()+" MP:"+p.getMP()+" DMG:"+p.getDMG(),picmewtwo);
                        menu1.add(mewtwo);
                    mewtwo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                     PokemonStatus ps = new PokemonStatus(p,trainer);
                  }
             });
            break;
            }
        }
        back.setIcon(picb);
        back.setBounds(580, 500, 150 , 80);
        menuBar.setBounds(0,0, 800,50);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(money);
        menu2.add(potion);
        menu2.add(highpotion);
        menu2.add(either);
        menu3.add(pokeball);
        menu3.add(greatball);
        menu3.add(ultraball);
        menu3.add(masterball);

        bg.add(back);
        bg.add(menuBar);
    
        
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
               }
          });
       
    }
}