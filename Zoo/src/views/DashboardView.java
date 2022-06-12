//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package views;

import models.Animal.Animal;
import models.Animal.Mammal.*;
import models.Animal.Other.Eagle;
import models.Animal.Other.Goldfish;
import models.Animal.Other.Penguin;
import models.Employee.Employee;
import models.Enclosure.Aquarium;
import models.Enclosure.Aviary;
import models.Enclosure.Enclosure;
import models.Enclosure.StandardEnclosure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The type Dashboard view.
 */
public class DashboardView extends JFrame {
    /**
     * The Loup.
     */
    Wolf loup = new Wolf("Bergamo", "Mâle", 26.44, 1.55, false, false, true, (byte) 69);
    /**
     * The Tigre.
     */
    Tiger tigre = new Tiger("Austin", "Mâle", 56.44, 1.85, true, false, true, (byte) 102);
    /**
     * The Ours.
     */
    Bear ours = new Bear("Bouba", "Mâle", 155.53, 2.65, true, false, true, (byte) -31);
    /**
     * The Baleine.
     */
    Whale baleine = new Whale("Doquaire", "Femelle", 27000.49, 11.55, false, false, true, (byte) 109);
    /**
     * The Poisson.
     */
    Goldfish poisson = new Goldfish("Némo", "Mâle", 0.11, 0.48, true, false, true, (byte) 5);
    /**
     * The Requin.
     */
    Shark requin = new Shark("Kisame", "Mâle", 140.32, 3.12, true, false, true, (byte) 18);
    /**
     * The Aigle.
     */
    Eagle aigle = new Eagle("Guériaigle", "Femelle", 5.34, 0.98, false, false, true, (byte) 45);
    /**
     * The Pingouin.
     */
    Penguin pingouin = new Penguin("Tiplouf", "Mâle", 0.72, 0.43, false, true, true, (byte) 37);
    /**
     * The Animals.
     */
    Animal[] animals;
    /**
     * The Wolf list.
     */
    List<Animal> wolfList;
    /**
     * The Tiger list.
     */
    List<Animal> tigerList;
    /**
     * The Bear list.
     */
    List<Animal> bearList;
    /**
     * The Whale list.
     */
    List<Animal> whaleList;
    /**
     * The Goldfish list.
     */
    List<Animal> goldfishList;
    /**
     * The Eagle list.
     */
    List<Animal> eagleList;
    /**
     * The Shark list.
     */
    List<Animal> sharkList;
    /**
     * The Penguin list.
     */
    List<Animal> penguinList;
    /**
     * The Enclos loup.
     */
    StandardEnclosure enclosLoup;
    /**
     * The Enclos tigre.
     */
    StandardEnclosure enclosTigre;
    /**
     * The Enclos ours.
     */
    StandardEnclosure enclosOurs;
    /**
     * The Enclos baleine.
     */
    Aquarium enclosBaleine;
    /**
     * The Enclos poisson rouge.
     */
    Aquarium enclosPoissonRouge;
    /**
     * The Enclos requin.
     */
    Aquarium enclosRequin;
    /**
     * The Enclos aigle.
     */
    Aviary enclosAigle;
    /**
     * The Enclos pinguin.
     */
    StandardEnclosure enclosPinguin;
    /**
     * The Loup 2.
     */
    Wolf loup2;
    /**
     * The Tigre 2.
     */
    Tiger tigre2;
    /**
     * The Ours 2.
     */
    Bear ours2;
    /**
     * The Baleine 2.
     */
    Whale baleine2;
    /**
     * The Poisson 2.
     */
    Goldfish poisson2;
    /**
     * The Requin 2.
     */
    Shark requin2;
    /**
     * The Aigle 2.
     */
    Eagle aigle2;
    /**
     * The Pingouin 2.
     */
    Penguin pingouin2;
    /**
     * The Employee.
     */
    Employee employee;
    /**
     * The Employee 2.
     */
    Employee employee2;

