import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MenuPlayGui extends JFrame{
private Trainer trainer;

public MenuPlayGui(Trainer trainer){
    super("Pokemon Game");

    this.trainer = trainer;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    Container c = getContentPane();

	ImageIcon pic = new ImageIcon("Interview.gif");
	ImageIcon picbt = new ImageIcon("battle.png");
	ImageIcon picps = new ImageIcon("pokemonstatus.png");
	ImageIcon picbb = new ImageIcon("bag.png");
	ImageIcon pics = new ImageIcon("shop.png");
	ImageIcon picpc = new ImageIcon("pokemoncenter.png");
	ImageIcon picgacha = new ImageIcon("gachaicon.png");

	JLabel bg = new JLabel(pic);
	JButton battle = new JButton("");
	JButton howtoplay = new JButton("");
	JButton bagButton = new JButton("");
	JButton shop = new JButton("");
	JButton pokemoncenter =  new JButton("");
	JButton gacha = new JButton("");
	


    c.add(bg);
	pack();
	
	pokemoncenter.setBounds(580,350, 150, 80);
	pokemoncenter.setIcon(picpc);

	battle.setBounds(580, 250, 150, 80);
	battle.setIcon(picbt);


	gacha.setBounds(100, 550, 150, 80);
	gacha.setIcon(picgacha);

	howtoplay.setBounds(1000, 550, 150, 80);
	howtoplay.setIcon(picps);

	bagButton.setBounds(580, 450, 150, 80);
	bagButton.setIcon(picbb);

	shop.setBounds(580, 550, 150, 80);
	shop.setIcon(pics);

	bg.add(pokemoncenter);
	bg.add(battle);
	bg.add(howtoplay);
	bg.add(bagButton);
	bg.add(shop);
	bg.add(gacha);


	gacha.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			GachaGUI gg = new GachaGUI(trainer);
			setVisible(false);
		}
	});
	
	battle.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			FindGUI fi = new FindGUI(trainer); 
			setVisible(false);
		}
	});

	howtoplay.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Interview in = new Interview(trainer);
			setVisible(false);
		}
	});

	bagButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			bagGUI ba = new bagGUI(trainer);
			setVisible(false);
		}
	});

	shop.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			ShopGui sg = new ShopGui(trainer);
			setVisible(false);
		}
	});

	pokemoncenter.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			pokemoncenterGUI ps = new pokemoncenterGUI(trainer);
			setVisible(false);
		}
	});
}
}