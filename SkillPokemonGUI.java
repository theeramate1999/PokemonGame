import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkillPokemonGUI extends JFrame{
    private Pokemon pokemon;

    public SkillPokemonGUI(Pokemon pokemon){
        this.pokemon = pokemon;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        Container c = getContentPane();
        
    }
}