    /**
     * Instantiates a new Dashboard view.
     */
    public DashboardView() {
        super("Gestion du Zoo");
        this.animals = new Animal[]{this.loup, this.tigre, this.ours, this.baleine, this.poisson, this.requin, this.aigle, this.pingouin};
        this.wolfList = new ArrayList();
        this.tigerList = new ArrayList();
        this.bearList = new ArrayList();
        this.whaleList = new ArrayList();
        this.goldfishList = new ArrayList();
        this.eagleList = new ArrayList();
        this.sharkList = new ArrayList();
        this.penguinList = new ArrayList();
        this.enclosLoup = new StandardEnclosure("Enclos de loups", 950, 15, 1, (ArrayList) this.wolfList, (byte) 4, "Loup");
        this.enclosTigre = new StandardEnclosure("Enclos de tigres", 1200, 12, 1, (ArrayList) this.tigerList, (byte) 7, "Tigre");
        this.enclosOurs = new StandardEnclosure("Enclos d'ours", 1280, 7, 1, (ArrayList) this.bearList, (byte) 5, "Ours");
        this.enclosBaleine = new Aquarium("Enclos de baleines", 12000, 5, 1, (ArrayList) this.whaleList, (byte) 10, "Baleine", 500, 3);
        this.enclosPoissonRouge = new Aquarium("Enclos de poissons rouges", 500, 40, 1, (ArrayList) this.goldfishList, (byte) 10, "Poisson rouge", 15, 3);
        this.enclosRequin = new Aquarium("Enclos de requins", 7000, 10, 1, (ArrayList) this.sharkList, (byte) 7, "Requin", 200, 3);
        this.enclosAigle = new Aviary("Enclos d'aigles", 5000, 10, 1, (ArrayList) this.eagleList, (byte) 5, "Aigle", 100);
        this.enclosPinguin = new StandardEnclosure("Enclos de pingouins", 800, 40, 1, (ArrayList) this.penguinList, (byte) 9, "Pinguin");
        this.loup2 = new Wolf("Bergamette", "Femelle", 26.44, 1.55, false, false, true, (byte) 0);
        this.tigre2 = new Tiger("Austinette", "Femelle", 56.44, 1.85, true, false, true, (byte) 102);
        this.ours2 = new Bear("Boubette", "Femelle", 155.53, 2.65, true, false, true, (byte) -31);
        this.baleine2 = new Whale("Docker", "Mâle", 27000.49, 11.55, false, false, true, (byte) 105);
        this.poisson2 = new Goldfish("Dory", "Femelle", 0.11, 0.48, true, false, true, (byte) 0);
        this.requin2 = new Shark("Kisamette", "Femelle", 140.32, 3.12, true, false, true, (byte) 18);
        this.aigle2 = new Eagle("Vaututrice", "Femelle", 5.34, 0.98, false, false, true, (byte) 0);
        this.pingouin2 = new Penguin("Linux", "Mâle", 0.72, 0.43, false, true, true, (byte) 37);
        this.employee = new Employee("Employé", "Mâle", (byte) 30);
        this.employee2 = new Employee("Employé", "Femelle", (byte) 22);
        this.setSize(800, 600);
        this.setLocationRelativeTo((Component) null);
        String Home = "Home";
        String Previous = "Previous";
        String Next = "NEXT";
        JPanel card1 = new JPanel();
        card1.setLayout(new GridLayout(0, 1));
        JLabel label = new JLabel("Gestion de Zoo");
        card1.add(label);
        label.setBounds(150, 20, 500, 100);
        label.setForeground(new Color(0, 128, 0, 226));
        label.setFont(new Font("Arial", 1, 30));
        label.setHorizontalAlignment(0);
        label.setVerticalAlignment(1);
        card1.setBackground(new Color(196, 196, 196));
        JLabel img = new JLabel();
        img.setIcon(new ImageIcon("src/images/zoo.png"));
        card1.add(img);
        JPanel card2 = new JPanel();
        card2.setLayout(new BoxLayout(card2, 1));
        JLabel label2 = new JLabel("Gestion des enclos");
        label2.setFont(new Font("Arial", 1, 30));
        label2.setForeground(Color.getHSBColor(0.0F, 0.0F, 0.0F));
        label2.setLocation(100, 30);
        label2.setHorizontalAlignment(0);
        label2.setVerticalAlignment(1);
        card2.add(label2);
        card2.setBackground(new Color(192, 243, 252));
        JLabel label6 = new JLabel("Quel enclos souhaitez-vous voir les détails ?");
        card2.add(label6);
        card2.add(this.getEnclosList());
        JLabel label7 = new JLabel("Quel enclos souhaitez-vous nettoyer ?");
        card2.add(label7);
        card2.add(this.getEnclosListForClean());
        JLabel label8 = new JLabel("Quels animaux souhaitez-vous nourrir present dans l'enclos ?");
        card2.add(label8);
        card2.add(this.getEnclosListForFeed());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddLoupButton());
        card2.add(this.getRemoveLoupButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddOursButton());
        card2.add(this.getRemoveOursButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddTigreButton());
        card2.add(this.getRemoveTigreButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddPoissonButton());
        card2.add(this.getRemovePoissonButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddRequinButton());
        card2.add(this.getRemoveRequinButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddAigleButton());
        card2.add(this.getRemoveAigleButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddPinguinButton());
        card2.add(this.getRemovePinguinButton());
        card2.add(Box.createRigidArea(new Dimension(0, 20)));
        card2.add(this.getAddBaleineButton());
        card2.add(this.getRemoveBaleineButton());
        JPanel card3 = new JPanel();
        card3.setLayout(new BoxLayout(card3, 1));
        JLabel label3 = new JLabel("Gestion des animaux");
        label3.setForeground(Color.getHSBColor(0.0F, 0.0F, 0.0F));
        label3.setFont(new Font("Arial", 1, 30));
        label3.setLocation(400, 200);
        card3.add(label3);
        card3.setBackground(new Color(252, 247, 199));
        JLabel eatall = new JLabel("Souhaitez-vous nourrir tous les animaux  ?");
        card3.add(eatall);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.eatAllAnimaux());
        JLabel becaredAll = new JLabel("Souhaitez-vous soigner tous les animaux  ?");
        card3.add(becaredAll);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.soignerAllAnimaux());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel eatOne = new JLabel("Quel type d'animal souhaitez-vous nourrir  ?");
        card3.add(eatOne);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.nourrirAnimal());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel fly = new JLabel("Quel type d'animal souhaitez-vous voir voler ?");
        card3.add(fly);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.volerAnimal());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel swim = new JLabel("Quel type d'animal souhaitez-vous voir nager ?");
        card3.add(swim);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.nagerAnimal());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel wander = new JLabel("Quel type d'animal souhaitez-vous voir marcher ?");
        card3.add(wander);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.marcherAnimal());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel info = new JLabel("Quel type d'animal souhaitez-vous voir les détails ?");
        card3.add(info);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.connaitreAnimal());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel emettreUnSon = new JLabel("Quel type d'animal souhaitez-vous voir emettre un son ?");
        card3.add(emettreUnSon);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.emettreSon());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel dormir = new JLabel("Quel type d'animal souhaitez-vous voir dormir ?");
        card3.add(dormir);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.dormir());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel reveiller = new JLabel("Quel type d'animal souhaitez-vous voir se réveiller ?");
        card3.add(reveiller);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.reveiller());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel soigner = new JLabel("Quel type d'animal souhaitez-vous soigner ?");
        card3.add(soigner);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.soigner());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel bas = new JLabel("Sur quel souhaitez-vous voir si elle va mettre bas  ?");
        card3.add(bas);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.mettreBas());
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        JLabel pondre = new JLabel("Sur quel souhaitez-vous voir si elle va mettre bas  ?");
        card3.add(pondre);
        card3.add(Box.createRigidArea(new Dimension(0, 20)));
        card3.add(this.pondreUnOeuf());
        JPanel card4 = new JPanel();
        card4.setLayout(new GridLayout(0, 1));
        JLabel label4 = new JLabel("Gestion des employés");
        card4.add(label4);
        label4.setFont(new Font("Arial", 1, 30));
        label4.setForeground(Color.getHSBColor(0.0F, 0.0F, 0.0F));
        label4.setHorizontalAlignment(0);
        label4.setVerticalAlignment(1);
        card4.setBackground(new Color(255, 235, 225));
        card4.add(this.getExamineEnclosureButton());
        card4.add(this.getRandomizeAnimal());
        card4.add(this.getTransferAnimal());
        card4.add(this.getEatEnclos());
        card4.add(this.createCleanEnclosureButton());
        card4.add(this.getEmployeeAction());
        card4.add(this.getRandomizeEnclosure());
        JPanel card5 = new JPanel();
        card5.setLayout(new GridLayout(0, 1));
        JLabel label5 = new JLabel("Gestion des zoo");
        label5.setFont(new Font("Arial", 1, 30));
        label5.setForeground(Color.getHSBColor(0.0F, 0.0F, 0.0F));
        label5.setHorizontalAlignment(0);
        label5.setVerticalAlignment(1);
        card5.add(label5);
        card5.setBackground(new Color(196, 196, 196));
        card5.add(this.getShowAnimalsInAllEnclosures());
        this.getShowAnimalsInAllEnclosures().setHorizontalAlignment(0);
        this.getShowAnimalsInAllEnclosures().setVerticalAlignment(0);
        card5.add(this.getShowNbAnimalsPresent());
        this.getShowNbAnimalsPresent().setHorizontalAlignment(0);
        this.getShowNbAnimalsPresent().setVerticalAlignment(0);
        JScrollPane scrollPane = new JScrollPane(card2);
        scrollPane.setVerticalScrollBarPolicy(22);
        scrollPane.setHorizontalScrollBarPolicy(32);
        this.add(scrollPane, "East");
        JScrollPane scrollPane2 = new JScrollPane(card3);
        scrollPane.setVerticalScrollBarPolicy(22);
        scrollPane.setHorizontalScrollBarPolicy(32);
        this.add(scrollPane, "East");
        final JPanel cards = new JPanel(new CardLayout());
        cards.add(card1);
        cards.add(scrollPane);
        cards.add(scrollPane2);
        cards.add(card4);
        cards.add(card5);

        class ControlActionListenter implements ActionListener {
            ControlActionListenter(DashboardView this$0) {
            }

            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cards.getLayout();
                String cmd = e.getActionCommand();
                if (cmd.equals("Home")) {
                    cl.first(cards);
                } else if (cmd.equals("Previous")) {
                    cl.next(cards);
                } else if (cmd.equals("NEXT")) {
                    cl.previous(cards);
                }

            }
        }

        ControlActionListenter cal = new ControlActionListenter(this);
        JButton btn1 = new JButton("Accueil");
        btn1.setActionCommand("Home");
        btn1.addActionListener(cal);
        JButton btn2 = new JButton("Retour");
        btn2.setActionCommand("Previous");
        btn2.addActionListener(cal);
        JButton btn3 = new JButton("Suivant");
        btn3.setActionCommand("NEXT");
        btn3.addActionListener(cal);
        JPanel controlButtons = new JPanel();
        controlButtons.add(btn1);
        controlButtons.add(btn2);
        controlButtons.add(btn3);
        Container pane = this.getContentPane();
        pane.add(cards, (Object) null);
        pane.add(controlButtons, "South");
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog((Component) null, "Voulez-vous vraiment quitter l'application ?", "Quitter", 0);
                if (result == 0) {
                    System.exit(0);
                }

            }
        });
        this.setVisible(true);
    }

    /**
     * Eat all animaux j button.
     *
     * @return the j button
     */
    public JButton eatAllAnimaux() {
        JButton button = new JButton("Nourrir les animaux");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Animal[] animals = new Animal[]{DashboardView.this.loup, DashboardView.this.tigre, DashboardView.this.ours, DashboardView.this.baleine, DashboardView.this.poisson, DashboardView.this.requin, DashboardView.this.aigle, DashboardView.this.pingouin};
                Animal[] var3 = animals;
                int var4 = animals.length;

                for (int var5 = 0; var5 < var4; ++var5) {
                    Animal animal = var3[var5];
                    String animalName = animal.getName();
                    if (animal.getName().equals(animalName)) {
                        JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + animal.getName());
                        animal.eat();
                    } else {
                        JOptionPane.showMessageDialog((Component) null, "Veuillez choisir un animal");
                    }
                }

            }
        });
        button.setHorizontalAlignment(0);
        button.setBounds(300, 400, 200, 200);
        return button;
    }

    /**
     * Nourrir animal j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> nourrirAnimal() {
        final JComboBox<String> nourrirAnimal = new JComboBox();
        nourrirAnimal.addItem("Choisissez un type d'animal a nourrir");
        nourrirAnimal.addItem("Loup");
        nourrirAnimal.addItem("Tigre");
        nourrirAnimal.addItem("Ours");
        nourrirAnimal.addItem("Baleine");
        nourrirAnimal.addItem("Poisson");
        nourrirAnimal.addItem("Requin");
        nourrirAnimal.addItem("Aigle");
        nourrirAnimal.addItem("Pingouin");
        nourrirAnimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) nourrirAnimal.getSelectedItem();
                String var10001;
                if (animalName.equals("Loup")) {
                    DashboardView.this.loup.eat();
                    DashboardView.this.loup2.eat();
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.loup2.getName());
                } else if (animalName.equals("Tigre")) {
                    DashboardView.this.tigre.eat();
                    DashboardView.this.tigre2.eat();
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.tigre2.getName());
                } else if (animalName.equals("Ours")) {
                    DashboardView.this.ours.eat();
                    DashboardView.this.ours2.eat();
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.ours2.getName());
                } else if (animalName.equals("Baleine")) {
                    DashboardView.this.baleine.eat();
                    DashboardView.this.baleine2.eat();
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.baleine2.getName());
                } else if (animalName.equals("Poisson")) {
                    DashboardView.this.poisson.eat();
                    DashboardView.this.poisson2.eat();
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.poisson2.getName());
                } else if (animalName.equals("Requin")) {
                    DashboardView.this.requin.eat();
                    DashboardView.this.requin2.eat();
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.requin2.getName());
                } else if (animalName.equals("Aigle")) {
                    DashboardView.this.aigle.eat();
                    DashboardView.this.aigle2.eat();
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.aigle2.getName());
                } else if (animalName.equals("Pingouin")) {
                    DashboardView.this.pingouin.eat();
                    DashboardView.this.pingouin2.eat();
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez nourri " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                }

            }
        });
        this.setLocation(100, 100);
        return nourrirAnimal;
    }

    /**
     * Voler animal j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> volerAnimal() {
        final JComboBox<String> volerAnimal = new JComboBox();
        volerAnimal.addItem("Choisissez un type d'animal a faire voler");
        volerAnimal.addItem("Aigle");
        volerAnimal.addItem("Pingouin");
        volerAnimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) volerAnimal.getSelectedItem();
                String var10001;
                if (animalName.equals("Aigle")) {
                    DashboardView.this.aigle.fly();
                    DashboardView.this.aigle2.fly();
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait volé " + var10001 + " et " + DashboardView.this.aigle2.getName());
                } else if (animalName.equals("Pingouin")) {
                    DashboardView.this.pingouin.fly();
                    DashboardView.this.pingouin2.fly();
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait volé " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                }

            }
        });
        this.setLocation(100, 100);
        return volerAnimal;
    }

    /**
     * Nager animal j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> nagerAnimal() {
        final JComboBox<String> nagerAnimal = new JComboBox();
        nagerAnimal.addItem("Choisissez un type d'animal a faire nager");
        nagerAnimal.addItem("Baleine");
        nagerAnimal.addItem("Requin");
        nagerAnimal.addItem("Poisson");
        nagerAnimal.addItem("Ours");
        nagerAnimal.addItem("Pingouin");
        nagerAnimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) nagerAnimal.getSelectedItem();
                String var10001;
                if (animalName.equals("Baleine")) {
                    DashboardView.this.baleine.swim();
                    DashboardView.this.baleine2.swim();
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait nage " + var10001 + " et " + DashboardView.this.baleine2.getName());
                } else if (animalName.equals("Requin")) {
                    DashboardView.this.requin.swim();
                    DashboardView.this.requin2.swim();
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait nage " + var10001 + " et " + DashboardView.this.requin2.getName());
                } else if (animalName.equals("Poisson")) {
                    DashboardView.this.poisson.swim();
                    DashboardView.this.poisson2.swim();
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait nage " + var10001 + " et " + DashboardView.this.poisson2.getName());
                } else if (animalName.equals("Ours")) {
                    DashboardView.this.ours.swim();
                    DashboardView.this.ours2.swim();
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait nage " + var10001 + " et " + DashboardView.this.ours2.getName());
                } else if (animalName.equals("Pingouin")) {
                    DashboardView.this.pingouin.swim();
                    DashboardView.this.pingouin2.swim();
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait nage " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                }

            }
        });
        return nagerAnimal;
    }

    /**
     * Marcher animal j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> marcherAnimal() {
        final JComboBox<String> marcherAnimal = new JComboBox();
        marcherAnimal.addItem("Choisissez un type d'animal a faire marcher");
        marcherAnimal.addItem("Tigre");
        marcherAnimal.addItem("Ours");
        marcherAnimal.addItem("Loup");
        marcherAnimal.addItem("Pingouin");
        marcherAnimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) marcherAnimal.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    DashboardView.this.tigre.wander();
                    DashboardView.this.tigre2.wander();
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait marcher " + var10001 + " et " + DashboardView.this.tigre2.getName());
                } else if (animalName.equals("Ours")) {
                    DashboardView.this.ours.wander();
                    DashboardView.this.ours2.wander();
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait marcher " + var10001 + " et " + DashboardView.this.ours2.getName());
                } else if (animalName.equals("Loup")) {
                    DashboardView.this.loup.wander();
                    DashboardView.this.loup2.wander();
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait marcher " + var10001 + " et " + DashboardView.this.loup2.getName());
                } else if (animalName.equals("Pingouin")) {
                    DashboardView.this.pingouin.wander();
                    DashboardView.this.pingouin2.wander();
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait marcher " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                }

            }
        });
        return marcherAnimal;
    }

    /**
     * Connaitre animal j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> connaitreAnimal() {
        final JComboBox<String> connaitreAnimal = new JComboBox();
        connaitreAnimal.addItem("Choisissez un type d'animal a connaitre");
        connaitreAnimal.addItem("Tigre");
        connaitreAnimal.addItem("Ours");
        connaitreAnimal.addItem("Loup");
        connaitreAnimal.addItem("Pingouin");
        connaitreAnimal.addItem("Baleine");
        connaitreAnimal.addItem("Poisson");
        connaitreAnimal.addItem("Requin");
        connaitreAnimal.addItem("Aigle");
        connaitreAnimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) connaitreAnimal.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.tigre.getSex() + "\nPoids : " + DashboardView.this.tigre.getWeight() + "\nTaille : " + DashboardView.this.tigre.getSize());
                    var10001 = DashboardView.this.tigre2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.tigre2.getSex() + "\nPoids : " + DashboardView.this.tigre2.getWeight() + "\nTaille : " + DashboardView.this.tigre2.getSize());
                }

                if (animalName.equals("Ours")) {
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.ours.getSex() + "\nPoids : " + DashboardView.this.ours.getWeight() + "\nTaille : " + DashboardView.this.ours.getSize());
                    var10001 = DashboardView.this.ours2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.ours2.getSex() + "\nPoids : " + DashboardView.this.ours2.getWeight() + "\nTaille : " + DashboardView.this.ours2.getSize());
                }

                if (animalName.equals("Loup")) {
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.loup.getSex() + "\nPoids : " + DashboardView.this.loup.getWeight() + "\nTaille : " + DashboardView.this.loup.getSize());
                    var10001 = DashboardView.this.loup2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.loup2.getSex() + "\nPoids : " + DashboardView.this.loup2.getWeight() + "\nTaille : " + DashboardView.this.loup2.getSize());
                }

                if (animalName.equals("Pingouin")) {
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.pingouin.getSex() + "\nPoids : " + DashboardView.this.pingouin.getWeight() + "\nTaille : " + DashboardView.this.pingouin.getSize());
                    var10001 = DashboardView.this.pingouin2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.pingouin2.getSex() + "\nPoids : " + DashboardView.this.pingouin2.getWeight() + "\nTaille : " + DashboardView.this.pingouin2.getSize());
                }

                if (animalName.equals("Baleine")) {
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.baleine.getSex() + "\nPoids : " + DashboardView.this.baleine.getWeight() + "\nTaille : " + DashboardView.this.baleine.getSize());
                    var10001 = DashboardView.this.baleine2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.baleine2.getSex() + "\nPoids : " + DashboardView.this.baleine2.getWeight() + "\nTaille : " + DashboardView.this.baleine2.getSize());
                }

                if (animalName.equals("Poisson")) {
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.poisson.getSex() + "\nPoids : " + DashboardView.this.poisson.getWeight() + "\nTaille : " + DashboardView.this.poisson.getSize());
                    var10001 = DashboardView.this.poisson2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.poisson2.getSex() + "\nPoids : " + DashboardView.this.poisson2.getWeight() + "\nTaille : " + DashboardView.this.poisson2.getSize());
                }

                if (animalName.equals("Requin")) {
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.requin.getSex() + "\nPoids : " + DashboardView.this.requin.getWeight() + "\nTaille : " + DashboardView.this.requin.getSize());
                    var10001 = DashboardView.this.requin2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.requin2.getSex() + "\nPoids : " + DashboardView.this.requin2.getWeight() + "\nTaille : " + DashboardView.this.requin2.getSize());
                }

                if (animalName.equals("Aigle")) {
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.aigle.getSex() + "\nPoids : " + DashboardView.this.aigle.getWeight() + "\nTaille : " + DashboardView.this.aigle.getSize());
                    var10001 = DashboardView.this.aigle2.getName();
                    JOptionPane.showMessageDialog((Component) null, "Nom : " + var10001 + "\nSexe : " + DashboardView.this.aigle2.getSex() + "\nPoids : " + DashboardView.this.aigle2.getWeight() + "\nTaille : " + DashboardView.this.aigle2.getSize());
                }

            }
        });
        return connaitreAnimal;
    }

    /**
     * Emettre son j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> emettreSon() {
        final JComboBox<String> emettreSon = new JComboBox();
        emettreSon.addItem("Choisissez un type d'animal a connaitre");
        emettreSon.addItem("Tigre");
        emettreSon.addItem("Ours");
        emettreSon.addItem("Loup");
        emettreSon.addItem("Pingouin");
        emettreSon.addItem("Baleine");
        emettreSon.addItem("Poisson");
        emettreSon.addItem("Requin");
        emettreSon.addItem("Aigle");
        emettreSon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) emettreSon.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.tigre2.getName());
                    DashboardView.this.tigre.makeSound();
                    DashboardView.this.tigre2.makeSound();
                }

                if (animalName.equals("Ours")) {
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.ours2.getName());
                    DashboardView.this.ours.makeSound();
                    DashboardView.this.ours2.makeSound();
                }

                if (animalName.equals("Loup")) {
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.loup2.getName());
                    DashboardView.this.loup.makeSound();
                    DashboardView.this.loup2.makeSound();
                }

                if (animalName.equals("Pingouin")) {
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                    DashboardView.this.pingouin.makeSound();
                    DashboardView.this.pingouin2.makeSound();
                }

                if (animalName.equals("Baleine")) {
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.baleine2.getName());
                    DashboardView.this.baleine.makeSound();
                    DashboardView.this.baleine2.makeSound();
                }

                if (animalName.equals("Poisson")) {
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.poisson2.getName());
                    DashboardView.this.poisson.makeSound();
                    DashboardView.this.poisson2.makeSound();
                }

                if (animalName.equals("Requin")) {
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.requin2.getName());
                    DashboardView.this.requin.makeSound();
                    DashboardView.this.requin2.makeSound();
                }

                if (animalName.equals("Aigle")) {
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait crier " + var10001 + " et " + DashboardView.this.aigle2.getName());
                    DashboardView.this.aigle.makeSound();
                    DashboardView.this.aigle2.makeSound();
                }

            }
        });
        return emettreSon;
    }

    /**
     * Dormir j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> dormir() {
        final JComboBox<String> dormir = new JComboBox();
        dormir.addItem("Choisissez un type d'animal a connaitre");
        dormir.addItem("Tigre");
        dormir.addItem("Ours");
        dormir.addItem("Loup");
        dormir.addItem("Pingouin");
        dormir.addItem("Baleine");
        dormir.addItem("Poisson");
        dormir.addItem("Requin");
        dormir.addItem("Aigle");
        dormir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) dormir.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.tigre2.getName());
                    DashboardView.this.tigre.sleep();
                    DashboardView.this.tigre2.sleep();
                }

                if (animalName.equals("Ours")) {
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.ours2.getName());
                    DashboardView.this.ours.sleep();
                    DashboardView.this.ours2.sleep();
                }

                if (animalName.equals("Loup")) {
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.loup2.getName());
                    DashboardView.this.loup.sleep();
                    DashboardView.this.loup2.sleep();
                }

                if (animalName.equals("Pingouin")) {
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                    DashboardView.this.pingouin.sleep();
                    DashboardView.this.pingouin2.sleep();
                }

                if (animalName.equals("Baleine")) {
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.baleine2.getName());
                    DashboardView.this.baleine.sleep();
                    DashboardView.this.baleine2.sleep();
                }

                if (animalName.equals("Poisson")) {
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.poisson2.getName());
                    DashboardView.this.poisson.sleep();
                    DashboardView.this.poisson2.sleep();
                }

                if (animalName.equals("Requin")) {
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.requin2.getName());
                    DashboardView.this.requin.sleep();
                    DashboardView.this.requin2.sleep();
                }

                if (animalName.equals("Aigle")) {
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez fait dormir " + var10001 + " et " + DashboardView.this.aigle2.getName());
                    DashboardView.this.aigle.sleep();
                    DashboardView.this.aigle2.sleep();
                }

            }
        });
        return dormir;
    }

    /**
     * Reveiller j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> reveiller() {
        final JComboBox<String> reveiller = new JComboBox();
        reveiller.addItem("Choisissez un type d'animal a connaitre");
        reveiller.addItem("Tigre");
        reveiller.addItem("Ours");
        reveiller.addItem("Loup");
        reveiller.addItem("Pingouin");
        reveiller.addItem("Baleine");
        reveiller.addItem("Poisson");
        reveiller.addItem("Requin");
        reveiller.addItem("Aigle");
        reveiller.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) reveiller.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.tigre2.getName());
                    DashboardView.this.tigre.wakeUp();
                    DashboardView.this.tigre2.wakeUp();
                }

                if (animalName.equals("Ours")) {
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.ours2.getName());
                    DashboardView.this.ours.wakeUp();
                    DashboardView.this.ours2.wakeUp();
                }

                if (animalName.equals("Loup")) {
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.loup2.getName());
                    DashboardView.this.loup.wakeUp();
                    DashboardView.this.loup2.wakeUp();
                }

                if (animalName.equals("Pingouin")) {
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                    DashboardView.this.pingouin.wakeUp();
                    DashboardView.this.pingouin2.wakeUp();
                }

                if (animalName.equals("Baleine")) {
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.baleine2.getName());
                    DashboardView.this.baleine.wakeUp();
                    DashboardView.this.baleine2.wakeUp();
                }

                if (animalName.equals("Poisson")) {
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.poisson2.getName());
                    DashboardView.this.poisson.wakeUp();
                    DashboardView.this.poisson2.wakeUp();
                }

                if (animalName.equals("Requin")) {
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller" + var10001 + " et " + DashboardView.this.requin2.getName());
                    DashboardView.this.requin.wakeUp();
                    DashboardView.this.requin2.wakeUp();
                }

                if (animalName.equals("Aigle")) {
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez réveiller " + var10001 + " et " + DashboardView.this.aigle2.getName());
                    DashboardView.this.aigle.wakeUp();
                    DashboardView.this.aigle2.wakeUp();
                }

            }
        });
        return reveiller;
    }

    /**
     * Soigner all animaux j button.
     *
     * @return the j button
     */
    public JButton soignerAllAnimaux() {
        JButton button = new JButton("Soigner");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Animal[] animals = new Animal[]{DashboardView.this.loup, DashboardView.this.tigre, DashboardView.this.ours, DashboardView.this.baleine, DashboardView.this.poisson, DashboardView.this.requin, DashboardView.this.aigle, DashboardView.this.pingouin};
                Animal[] var3 = animals;
                int var4 = animals.length;

                for (int var5 = 0; var5 < var4; ++var5) {
                    Animal animal = var3[var5];
                    String animalName = animal.getName();
                    if (animal.getName().equals(animalName)) {
                        JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + animal.getName());
                        animal.beCared();
                    } else {
                        JOptionPane.showMessageDialog((Component) null, "Veuillez choisir un animal");
                    }
                }

            }
        });
        this.setLocation(200, 500);
        return button;
    }

    /**
     * Soigner j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> soigner() {
        final JComboBox<String> soigner = new JComboBox();
        soigner.addItem("Choisissez un type d'animal a connaitre");
        soigner.addItem("Tigre");
        soigner.addItem("Ours");
        soigner.addItem("Loup");
        soigner.addItem("Pingouin");
        soigner.addItem("Baleine");
        soigner.addItem("Poisson");
        soigner.addItem("Requin");
        soigner.addItem("Aigle");
        soigner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) soigner.getSelectedItem();
                String var10001;
                if (animalName.equals("Tigre")) {
                    var10001 = DashboardView.this.tigre.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné  " + var10001 + " et " + DashboardView.this.tigre2.getName());
                    DashboardView.this.tigre.beCared();
                    DashboardView.this.tigre2.beCared();
                }

                if (animalName.equals("Ours")) {
                    var10001 = DashboardView.this.ours.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.ours2.getName());
                    DashboardView.this.ours.beCared();
                    DashboardView.this.ours2.beCared();
                }

                if (animalName.equals("Loup")) {
                    var10001 = DashboardView.this.loup.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.loup2.getName());
                    DashboardView.this.loup.beCared();
                    DashboardView.this.loup2.beCared();
                }

                if (animalName.equals("Pingouin")) {
                    var10001 = DashboardView.this.pingouin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.pingouin2.getName());
                    DashboardView.this.pingouin.beCared();
                    DashboardView.this.pingouin2.beCared();
                }

                if (animalName.equals("Baleine")) {
                    var10001 = DashboardView.this.baleine.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.baleine2.getName());
                    DashboardView.this.baleine.beCared();
                    DashboardView.this.baleine2.beCared();
                }

                if (animalName.equals("Poisson")) {
                    var10001 = DashboardView.this.poisson.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.poisson2.getName());
                    DashboardView.this.poisson.beCared();
                    DashboardView.this.poisson2.beCared();
                }

                if (animalName.equals("Requin")) {
                    var10001 = DashboardView.this.requin.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.requin2.getName());
                    DashboardView.this.requin.beCared();
                    DashboardView.this.requin2.beCared();
                }

                if (animalName.equals("Aigle")) {
                    var10001 = DashboardView.this.aigle.getName();
                    JOptionPane.showMessageDialog((Component) null, "Vous avez soigné " + var10001 + " et " + DashboardView.this.aigle2.getName());
                    DashboardView.this.aigle.beCared();
                    DashboardView.this.aigle2.beCared();
                }

            }
        });
        return soigner;
    }

    /**
     * Mettre bas j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> mettreBas() {
        final JComboBox<String> listeDeroulanteAnimauxFemelle = new JComboBox();
        listeDeroulanteAnimauxFemelle.addItem(this.loup2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.tigre2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.ours2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.baleine2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.requin2.getName());
        listeDeroulanteAnimauxFemelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) listeDeroulanteAnimauxFemelle.getSelectedItem();
                if (animalName.equals(DashboardView.this.loup2.getName()) && DashboardView.this.loup2.getSex().equals("Femelle") && DashboardView.this.loup2.getDurationGestation() == 0) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.loup2.getName() + " a mis bas");
                    DashboardView.this.loup2.giveBirth();
                }

                if (animalName.equals(DashboardView.this.tigre2.getName()) && DashboardView.this.tigre2.getDurationGestation() == 0 && DashboardView.this.tigre2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.tigre2.getName() + " a mis bas");
                    DashboardView.this.tigre2.giveBirth();
                }

                if (animalName.equals(DashboardView.this.ours2.getName()) && DashboardView.this.ours2.getDurationGestation() == 0 && DashboardView.this.ours2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.ours2.getName() + " a mis bas");
                    DashboardView.this.ours2.giveBirth();
                }

                if (animalName.equals(DashboardView.this.baleine2.getName()) && DashboardView.this.baleine2.getDurationGestation() == 0 && DashboardView.this.baleine2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.baleine2.getName() + " a mis bas");
                    DashboardView.this.baleine2.giveBirth();
                }

                if (animalName.equals(DashboardView.this.requin2.getName()) && DashboardView.this.requin2.getDurationGestation() == 0 && DashboardView.this.requin2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.requin2.getName() + " a mis bas");
                    DashboardView.this.requin2.giveBirth();
                }

            }
        });
        this.setLocation(200, 700);
        return listeDeroulanteAnimauxFemelle;
    }

    /**
     * Pondre un oeuf j combo box.
     *
     * @return the j combo box
     */
    public JComboBox<String> pondreUnOeuf() {
        final JComboBox<String> listeDeroulanteAnimauxFemelle = new JComboBox();
        listeDeroulanteAnimauxFemelle.addItem(this.aigle2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.poisson2.getName());
        listeDeroulanteAnimauxFemelle.addItem(this.pingouin2.getName());
        listeDeroulanteAnimauxFemelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String animalName = (String) listeDeroulanteAnimauxFemelle.getSelectedItem();
                if (animalName.equals(DashboardView.this.aigle2.getName()) && DashboardView.this.aigle2.getIncubationTime() == 0 && DashboardView.this.aigle2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.aigle2.getName() + " a pondu un oeuf");
                    DashboardView.this.aigle2.layEggs();
                }

                if (animalName.equals(DashboardView.this.poisson2.getName()) && DashboardView.this.poisson2.getIncubationTime() == 0 && DashboardView.this.poisson2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.poisson2.getName() + " a pondu des oeufs");
                    DashboardView.this.poisson2.layEggs();
                }

                if (animalName.equals(DashboardView.this.pingouin2.getName()) && DashboardView.this.pingouin2.getIncubationTime() == 0 && DashboardView.this.pingouin2.getSex().equals("Femelle")) {
                    JOptionPane.showMessageDialog((Component) null, DashboardView.this.pingouin2.getName() + " a pondu un oeuf");
                    DashboardView.this.pingouin2.layEggs();
                }

            }
        });
        this.setLocation(200, 700);
        return listeDeroulanteAnimauxFemelle;
    }

    /**
     * Gets enclos list.
     *
     * @return the enclos list
     */
    public JComboBox<String> getEnclosList() {
        JComboBox<String> enclosList = new JComboBox();
        enclosList.addItem("Enclos de loups");
        enclosList.addItem("Enclos de tigres");
        enclosList.addItem("Enclos d'ours");
        enclosList.addItem("Enclos de baleines");
        enclosList.addItem("Enclos de poissons rouges");
        enclosList.addItem("Enclos de requins");
        enclosList.addItem("Enclos d'aigles");
        enclosList.addItem("Enclos de pingouins");
        enclosList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> enclosList = (JComboBox) e.getSource();
                String selectedEnclos = (String) enclosList.getSelectedItem();
                int var10001;
                String var4;
                if (selectedEnclos.equals("Enclos de loups")) {
                    DashboardView.this.enclosLoup.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosLoup);
                    var10001 = DashboardView.this.enclosLoup.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosLoup.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosLoup.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosLoup.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosLoup.getCleanlinessDegree() + "/10\n");
                    if (DashboardView.this.enclosLoup.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosLoup.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc3a Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosLoup.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos de tigres")) {
                    DashboardView.this.enclosTigre.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosTigre);
                    var10001 = DashboardView.this.enclosTigre.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosTigre.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosTigre.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosTigre.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosTigre.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosTigre.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosTigre.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc2f Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosTigre.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos d'ours")) {
                    DashboardView.this.enclosOurs.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosOurs);
                    var10001 = DashboardView.this.enclosOurs.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosOurs.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosOurs.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosOurs.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosOurs.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosOurs.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosOurs.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc3b Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosOurs.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos de baleines")) {
                    DashboardView.this.enclosBaleine.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosBaleine);
                    var10001 = DashboardView.this.enclosBaleine.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosBaleine.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosBaleine.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosBaleine.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosBaleine.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosBaleine.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosBaleine.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc2c Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosBaleine.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos de poissons rouges")) {
                    DashboardView.this.enclosPoissonRouge.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosPoissonRouge);
                    var10001 = DashboardView.this.enclosPoissonRouge.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosPoissonRouge.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosPoissonRouge.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosPoissonRouge.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosPoissonRouge.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosPoissonRouge.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosPoissonRouge.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc1f Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosPoissonRouge.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos de requins")) {
                    DashboardView.this.enclosRequin.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosRequin);
                    var10001 = DashboardView.this.enclosRequin.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosRequin.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosRequin.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosRequin.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosRequin.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosRequin.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosRequin.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83d\udc22 Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosRequin.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos d'aigles")) {
                    DashboardView.this.enclosAigle.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosAigle);
                    var10001 = DashboardView.this.enclosAigle.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosAigle.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosAigle.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosAigle.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosAigle.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosAigle.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosAigle.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83e\udd96 Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosAigle.getAnimals().get(1)).getName());
                    }
                } else if (selectedEnclos.equals("Enclos de pingouins")) {
                    DashboardView.this.enclosPinguin.displayEnclosureAndAnimalsCharacteristics(DashboardView.this.enclosPinguin);
                    var10001 = DashboardView.this.enclosPinguin.getArea();
                    JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosPinguin.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosPinguin.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosPinguin.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosPinguin.getCleanlinessDegree() + "/10");
                    if (DashboardView.this.enclosPinguin.getAnimals() != null) {
                        var4 = ((Animal) DashboardView.this.enclosPinguin.getAnimals().get(0)).getName();
                        JOptionPane.showMessageDialog((Component) null, "\ud83e\udd8b Liste des animaux présents dans l'enclos : " + var4 + " , " + ((Animal) DashboardView.this.enclosPinguin.getAnimals().get(1)).getName());
                    }
                }

            }
        });
        return enclosList;
    }

    /**
     * Clean enclos.
     *
     * @param enclos the enclos
     */
    public void cleanEnclos(Enclosure enclos) {
        enclos.setCleanlinessDegree((byte) (enclos.getCleanlinessDegree() + 1));
        enclos.cleaning(enclos);
    }

    /**
     * Gets enclos list for clean.
     *
     * @return the enclos list for clean
     */
    public JComboBox<String> getEnclosListForClean() {
        new JLabel("Sélectionner un enclos :");
        JComboBox<String> enclosList = new JComboBox();
        enclosList.addItem("Enclos de loups");
        enclosList.addItem("Enclos de tigres");
        enclosList.addItem("Enclos d'ours");
        enclosList.addItem("Enclos de baleines");
        enclosList.addItem("Enclos de poissons");
        enclosList.addItem("Enclos de requins");
        enclosList.addItem("Enclos d'aigles");
        enclosList.addItem("Enclos de pingouins");
        enclosList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> enclosList = (JComboBox) e.getSource();
                String selectedEnclos = (String) enclosList.getSelectedItem();
                if (selectedEnclos.equals("Enclos de loups") && DashboardView.this.enclosLoup.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosLoup);
                    JOptionPane.showMessageDialog((Component) null, "\ud83d\udc3a L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos de tigres") && DashboardView.this.enclosTigre.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosTigre);
                    JOptionPane.showMessageDialog((Component) null, "\ud83d\udc2f L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos d'ours") && DashboardView.this.enclosOurs.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosOurs);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos de baleines") && DashboardView.this.enclosBaleine.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosBaleine);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos de poissons ") && DashboardView.this.enclosPoissonRouge.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosPoissonRouge);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos de requins") && DashboardView.this.enclosRequin.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosRequin);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos d'aigles") && DashboardView.this.enclosAigle.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosAigle);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else if (selectedEnclos.equals("Enclos de pingouins") && DashboardView.this.enclosPinguin.getAnimals().isEmpty()) {
                    DashboardView.this.cleanEnclos(DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, " L'enclos " + selectedEnclos + " est nettoyé");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "Il y a des animaux dans cet enclos avant de pouvoir le nettoyer ");
                }

            }
        });
        return enclosList;
    }

    /**
     * Gets enclos list for feed.
     *
     * @return the enclos list for feed
     */
    public JComboBox<String> getEnclosListForFeed() {
        new JLabel("Sélectionner un enclos :");
        JComboBox<String> enclosList = new JComboBox();
        enclosList.addItem("Enclos de loups");
        enclosList.addItem("Enclos de tigres");
        enclosList.addItem("Enclos d'ours");
        enclosList.addItem("Enclos de baleines");
        enclosList.addItem("Enclos de poissons rouges");
        enclosList.addItem("Enclos de requins");
        enclosList.addItem("Enclos d'aigles");
        enclosList.addItem("Enclos de pingouins");
        enclosList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> enclosList = (JComboBox) e.getSource();
                JOptionPane jop = new JOptionPane();
                String selectedEnclos = (String) enclosList.getSelectedItem();
                if (selectedEnclos.equals("Enclos de loups") && !DashboardView.this.enclosLoup.getAnimals().isEmpty()) {
                    DashboardView.this.enclosLoup.feedAnimals(DashboardView.this.enclosLoup);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos de tigres") && !DashboardView.this.enclosTigre.getAnimals().isEmpty()) {
                    DashboardView.this.enclosTigre.feedAnimals(DashboardView.this.enclosTigre);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos d'ours") && !DashboardView.this.enclosOurs.getAnimals().isEmpty()) {
                    DashboardView.this.enclosOurs.feedAnimals(DashboardView.this.enclosOurs);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos de baleines") && !DashboardView.this.enclosBaleine.getAnimals().isEmpty()) {
                    DashboardView.this.enclosBaleine.feedAnimals(DashboardView.this.enclosBaleine);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos de poissons rouges") && !DashboardView.this.enclosPoissonRouge.getAnimals().isEmpty()) {
                    DashboardView.this.enclosPoissonRouge.feedAnimals(DashboardView.this.enclosPoissonRouge);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos de requins") && !DashboardView.this.enclosRequin.getAnimals().isEmpty()) {
                    DashboardView.this.enclosRequin.feedAnimals(DashboardView.this.enclosRequin);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos d'aigles") && !DashboardView.this.enclosAigle.getAnimals().isEmpty()) {
                    DashboardView.this.enclosAigle.feedAnimals(DashboardView.this.enclosAigle);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else if (selectedEnclos.equals("Enclos de pingouins") && !DashboardView.this.enclosPinguin.getAnimals().isEmpty()) {
                    DashboardView.this.enclosPinguin.feedAnimals(DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, "Les animaux ont été nourris");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "Il n'y a pas d'animaux dans cet enclos pour pouvoir les nourrir");
                }

            }
        });
        return enclosList;
    }

    /**
     * Gets add loup button.
     *
     * @return the add loup button
     */
    public JButton getAddLoupButton() {
        JButton addLoupButton = new JButton("Ajouter les loups dans leur enclos");
        addLoupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosLoup.addAnimal(DashboardView.this.loup, DashboardView.this.enclosLoup);
                DashboardView.this.enclosLoup.addAnimal(DashboardView.this.loup2, DashboardView.this.enclosLoup);
                JOptionPane.showMessageDialog((Component) null, "Les loups ont été ajoutés dans leur enclos");
            }
        });
        return addLoupButton;
    }

    /**
     * Gets add ours button.
     *
     * @return the add ours button
     */
    public JButton getAddOursButton() {
        JButton addOursButton = new JButton("Ajouter les ours dans leur enclos");
        addOursButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosOurs.addAnimal(DashboardView.this.ours, DashboardView.this.enclosOurs);
                DashboardView.this.enclosOurs.addAnimal(DashboardView.this.ours2, DashboardView.this.enclosOurs);
                JOptionPane.showMessageDialog((Component) null, "Les ours ont été ajoutés dans leur enclos");
            }
        });
        return addOursButton;
    }

    /**
     * Gets add tigre button.
     *
     * @return the add tigre button
     */
    public JButton getAddTigreButton() {
        JButton addTigreButton = new JButton("Ajouter les tigres dans leur enclos");
        addTigreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosTigre.addAnimal(DashboardView.this.tigre, DashboardView.this.enclosTigre);
                DashboardView.this.enclosTigre.addAnimal(DashboardView.this.tigre2, DashboardView.this.enclosTigre);
                JOptionPane.showMessageDialog((Component) null, "Les tigres ont été ajoutés dans leur enclos");
            }
        });
        return addTigreButton;
    }

    /**
     * Gets add baleine button.
     *
     * @return the add baleine button
     */
    public JButton getAddBaleineButton() {
        JButton addBaleineButton = new JButton("Ajouter les baleines dans leur enclos");
        addBaleineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosBaleine.addAnimal(DashboardView.this.baleine, DashboardView.this.enclosBaleine);
                DashboardView.this.enclosBaleine.addAnimal(DashboardView.this.baleine2, DashboardView.this.enclosBaleine);
                JOptionPane.showMessageDialog((Component) null, "Les baleines ont été ajoutés dans leur enclos");
            }
        });
        return addBaleineButton;
    }

    /**
     * Gets add requin button.
     *
     * @return the add requin button
     */
    public JButton getAddRequinButton() {
        JButton addRequinButton = new JButton("Ajouter les requins dans leur enclos");
        addRequinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosRequin.addAnimal(DashboardView.this.requin, DashboardView.this.enclosRequin);
                DashboardView.this.enclosRequin.addAnimal(DashboardView.this.requin2, DashboardView.this.enclosRequin);
                JOptionPane.showMessageDialog((Component) null, "Les requins ont été ajoutés dans leur enclos");
            }
        });
        return addRequinButton;
    }

    /**
     * Gets add poisson button.
     *
     * @return the add poisson button
     */
    public JButton getAddPoissonButton() {
        JButton addPoissonButton = new JButton("Ajouter les poissons dans leur enclos");
        addPoissonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosPoissonRouge.addAnimal(DashboardView.this.poisson, DashboardView.this.enclosPoissonRouge);
                DashboardView.this.enclosPoissonRouge.addAnimal(DashboardView.this.poisson2, DashboardView.this.enclosPoissonRouge);
                JOptionPane.showMessageDialog((Component) null, "Les poissons ont été ajoutés dans leur enclos");
            }
        });
        return addPoissonButton;
    }

    /**
     * Gets add aigle button.
     *
     * @return the add aigle button
     */
    public JButton getAddAigleButton() {
        JButton addAigleButton = new JButton("Ajouter les aigles dans leur enclos");
        addAigleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosAigle.addAnimal(DashboardView.this.aigle, DashboardView.this.enclosAigle);
                DashboardView.this.enclosAigle.addAnimal(DashboardView.this.aigle2, DashboardView.this.enclosAigle);
                JOptionPane.showMessageDialog((Component) null, "Les aigles ont été ajoutés dans leur enclos");
            }
        });
        return addAigleButton;
    }

    /**
     * Gets add pinguin button.
     *
     * @return the add pinguin button
     */
    public JButton getAddPinguinButton() {
        JButton addPinguinButton = new JButton("Ajouter les pinguins dans leur enclos");
        addPinguinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosPinguin.addAnimal(DashboardView.this.pingouin, DashboardView.this.enclosPinguin);
                DashboardView.this.enclosPinguin.addAnimal(DashboardView.this.pingouin2, DashboardView.this.enclosPinguin);
                JOptionPane.showMessageDialog((Component) null, "Les pinguins ont été ajoutés dans leur enclos");
            }
        });
        return addPinguinButton;
    }

    /**
     * Gets remove loup button.
     *
     * @return the remove loup button
     */
    public JButton getRemoveLoupButton() {
        JButton removeLoupButton = new JButton("Enlever les loups de leur enclos");
        removeLoupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosLoup.removeAnimal(DashboardView.this.loup, DashboardView.this.enclosLoup);
                DashboardView.this.enclosLoup.removeAnimal(DashboardView.this.loup2, DashboardView.this.enclosLoup);
                JOptionPane.showMessageDialog((Component) null, "Les loups ont été enlevés de leur enclos");
            }
        });
        return removeLoupButton;
    }

    /**
     * Gets remove requin button.
     *
     * @return the remove requin button
     */
    public JButton getRemoveRequinButton() {
        JButton removeRequinButton = new JButton("Enlever les requins de leur enclos");
        removeRequinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosRequin.removeAnimal(DashboardView.this.requin, DashboardView.this.enclosRequin);
                DashboardView.this.enclosRequin.removeAnimal(DashboardView.this.requin2, DashboardView.this.enclosRequin);
                JOptionPane.showMessageDialog((Component) null, "Les requins ont été enlevés de leur enclos");
            }
        });
        return removeRequinButton;
    }

    /**
     * Gets remove poisson button.
     *
     * @return the remove poisson button
     */
    public JButton getRemovePoissonButton() {
        JButton removePoissonButton = new JButton("Enlever les poissons de leur enclos");
        removePoissonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosPoissonRouge.removeAnimal(DashboardView.this.poisson, DashboardView.this.enclosPoissonRouge);
                DashboardView.this.enclosPoissonRouge.removeAnimal(DashboardView.this.poisson2, DashboardView.this.enclosPoissonRouge);
                JOptionPane.showMessageDialog((Component) null, "Les poissons ont été enlevés de leur enclos");
            }
        });
        return removePoissonButton;
    }

    /**
     * Gets remove aigle button.
     *
     * @return the remove aigle button
     */
    public JButton getRemoveAigleButton() {
        JButton removeAigleButton = new JButton("Enlever les aigles de leur enclos");
        removeAigleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosAigle.removeAnimal(DashboardView.this.aigle, DashboardView.this.enclosAigle);
                DashboardView.this.enclosAigle.removeAnimal(DashboardView.this.aigle2, DashboardView.this.enclosAigle);
                JOptionPane.showMessageDialog((Component) null, "Les aigles ont été enlevés de leur enclos");
            }
        });
        return removeAigleButton;
    }

    /**
     * Gets remove pinguin button.
     *
     * @return the remove pinguin button
     */
    public JButton getRemovePinguinButton() {
        JButton removePinguinButton = new JButton("Enlever les pinguins de leur enclos");
        removePinguinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosPinguin.removeAnimal(DashboardView.this.pingouin, DashboardView.this.enclosPinguin);
                DashboardView.this.enclosPinguin.removeAnimal(DashboardView.this.pingouin2, DashboardView.this.enclosPinguin);
                JOptionPane.showMessageDialog((Component) null, "Les pinguins ont été enlevés de leur enclos");
            }
        });
        return removePinguinButton;
    }

    /**
     * Gets remove tigre button.
     *
     * @return the remove tigre button
     */
    public JButton getRemoveTigreButton() {
        JButton removeTigreButton = new JButton("Enlever les tigres de leur enclos");
        removeTigreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosTigre.removeAnimal(DashboardView.this.tigre, DashboardView.this.enclosTigre);
                DashboardView.this.enclosTigre.removeAnimal(DashboardView.this.tigre2, DashboardView.this.enclosTigre);
                JOptionPane.showMessageDialog((Component) null, "Les tigres ont été enlevés de leur enclos");
            }
        });
        return removeTigreButton;
    }

    /**
     * Gets remove ours button.
     *
     * @return the remove ours button
     */
    public JButton getRemoveOursButton() {
        JButton removeOursButton = new JButton("Enlever les ours de leur enclos");
        removeOursButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosOurs.removeAnimal(DashboardView.this.ours, DashboardView.this.enclosOurs);
                DashboardView.this.enclosOurs.removeAnimal(DashboardView.this.ours2, DashboardView.this.enclosOurs);
                JOptionPane.showMessageDialog((Component) null, "Les ours ont été enlevés de leur enclos");
            }
        });
        return removeOursButton;
    }

    /**
     * Gets remove baleine button.
     *
     * @return the remove baleine button
     */
    public JButton getRemoveBaleineButton() {
        JButton removeBaleineButton = new JButton("Enlever les baleines de leur enclos");
        removeBaleineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosBaleine.removeAnimal(DashboardView.this.baleine, DashboardView.this.enclosBaleine);
                DashboardView.this.enclosBaleine.removeAnimal(DashboardView.this.baleine2, DashboardView.this.enclosBaleine);
                JOptionPane.showMessageDialog((Component) null, "Les baleines ont été enlevés de leur enclos");
            }
        });
        return removeBaleineButton;
    }

    /**
     * Gets examine enclosure button.
     *
     * @return the examine enclosure button
     */
    public JButton getExamineEnclosureButton() {
        JButton examineEnclosureButton = new JButton("Examiner l'enclos");
        examineEnclosureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosLoup);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de loups est il contient " + DashboardView.this.enclosLoup.getAnimals().size() + " animaux");
                int var10001 = DashboardView.this.enclosLoup.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3e Nombre d'animaux présents : " + DashboardView.this.enclosLoup.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosLoup.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosLoup.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosLoup.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosRequin);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de requins est il contient " + DashboardView.this.enclosRequin.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosRequin.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc1f Nombre d'animaux présents : " + DashboardView.this.enclosRequin.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosRequin.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosRequin.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosRequin.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosPoissonRouge);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de poissons rouges est il contient " + DashboardView.this.enclosPoissonRouge.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosPoissonRouge.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc20 Nombre d'animaux présents : " + DashboardView.this.enclosPoissonRouge.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosPoissonRouge.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosPoissonRouge.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosPoissonRouge.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosAigle);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos d'aigles est il contient " + DashboardView.this.enclosAigle.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosAigle.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc26 Nombre d'animaux présents : " + DashboardView.this.enclosAigle.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosAigle.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosAigle.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosAigle.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosPinguin);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de pinguins est il contient " + DashboardView.this.enclosPinguin.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosPinguin.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc27 Nombre d'animaux présents : " + DashboardView.this.enclosPinguin.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosPinguin.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosPinguin.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosPinguin.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosTigre);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de tigres est il contient " + DashboardView.this.enclosTigre.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosTigre.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc2f Nombre d'animaux présents : " + DashboardView.this.enclosTigre.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosTigre.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosTigre.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosTigre.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosOurs);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos d'ours est il contient " + DashboardView.this.enclosOurs.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosOurs.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc3a Nombre d'animaux présents : " + DashboardView.this.enclosOurs.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosOurs.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosOurs.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosOurs.getCleanlinessDegree() + "/10");
                DashboardView.this.employee.examineEnclosure(DashboardView.this.enclosBaleine);
                JOptionPane.showMessageDialog((Component) null, "L'employé examine l'enclos de baleines est il contient " + DashboardView.this.enclosBaleine.getAnimals().size() + " animaux");
                var10001 = DashboardView.this.enclosBaleine.getArea();
                JOptionPane.showMessageDialog((Component) null, " la surface de l'enclos est :" + var10001 + " m²\n- \ud83d\udc0b Nombre d'animaux présents : " + DashboardView.this.enclosBaleine.getNbAnimalsPresent() + "\n- \ud83d\udc49 Nombre d'animaux maximum : " + DashboardView.this.enclosBaleine.getMaxNbAnimals() + "\n- \ud83d\udc49 Type d'animaux de l'enclos : " + DashboardView.this.enclosBaleine.getTypeAnimal() + "\n- ✨ Niveau de propreté : " + DashboardView.this.enclosBaleine.getCleanlinessDegree() + "/10");
            }
        });
        return examineEnclosureButton;
    }

    private JButton createCleanEnclosureButton() {
        JButton cleanEnclosureButton = new JButton("Nettoyer l'enclos");
        cleanEnclosureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosPoissonRouge);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de poissons rouges est il contient " + DashboardView.this.enclosPoissonRouge.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosAigle);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos d'aigles est il contient " + DashboardView.this.enclosAigle.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosPinguin);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de pinguins est il contient " + DashboardView.this.enclosPinguin.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosTigre);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de tigres est il contient " + DashboardView.this.enclosTigre.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosOurs);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos d'ours est il contient " + DashboardView.this.enclosOurs.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosBaleine);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de baleines est il contient " + DashboardView.this.enclosBaleine.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosRequin);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de requins est il contient " + DashboardView.this.enclosRequin.getAnimals().size() + " animaux");
                DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosLoup);
                JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de loups est il contient " + DashboardView.this.enclosLoup.getAnimals().size() + " animaux");
            }
        });
        return cleanEnclosureButton;
    }

    /**
     * Gets eat enclos.
     *
     * @return the eat enclos
     */
    public JButton getEatEnclos() {
        JButton eatEnclosureButton = new JButton("Nourri  l'enclos");
        eatEnclosureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (DashboardView.this.enclosPinguin.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de pinguins est il contient " + DashboardView.this.enclosPinguin.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de pinguins est vide");
                }

                if (DashboardView.this.enclosTigre.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosTigre);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de tigres est il contient " + DashboardView.this.enclosTigre.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de tigres est vide");
                }

                if (DashboardView.this.enclosOurs.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosOurs);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos d'ours est il contient " + DashboardView.this.enclosOurs.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'ours est vide");
                }

                if (DashboardView.this.enclosBaleine.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosBaleine);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de baleines est il contient " + DashboardView.this.enclosBaleine.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de baleines est vide");
                }

                if (DashboardView.this.enclosRequin.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosRequin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de requins est il contient " + DashboardView.this.enclosRequin.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de requins est vide");
                }

                if (DashboardView.this.enclosLoup.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosLoup);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de loups est il contient " + DashboardView.this.enclosLoup.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de loups est vide");
                }

                if (DashboardView.this.enclosPoissonRouge.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosPoissonRouge);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos de poissons rouges est il contient " + DashboardView.this.enclosPoissonRouge.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de poissons rouges est vide");
                }

                if (DashboardView.this.enclosAigle.getAnimals().size() > 0) {
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosAigle);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nourri l'enclos d'aigles est il contient " + DashboardView.this.enclosAigle.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'aigles est vide");
                }

            }
        });
        return eatEnclosureButton;
    }

    /**
     * Gets transfer animal.
     *
     * @return the transfer animal
     */
    public JButton getTransferAnimal() {
        JButton transferAnimalButton = new JButton("Transferer un animal");
        transferAnimalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (DashboardView.this.enclosPinguin.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosPinguin.getAnimals().get(0), DashboardView.this.enclosPinguin, DashboardView.this.enclosTigre);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de pinguins à l'enclos de tigres est il contient " + DashboardView.this.enclosTigre.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de pinguins est vide");
                }

                if (DashboardView.this.enclosTigre.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosTigre.getAnimals().get(0), DashboardView.this.enclosTigre, DashboardView.this.enclosOurs);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de tigres à l'enclos d'ours est il contient " + DashboardView.this.enclosOurs.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de tigres est vide");
                }

                if (DashboardView.this.enclosOurs.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosOurs.getAnimals().get(0), DashboardView.this.enclosOurs, DashboardView.this.enclosBaleine);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos d'ours à l'enclos de baleines est il contient " + DashboardView.this.enclosBaleine.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'ours est vide");
                }

                if (DashboardView.this.enclosBaleine.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosBaleine.getAnimals().get(0), DashboardView.this.enclosBaleine, DashboardView.this.enclosRequin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de baleines à l'enclos de requins est il contient " + DashboardView.this.enclosRequin.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de baleines est vide");
                }

                if (DashboardView.this.enclosRequin.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosRequin.getAnimals().get(0), DashboardView.this.enclosRequin, DashboardView.this.enclosLoup);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de requins à l'enclos de loups est il contient " + DashboardView.this.enclosLoup.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de requins est vide");
                }

                if (DashboardView.this.enclosLoup.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosLoup.getAnimals().get(0), DashboardView.this.enclosLoup, DashboardView.this.enclosPoissonRouge);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de loups à l'enclos de poissons rouges est il contient " + DashboardView.this.enclosPoissonRouge.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de loups est vide");
                }

                if (DashboardView.this.enclosPoissonRouge.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosPoissonRouge.getAnimals().get(0), DashboardView.this.enclosPoissonRouge, DashboardView.this.enclosAigle);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos de poissons rouges à l'enclos d'aigles est il contient " + DashboardView.this.enclosAigle.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de poissons rouges est vide");
                }

                if (DashboardView.this.enclosAigle.getAnimals().size() > 0) {
                    DashboardView.this.employee.transferringAnimalFromEnclosureToAnother((Animal) DashboardView.this.enclosAigle.getAnimals().get(0), DashboardView.this.enclosAigle, DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé transfère un animal de l'enclos d'aigles à l'enclos de pinguins est il contient " + DashboardView.this.enclosPinguin.getAnimals().size() + " animaux");
                } else {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'aigles est vide");
                }

            }
        });
        return transferAnimalButton;
    }

    /**
     * Gets employee action.
     *
     * @return the employee action
     */
    public JButton getEmployeeAction() {
        JButton employeeActionButton = new JButton("Donne la main à l'employé");
        final int randomEnclosure = (int) (Math.random() * 8.0);
        employeeActionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (randomEnclosure == 0) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosPinguin);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de pinguins et nourrit les animaux");
                } else if (randomEnclosure == 1) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosTigre);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosTigre);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de tigres et nourrit les animaux");
                } else if (randomEnclosure == 2) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosOurs);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosOurs);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos d'ours et nourrit les animaux");
                } else if (randomEnclosure == 3) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosBaleine);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosBaleine);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de baleines et nourrit les animaux");
                } else if (randomEnclosure == 4) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosRequin);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosRequin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de requins et nourrit les animaux");
                } else if (randomEnclosure == 5) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosLoup);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosLoup);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de loups et nourrit les animaux");
                } else if (randomEnclosure == 6) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosPoissonRouge);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosPoissonRouge);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de poissons rouges et nourrit les animaux");
                } else if (randomEnclosure == 7) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosAigle);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosAigle);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos d'aigles et nourrit les animaux");
                } else if (randomEnclosure == 8) {
                    DashboardView.this.employee.cleanEnclosure(DashboardView.this.enclosPinguin);
                    DashboardView.this.employee.feedingAnimalsOfEnclosure(DashboardView.this.enclosPinguin);
                    JOptionPane.showMessageDialog((Component) null, "L'employé nettoie l'enclos de pinguins et nourrit les animaux");
                }

            }
        });
        return employeeActionButton;
    }

    /**
     * Gets randomize animal.
     *
     * @return the randomize animal
     */
    public JButton getRandomizeAnimal() {
        JButton randomizeAnimalButton = new JButton("Modifier les caractéristiques des animaux");
        randomizeAnimalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Iterator var2 = DashboardView.this.enclosPinguin.getAnimals().iterator();

                Animal animal;
                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosTigre.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosOurs.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosBaleine.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosRequin.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosLoup.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosPoissonRouge.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                var2 = DashboardView.this.enclosAigle.getAnimals().iterator();

                while (var2.hasNext()) {
                    animal = (Animal) var2.next();
                    animal.randomizeAnimal();
                }

                JOptionPane.showMessageDialog((Component) null, "Les caractéristiques des animaux ont été modifiées");
            }
        });
        return randomizeAnimalButton;
    }

    /**
     * Gets randomize enclosure.
     *
     * @return the randomize enclosure
     */
    public JButton getRandomizeEnclosure() {
        JButton randomizeEnclosureButton = new JButton("Modifier les caractéristiques des enclos");
        randomizeEnclosureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DashboardView.this.enclosPinguin.randomizeEnclosure();
                DashboardView.this.enclosTigre.randomizeEnclosure();
                DashboardView.this.enclosOurs.randomizeEnclosure();
                DashboardView.this.enclosBaleine.randomizeEnclosure();
                DashboardView.this.enclosRequin.randomizeEnclosure();
                DashboardView.this.enclosLoup.randomizeEnclosure();
                DashboardView.this.enclosPoissonRouge.randomizeEnclosure();
                DashboardView.this.enclosAigle.randomizeEnclosure();
                JOptionPane.showMessageDialog((Component) null, "Les caractéristiques des enclos ont été modifiées");
            }
        });
        return randomizeEnclosureButton;
    }

    /**
     * Gets show nb animals present.
     *
     * @return the show nb animals present
     */
    public JButton getShowNbAnimalsPresent() {
        JButton showNbAnimalsPresentButton = new JButton("Afficher le nombre d'animaux présents dans le zoo");
        showNbAnimalsPresentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String var10001 = DashboardView.this.pingouin.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.pingouin2.getName() + " animaux dans l'enclos de pinguins");
                var10001 = DashboardView.this.tigre.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.tigre2.getName() + " animaux dans l'enclos de tigres");
                var10001 = DashboardView.this.ours.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.ours2.getName() + " animaux dans l'enclos d'ours");
                var10001 = DashboardView.this.baleine.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.baleine2.getName() + " animaux dans l'enclos de baleines");
                var10001 = DashboardView.this.requin.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.requin2.getName() + " animaux dans l'enclos de requins");
                var10001 = DashboardView.this.loup.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.loup2.getName() + " animaux dans l'enclos de loups");
                var10001 = DashboardView.this.poisson.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.poisson2.getName() + " animaux dans l'enclos de poissons rouges");
                var10001 = DashboardView.this.aigle.getName();
                JOptionPane.showMessageDialog((Component) null, "Le zoo contient " + var10001 + DashboardView.this.aigle2.getName() + " animaux dans l'enclos d'aigles");
            }
        });
        return showNbAnimalsPresentButton;
    }

    /**
     * Gets show animals in all enclosures.
     *
     * @return the show animals in all enclosures
     */
    public JButton getShowAnimalsInAllEnclosures() {
        JButton showAnimalsInAllEnclosuresButton = new JButton("Afficher les animaux présents dans tous les enclos");
        showAnimalsInAllEnclosuresButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String var10001;
                if (DashboardView.this.enclosPinguin.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de pinguins est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosPinguin.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de pinguins contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosPinguin.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosTigre.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de tigres est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosTigre.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de tigres contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosTigre.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosOurs.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'ours est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosOurs.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'ours contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosOurs.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosBaleine.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de baleines est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosBaleine.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de baleines contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosBaleine.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosRequin.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de requins est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosRequin.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de requins contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosRequin.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosLoup.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de loups est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosLoup.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de loups contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosLoup.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosPoissonRouge.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de poissons rouges est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosPoissonRouge.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos de poissons rouges contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosPoissonRouge.getAnimals().get(1)).getName());
                }

                if (DashboardView.this.enclosAigle.getAnimals().size() == 0) {
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'aigles est vide");
                } else {
                    var10001 = ((Animal) DashboardView.this.enclosAigle.getAnimals().get(0)).getName();
                    JOptionPane.showMessageDialog((Component) null, "L'enclos d'aigles contient " + var10001 + " et " + ((Animal) DashboardView.this.enclosAigle.getAnimals().get(1)).getName());
                }

            }
        });
        return showAnimalsInAllEnclosuresButton;
    }

    /**
     * Start.
     */
    public void start() {
        this.setVisible(true);
    }
}
