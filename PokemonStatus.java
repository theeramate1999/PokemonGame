
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame{
    private Pokemon pokemon;
    private Trainer trainer;
    
    public PokemonStatus(Pokemon pokemon,Trainer trainer){
        super("Pokemon Game");
        this.pokemon = pokemon;
        this.trainer = trainer;
        Container c = getContentPane();
        ImageIcon picinfo = new ImageIcon("info.png"); 
        ImageIcon picrename = new ImageIcon("rename.png");
        ImageIcon picback   = new ImageIcon("back.png");

        ImageIcon picfire = new ImageIcon("fire.jpg");
        ImageIcon picwater = new ImageIcon("water.jpg");
        ImageIcon picglass = new ImageIcon("glass.jpg");
        ImageIcon picnormal = new ImageIcon("normal.jpg");
        ImageIcon picbug = new ImageIcon("bug.jpg");
        ImageIcon picground = new ImageIcon("ground.jpg"); 
        ImageIcon picfry = new ImageIcon("fry.jpg");
        ImageIcon picelectric = new ImageIcon("electric.jpg");
        ImageIcon piclegendb = new ImageIcon("legendbird.jpg");
        ImageIcon piclegend = new ImageIcon("legend.jpg");


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


        if(pokemon.getNo()==1){ //bulbasaur
            JLabel bg = new JLabel(picglass);
            JLabel poke = new JLabel(picbulbasaur);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GREEN);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()==2){ //charmander
            JLabel bg = new JLabel(picfire);
            JLabel poke = new JLabel(piccharmander);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.PINK);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()==3){ 
            JLabel bg = new JLabel(picwater);
            JLabel poke = new JLabel(picsquirtle);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.BLUE);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()== 4){ 
            JLabel bg = new JLabel(picelectric);
            JLabel poke = new JLabel(picpikachu);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.YELLOW);
            info.setForeground ( Color.BLACK );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                    setVisible(false);
                   }
              });
        }

        else  if(pokemon.getNo()== 5){ 
            JLabel bg = new JLabel(picbug);
            JLabel poke = new JLabel(piccaterpie);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GREEN);
            info.setForeground ( Color.BLACK );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else if(pokemon.getNo()== 6){ 
            JLabel bg = new JLabel(picbug);
            JLabel poke = new JLabel(picweedle);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GREEN);
            info.setForeground ( Color.BLACK );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()== 7){ 
            JLabel bg = new JLabel(picnormal);
            JLabel poke = new JLabel(picrattata);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GRAY);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }

        else  if(pokemon.getNo()== 8){ 
            JLabel bg = new JLabel(picfry);
            JLabel poke = new JLabel(picpidgey);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.BLUE);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()== 9){ 
            JLabel bg = new JLabel(picfry);
            JLabel poke = new JLabel(picspearow);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.BLUE);
            info.setForeground ( Color.WHITE);
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else  if(pokemon.getNo()== 10){ 
            JLabel bg = new JLabel(picground);
            JLabel poke = new JLabel(picsandshrew);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GREEN);
            info.setForeground ( Color.BLACK );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });

              rename.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    renameGUI n = new renameGUI(pokemon,trainer);
                   }
              });
        }
        else if(pokemon.getNo()==11){ 
            JLabel bg = new JLabel(picglass);
            JLabel poke = new JLabel(picekans);
            JTextArea info = new JTextArea("");
            JButton rename = new JButton("");
            JButton back = new JButton("");
            c.add(bg);
            pack();
            poke.setBounds(10,10, 400, 400);
            info.setText(pokemon.printinfo(pokemon)+"\nSKILL\n"+pokemon.printSkill(pokemon.getType()));
            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
            info.setTabSize(10);
            info.setBounds(420,10, 400, 400);
            info.setBackground(Color.GREEN);
            info.setForeground ( Color.WHITE );
            rename.setBounds(10,450 , 150, 80);
            rename.setIcon(picrename);
            back.setBounds(600, 450, 150, 80);
            back.setIcon(picback);
            bg.add(poke);
            bg.add(info);
            bg.add(rename);
            bg.add(back);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    bagGUI m = new bagGUI(trainer);
                    setVisible(false);
                   }
              });
            }
            else if(pokemon.getNo()==12){ 
                JLabel bg = new JLabel(piclegendb);
                JLabel poke = new JLabel(picfreezer);
                JTextArea info = new JTextArea("");
                JButton rename = new JButton("");
                JButton back = new JButton("");
                c.add(bg);
                pack();
                poke.setBounds(10,10, 400, 400);
                info.setText(pokemon.printinfo(pokemon));
                info.setFont(new Font("Arial Black", Font.PLAIN, 20));
                info.setTabSize(10);
                info.setBounds(420,10, 400, 400);
                info.setBackground(Color.BLACK);
                info.setForeground ( Color.WHITE );
                rename.setBounds(10,450 , 150, 80);
                rename.setIcon(picrename);
                back.setBounds(600, 450, 150, 80);
                back.setIcon(picback);
                bg.add(poke);
                bg.add(info);
                bg.add(rename);
                bg.add(back);
    
                back.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        bagGUI m = new bagGUI(trainer);
                        setVisible(false);
                       }
                  });
                }
                else if(pokemon.getNo()==14){ 
                    JLabel bg = new JLabel(piclegendb);
                    JLabel poke = new JLabel(picfirer);
                    JTextArea info = new JTextArea("");
                    JButton rename = new JButton("");
                    JButton back = new JButton("");
                    c.add(bg);
                    pack();
                    poke.setBounds(10,10, 400, 400);
                    info.setText(pokemon.printinfo(pokemon));
                    info.setFont(new Font("Arial Black", Font.PLAIN, 20));
                    info.setTabSize(10);
                    info.setBounds(420,10, 400, 400);
                    info.setBackground(Color.RED);
                    info.setForeground ( Color.WHITE );
                    rename.setBounds(10,450 , 150, 80);
                    rename.setIcon(picrename);
                    back.setBounds(600, 450, 150, 80);
                    back.setIcon(picback);
                    bg.add(poke);
                    bg.add(info);
                    bg.add(rename);
                    bg.add(back);
        
                    back.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            bagGUI m = new bagGUI(trainer);
                            setVisible(false);
                           }
                      });
                    }
                    else if(pokemon.getNo()==13){ 
                        JLabel bg = new JLabel(piclegendb);
                        JLabel poke = new JLabel(picthunder);
                        JTextArea info = new JTextArea("");
                        JButton rename = new JButton("");
                        JButton back = new JButton("");
                        c.add(bg);
                        pack();
                        poke.setBounds(10,10, 400, 400);
                        info.setText(pokemon.printinfo(pokemon));
                        info.setFont(new Font("Arial Black", Font.PLAIN, 20));
                        info.setTabSize(10);
                        info.setBounds(420,10, 400, 400);
                        info.setBackground(Color.YELLOW);
                        info.setForeground ( Color.BLACK );
                        rename.setBounds(10,450 , 150, 80);
                        rename.setIcon(picrename);
                        back.setBounds(600, 450, 150, 80);
                        back.setIcon(picback);
                        bg.add(poke);
                        bg.add(info);
                        bg.add(rename);
                        bg.add(back);
            
                        back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                bagGUI m = new bagGUI(trainer);
                                setVisible(false);
                               }
                          });
                        }
                        else if(pokemon.getNo()==15){ 
                            JLabel bg = new JLabel(piclegend);
                            JLabel poke = new JLabel(picmew);
                            JTextArea info = new JTextArea("");
                            JButton rename = new JButton("");
                            JButton back = new JButton("");
                            c.add(bg);
                            pack();
                            poke.setBounds(10,10, 400, 400);
                            info.setText(pokemon.printinfo(pokemon));
                            info.setFont(new Font("Arial Black", Font.PLAIN, 20));
                            info.setTabSize(10);
                            info.setBounds(420,10, 400, 400);
                            info.setBackground(Color.BLACK);
                            info.setForeground ( Color.WHITE );
                            rename.setBounds(10,450 , 150, 80);
                            rename.setIcon(picrename);
                            back.setBounds(600, 450, 150, 80);
                            back.setIcon(picback);
                            bg.add(poke);
                            bg.add(info);
                            bg.add(rename);
                            bg.add(back);
                
                            back.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent event) {
                                    bagGUI m = new bagGUI(trainer);
                                    setVisible(false);
                                   }
                              });
                            }              
                            else if(pokemon.getNo()==16){ 
                                JLabel bg = new JLabel(piclegend);
                                JLabel poke = new JLabel(picmewtwo);
                                JTextArea info = new JTextArea("");
                                JButton rename = new JButton("");
                                JButton back = new JButton("");
                                c.add(bg);
                                pack();
                                poke.setBounds(10,10, 400, 400);
                                info.setText(pokemon.printinfo(pokemon));
                                info.setFont(new Font("Arial Black", Font.PLAIN, 20));
                                info.setTabSize(10);
                                info.setBounds(420,10, 400, 400);
                                info.setBackground(Color.BLACK);
                                info.setForeground ( Color.WHITE );
                                rename.setBounds(10,450 , 150, 80);
                                rename.setIcon(picrename);
                                back.setBounds(600, 450, 150, 80);
                                back.setIcon(picback);
                                bg.add(poke);
                                bg.add(info);
                                bg.add(rename);
                                bg.add(back);
                    
                                back.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent event) {
                                        bagGUI m = new bagGUI(trainer);
                                        setVisible(false);
                                       }
                                  });
                                }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }
}

