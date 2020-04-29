import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random; 

public class BattleGUI extends JFrame{
    private Trainer trainer;
    private Pokemon pokemon;
    private Pokemon wildpokemon;

    public BattleGUI(Trainer trainer,Pokemon pokemon ,Pokemon wilPokemon,int random){
            super("BATTLE");
            this.trainer = trainer;
            this.pokemon = pokemon;
            this.wildpokemon = wilPokemon;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        Container c = getContentPane();
        ImageIcon pic = new ImageIcon("Battlefield.jpg");
        ImageIcon piccharmander = new ImageIcon("charmander.png");
        ImageIcon picsquirtle = new ImageIcon("squirtle.png");
        ImageIcon picbulbasaur = new ImageIcon("bulbasaurstatus.png");
        ImageIcon picpikachu = new ImageIcon("pikachustatus.png");
        ImageIcon picrattata = new ImageIcon("rattata.png");
        ImageIcon picpidgey = new ImageIcon("pidgey.png");
        ImageIcon piccaterpie = new ImageIcon("caterpie.png");
        ImageIcon picweedle = new ImageIcon("weedle.png");
        ImageIcon picspearow = new ImageIcon("spearow.png");
        ImageIcon picekans = new ImageIcon("ekans.png");
        ImageIcon picsandshrew = new ImageIcon("sandshrew.png");
        ImageIcon picfreezer = new ImageIcon("freezer.png");
        ImageIcon picfirer = new ImageIcon("firer.png");
        ImageIcon picthunder = new ImageIcon("thunder.png");
        ImageIcon picmew = new ImageIcon("mew.png");
        ImageIcon picmewtwo = new ImageIcon("mewtwo.png");
        JLabel bg = new JLabel(pic);
        c.add(bg);
        pack();

        JButton attack = new JButton("");
        JButton bag = new JButton("");
        JButton skill = new JButton("");
        JButton run = new JButton("");
        JTextField text = new JTextField();


        /*text.setText(""+pokemon.printinfo(pokemon));
        text.setBounds(5, 5, 400, 200);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Arial Black", Font.PLAIN, 15));
        text.setForeground ( Color.WHITE );
        bg.add(text);*/

        attack.setText("ATTACK");
        attack.setBounds(600,500,300,60);
        attack.setFont(new Font("Arial Black", Font.PLAIN, 25));
        attack.setBackground(Color.WHITE);
        
        
        bag.setText("BAG");
        bag.setBounds(900,500,300,60);
        bag.setFont(new Font("Arial Black", Font.PLAIN, 25));
        bag.setBackground(Color.WHITE);
        

        skill.setText("SKILL");
        skill.setBounds(600,580,300,60);
        skill.setFont(new Font("Arial Black", Font.PLAIN, 25));
        skill.setBackground(Color.WHITE);
        

        run.setText("RUN");
        run.setBounds(900,580,300,60);
        run.setFont(new Font("Arial Black", Font.PLAIN, 25));
        run.setBackground(Color.WHITE);
        
        
        bg.add(attack);
        bg.add(bag);
        bg.add(run);
        bg.add(skill);
        
        System.out.println(pokemon.getNo());
        switch(pokemon.getNo()){
            case 1 : JLabel bulbasaur = new JLabel(picbulbasaur);
                     bulbasaur.setBounds(180,250, 400, 400);
                     bg.add(bulbasaur);
                     break;
            case 2 : JLabel charmander = new JLabel(piccharmander);
                        charmander.setBounds(180,250, 400, 400);
                         bg.add(charmander);
                         break;
            case 3 : JLabel squirtle = new JLabel(picsquirtle);
                        squirtle.setBounds(180,250, 400, 400);
                         bg.add(squirtle);
                         break;
           case 4 : JLabel pikachu = new JLabel(picpikachu);
                        pikachu.setBounds(180,250, 400, 400);
                         bg.add(pikachu);
                         break;
             case 5 : JLabel caterpie = new JLabel(piccaterpie);
                        caterpie.setBounds(180,250, 400, 400);
                         bg.add(caterpie);
                         break;
            case 6: JLabel weedle = new JLabel(picweedle);
                        weedle.setBounds(180,250, 400, 400);
                         bg.add(weedle);
                         break;
            case 7 : JLabel rattata = new JLabel(picrattata);
                        rattata.setBounds(180,250, 400, 400);
                         bg.add(rattata);
                         break;
            case 8 : JLabel pidgey = new JLabel(picpidgey);
                        pidgey.setBounds(180,250, 400, 400);
                         bg.add(pidgey);        
                         break;
            case 9 : JLabel spearow = new JLabel(picspearow);
                        spearow.setBounds(180,250, 400, 400);
                         bg.add(spearow);
                         break;
            case 10 : JLabel sandshrew = new JLabel(picsandshrew);
                        sandshrew.setBounds(180,250, 400, 400);
                        bg.add(sandshrew);
                         
                         break;
            case 11 :JLabel ekans = new JLabel(picekans);
                        ekans.setBounds(180,250, 400, 400);
                        bg.add(ekans);
                    break;
            case 12 :JLabel freezer = new JLabel(picfreezer);
                    freezer.setBounds(180,250, 400, 400);
                    bg.add(freezer);
                    break;
                    
            case 14 :JLabel firer = new JLabel(picfirer);
                    firer.setBounds(180,250, 400, 400);
                    bg.add(firer);
                    
                    break;
            case 13 :JLabel thunder = new JLabel(picthunder);
                        thunder.setBounds(180,250, 400, 400);
                        bg.add(thunder);
                    
                        break;
            case 15 :JLabel mew = new JLabel(picmew);
                    mew.setBounds(180,250, 400, 400);
                     bg.add(mew);
                   
                      break;
            case 16 :JLabel mewtwo = new JLabel(picmewtwo);
                        mewtwo.setBounds(180,250, 400, 400);
                        bg.add(mewtwo);     
                        break;
        }
       

        switch(random){
            case 1: JLabel bgp1 = new JLabel(piccaterpie);
                     bgp1.setBounds(800, 70, 400, 400);
                     bg.add(bgp1);
                     break;
            case 2: JLabel bgp2 = new JLabel(picpidgey);
                    bgp2.setBounds(800, 70, 400, 400);
                    bg.add(bgp2);
                    break;
            case 3:JLabel bgp3 = new JLabel(picweedle);
                    Weedle weedle = new Weedle("Wild Weedle");
                    bgp3.setBounds(800, 70, 400, 400);
                    bg.add(bgp3);
                     break;
            case 4 :JLabel bgp4= new JLabel(picsandshrew);
                    Sandshrew sandshrew = new Sandshrew("Wild Sandshrew");
                    bgp4.setBounds(800, 70, 400, 400);
                    bg.add(bgp4);
                    break;
            case 5 :JLabel bgp5 = new JLabel(picspearow);
                    Spearow spearow = new Spearow("Wild Spearow");
                     bgp5.setBounds(800, 70, 400, 400);
                     bg.add(bgp5);
                    break;

        }

        attack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                pokemon.attack(pokemon,wildpokemon);
                int ran = (int)((Math.random()*100)+50);
                if((pokemon.getHP()>0)&&(wildpokemon.getHP()>0))
                JOptionPane.showMessageDialog(null,"Your "+pokemon.getName()+"Attack "+ wildpokemon.getName()+"and "+wildpokemon.getName()+"Attck You\n Your HP: "+pokemon.getHP()+" / "+wildpokemon.getName()+"HP: "+ wildpokemon.getHP());
                
                else if(wildpokemon.getHP()<=0){
                 
                 JOptionPane.showMessageDialog(null,"You WIN!!!!!!!!\n You got "+ran+"$");
                trainer.addMoney(ran);
                if(pokemon.getHP()<0){
                    pokemon.hp = 0;
                }
                MenuPlayGui mu = new MenuPlayGui(trainer);
                setVisible(false);
                }
                else if((pokemon.getHP()<=0)&&(wildpokemon.getHP()>0)){
                 JOptionPane.showMessageDialog(null,"You LOSE \n You got "+ran+"$");
                 trainer.addMoney(ran-30);
                 pokemon.mp = pokemon.maxmp;
                 MenuPlayGui mu = new MenuPlayGui(trainer);
                setVisible(false);
                }
               }
          });
          
          skill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int ran = (int)((Math.random()*100)+50);
                pokemon.skill(pokemon,wildpokemon);
                if((pokemon.getHP()>0)&&(wildpokemon.getHP()>0)&&(pokemon.getMP()>0)){
                JOptionPane.showMessageDialog(null,"Your "+pokemon.getName()+"Skill to "+ wildpokemon.getName()+"and "+wildpokemon.getName()+"Attck You\n Your HP: "+pokemon.getHP()+" / "+wildpokemon.getName()+"HP: "+ wildpokemon.getHP()+"\n Your MP:"+pokemon.getMP());
                }
                else if(pokemon.getMP()<0){
                    JOptionPane.showMessageDialog(null,"Not Enough Mp");
                }

                else if(wildpokemon.getHP()<=0){
                   
                JOptionPane.showMessageDialog(null,"You WIN!!!!!!!!\n You got "+ran+"$");
                trainer.addMoney(ran);
                if(pokemon.getHP()<0){
                    pokemon.hp = 0;
                }
                pokemon.mp = pokemon.maxmp;
                MenuPlayGui mu = new MenuPlayGui(trainer);
                setVisible(false);
                }
                 else if((pokemon.getHP()<=0)&&(wildpokemon.getHP()>0)){
                 JOptionPane.showMessageDialog(null,"You LOSE \n You got "+ran+"$");
                 trainer.addMoney(ran-30);
                 pokemon.mp = pokemon.maxmp;
                 MenuPlayGui mu = new MenuPlayGui(trainer);
                setVisible(false);
                }
               }
          });



          bag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                BagbattleGui bt = new BagbattleGui(trainer, pokemon, wildpokemon, random);
                setVisible(false);
               }
          });

          run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null,"YOU VERY FK NOOB");
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
               }
          });
    }      
}