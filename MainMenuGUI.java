import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenuGUI extends JFrame{
    private Trainer trainer;
    public MainMenuGUI(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("Mainmenu.jpg");
        ImageIcon femaleIcon = new ImageIcon("female.jpg");
        ImageIcon maleIcon = new ImageIcon("male.png ");
        JLabel pic = new JLabel(img);
        
        c.add(pic);
        pack();

       
        JTextField tnameField = new JTextField();
        tnameField.setBounds(500, 500, 200, 50);
        tnameField.setColumns(50);

        JButton nxButton = new JButton("NEXT");
        nxButton.setBounds(720,500, 100, 50);
        

        JButton female = new JButton("");
        female.setBounds(200,200,250,250);
        female.setIcon(femaleIcon);
        // Play.setFont(new Font("Pokemon X and Y", Font.PLAIN, 60));    
        JButton male = new JButton("");
        male.setBounds(780,200, 250, 250);
        male.setIcon(maleIcon);
        
        pic.add(nxButton);
        pic.add(female);
        pic.add(male);
        pic.add(tnameField);

        male.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.setSex(0);
                JOptionPane.showMessageDialog(null, "You chosse Male");
                
            }
        });


        female.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.setSex(1);
                JOptionPane.showMessageDialog(null, "You chosse FeMale");
                
            }
        });

        nxButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.setName(tnameField.getText());
                System.out.println(""+trainer.getName());
                StarterPokemonGui s = new StarterPokemonGui(trainer);

                setVisible(false);
            }
        });
    }
}