import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FindGUI extends JFrame{
    private Trainer trainer;
    private ArrayList<Pokemon> bag;
    private Pokemon wildpokemon;
    private JButton[] details = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton()
        , new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
    public FindGUI(Trainer trainer){
        super("Pokemon Battle");
        this.trainer = trainer;
        bag = trainer.getBag();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        Container c = getContentPane();
        ImageIcon pic = new ImageIcon("bgbattle.jpg");
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



        JLabel bg =  new JLabel(pic);
        int i = 0;
        int z = 100;
        int y= 100;
        for(Pokemon p : bag){
            if(i<6){
                details[i].setText(trainer.GetPokemon(i).getName());
                details[i].setBounds(100,y,300,60);
                details[i].setFont(new Font("Arial Black", Font.PLAIN, 25));
                details[i].setBackground(Color.WHITE);
                bg.add(details[i]);
                y += 90;
            }
            else if(i>=6 && i<10){
                details[i].setText(trainer.GetPokemon(i).getName());
                details[i].setBounds(400,z,300,60);
                details[i].setFont(new Font("Arial Black", Font.PLAIN, 25));
                details[i].setBackground(Color.WHITE);
                bg.add(details[i]);
                z += 90;
            }
            i++;

        }
        int random ;
        random =(int )(Math.random()*5)+1;
        switch(random){
            case 1: JLabel bgp1 = new JLabel(piccaterpie);
                    wildpokemon = new Caterpie("Wild Caterpie");
                     bgp1.setBounds(800, 70, 400, 400);
                     bg.add(bgp1);
                     break;
            case 2: JLabel bgp2 = new JLabel(picpidgey);
                    wildpokemon = new Pidgey("Wild Pidgey");
                    
                    bgp2.setBounds(800, 70, 400, 400);
                    bg.add(bgp2);
                    break;
            case 3:JLabel bgp3 = new JLabel(picweedle);
                    wildpokemon = new Weedle("Wild Weedle");
                    bgp3.setBounds(800, 70, 400, 400);
                    bg.add(bgp3);
                     break;
            case 4 :JLabel bgp4= new JLabel(picsandshrew);
                    wildpokemon = new Sandshrew("Wild Sandshrew");
                    bgp4.setBounds(800, 70, 400, 400);
                    bg.add(bgp4);
                    break;
            case 5 :JLabel bgp5 = new JLabel(picspearow);
                    wildpokemon = new Spearow("Wild Spearow");
                     bgp5.setBounds(800, 70, 400, 400);
                     bg.add(bgp5);
                    break;

        }
        c.add(bg);
        pack();
        details[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(trainer.GetPokemon(0).getHP() > 0 ){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(0),wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(0).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(trainer.GetPokemon(1).getHP() > 0){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(1), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(1).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(trainer.GetPokemon(2).getHP() > 0){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(2), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(2).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(3).getHP() > 0) && (trainer.GetPokemon(3).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(3), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(3).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(4).getHP() > 0) && (trainer.GetPokemon(4).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(4), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(4).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(5).getHP() > 0) && (trainer.GetPokemon(5).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(5), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(5).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(6).getHP() > 0) && (trainer.GetPokemon(6).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(6),wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(6).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(7).getHP() > 0) && (trainer.GetPokemon(7).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(7),wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(7).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(8).getHP() > 0) && (trainer.GetPokemon(8).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(8), wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(8).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        details[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((trainer.GetPokemon(9).getHP() > 0) && (trainer.GetPokemon(9).getMP() > 0)){
                    BattleGUI bt = new BattleGUI(trainer,trainer.GetPokemon(9),wildpokemon,random);
                    setVisible(false);
                }
                else if(trainer.GetPokemon(9).getHP() <= 0){
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower HP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Your Pokemon Lower SP",
                    "System Notification",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        });


    }
}