
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GachaGUI extends JFrame{
    private Trainer trainer;
    private int random = 0;

    public GachaGUI(Trainer trainer){
        super("GACHAPON!!!!!");
        this.trainer = trainer;
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        ImageIcon pic = new ImageIcon("gacha.jpg");
        ImageIcon picpokeball = new ImageIcon("pokeicon.png");
        ImageIcon picgreat = new ImageIcon("greaticon.png");
        ImageIcon picultra = new ImageIcon("ultraicon.png");
        ImageIcon picmaster = new ImageIcon("mastericon.png");
        ImageIcon picback   = new ImageIcon("back.png");

        JLabel bg = new  JLabel(pic);
        JButton poke = new JButton("");
        JButton great = new JButton("");
        JButton ultra = new JButton("");
        JButton master = new JButton("");
        JButton back = new JButton("");
        
        back.setBounds(450, 10, 150, 80);
        back.setIcon(picback);

        poke.setBounds(140,470,150,80);
        poke.setIcon(picpokeball);

        great.setBounds(350,470, 150, 80);
        great.setIcon(picgreat);
        
        ultra.setBounds(140, 555, 150, 80);
        ultra.setIcon(picultra);

        master.setBounds(350, 555, 150, 80);    
        master.setIcon(picmaster);

        c.add(bg);
        pack();

        bg.add(poke);
        bg.add(great);
        bg.add(ultra);
        bg.add(master);
        bg.add(back);

        poke.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                random =(int )(Math.random()*5)+1;
                System.out.println(random);
                    if(trainer.getPokeball(1)>0){
                    switch(random){
                    case 1 :  Rattata rattata = new Rattata("Rattata");
                              trainer.addPokemon(rattata);
                              JOptionPane.showMessageDialog(null, "Congratulation you gotcha Rattata");
                              break;
                    case 2 : Caterpie caterpie = new Caterpie("Caterpie");
                             trainer.addPokemon(caterpie);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Caterpie");
                             break;
                    case 3 : Weedle weedle = new Weedle("Weedle");
                             trainer.addPokemon(weedle);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Weedle");
                             break;
                    case 4 : Pidgey pidgey = new Pidgey("Pidgey");
                            trainer.addPokemon(pidgey);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Pidgey");
                            break;
                    case 5 : Spearow spearow = new Spearow("Spearow");
                            trainer.addPokemon(spearow);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Spearow");
                            break;      

                }
                trainer.addGacha(1);
            }
            else
            JOptionPane.showMessageDialog(null, "You don't have Pokeball");
            }
        });
    
    
        great.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                random =(int )(Math.random()*5)+1;
                System.out.println(random);
                    if(trainer.getPokeball(2)>0){
                    switch(random){
                    case 1 :  Rattata rattata = new Rattata("Great Rattata");
                              rattata.hp += 50;
                              rattata.dmg += 10;
                              trainer.addPokemon(rattata);
                              JOptionPane.showMessageDialog(null, "Congratulation you gotcha Great Rattata");
                              break;
                    case 2 : Ekans ekans = new Ekans("Great Ekans");
                              ekans.hp += 30;
                              ekans.dmg += 10;
                             trainer.addPokemon(ekans);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Great Ekans");
                             break;
                    case 3 : Weedle weedle = new Weedle("Great Weedle");
                              weedle.hp += 50;
                              weedle.dmg += 10;
                             trainer.addPokemon(weedle);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Great Weedle");
                             break;
                    case 4 : Pidgey pidgey = new Pidgey("Great Pidgey");
                              pidgey.hp += 50;
                              pidgey.dmg += 10;
                            trainer.addPokemon(pidgey);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Great Pidgey");
                            break;
                    case 5 : Spearow spearow = new Spearow("Great Spearow");
                            spearow.hp += 50;
                            spearow.dmg += 10;
                            trainer.addPokemon(spearow);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Spearow");
                            break;      

                }
                trainer.addGacha(2);
            }
            else
            JOptionPane.showMessageDialog(null, "You don't have Great Pokeball");
            }
        });


        


        ultra.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                random =(int )(Math.random()*5)+1;
                System.out.println(random);
                    if(trainer.getPokeball(3)>0){
                    switch(random){
                    case 1 :  Bulbasaur bulbasaur = new Bulbasaur("Ultra Bulbasaur");
                              bulbasaur.hp += 100;
                              bulbasaur.dmg += 15;
                              trainer.addPokemon(bulbasaur);
                              JOptionPane.showMessageDialog(null, "Congratulation you gotcha Ultra Bulbasaur");
                              break;
                    case 2 : Charmander charmander = new Charmander("Ultra Charmander");
                              charmander.hp += 100;
                              charmander.dmg += 16;
                             trainer.addPokemon(charmander);
                             JOptionPane.showMessageDialog(null, "Congratulation you Ultra Charmander");
                             break;
                    case 3 : Squirtle squirtle= new Squirtle("Ultra Squirtle");
                              squirtle.hp += 100;
                              squirtle.dmg += 20;
                             trainer.addPokemon(squirtle);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Ultra Squirtle");
                             break;
                    case 4 : Pikachu pikachu = new Pikachu("Ultra Pikachu");
                              pikachu.hp += 150;
                              pikachu.dmg += 20;
                            trainer.addPokemon(pikachu);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Ultra Pikachu");
                            break;
                    case 5 : Sandshrew sandshrew= new Sandshrew("Ultra Sandshrew");
                            sandshrew.hp += 100;
                            sandshrew.dmg += 20;
                            trainer.addPokemon(sandshrew);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Ultra Sandshrew");
                            break;      

                }
                trainer.addGacha(3);
            }
            else
            JOptionPane.showMessageDialog(null, "You don't have Ultra Ball");
            }
        });

        master.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                random =(int )(Math.random()*5)+1;
                System.out.println(random);
                    if(trainer.getPokeball(4)>0){
                    switch(random){
                    case 1 :  Freezer freezer = new Freezer("Freezer");
                              trainer.addPokemon(freezer);
                              JOptionPane.showMessageDialog(null, "Congratulation you gotcha Freezer");
                              break;
                    case 2 : Firer firer = new Firer("Firer"); 
                             trainer.addPokemon(firer);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Firer ");
                             break;
                    case 3 : Thunder thunder= new Thunder("Thunder");
                             trainer.addPokemon(thunder);
                             JOptionPane.showMessageDialog(null, "Congratulation you gotcha Thunder");
                             break;
                    case 4 : Mew mew = new Mew("Mew");
                            trainer.addPokemon(mew);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha Mew");
                            break;
                    case 5 : Mewtwo mewtwo = new Mewtwo("Mewtwo");
                            trainer.addPokemon(mewtwo);
                            JOptionPane.showMessageDialog(null, "Congratulation you gotcha !!!!Mewtwo!!!!");
                            break;      

                }
                trainer.addGacha(4);
            }
            else
            JOptionPane.showMessageDialog(null, "You don't have MasterBall");
            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                MenuPlayGui mp = new MenuPlayGui(trainer);
                setVisible(false);
               }
          });
    }
}