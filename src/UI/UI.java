/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import businessLogic.*;
import data.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author camilowalteros
 */
public class UI extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private TextArea hintText;
    private JButton showTotal;
    private JButton showMissing;
    private JButton showGot;
    private JButton showRepeated;
    private JButton hints;
    private ArrayList <JSpinner> jSpinners2 = new ArrayList <JSpinner>();
    private ArrayList <JLabel> jLabels2 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts2 = new ArrayList <TextArea>();
    private ArrayList <JSpinner> jSpinners3 = new ArrayList <JSpinner>();
    private ArrayList <JLabel> jLabels3 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts3 = new ArrayList <TextArea>();
    private ArrayList <JSpinner> jSpinners4 = new ArrayList <JSpinner>();
    private ArrayList <JLabel> jLabels4 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts4 = new ArrayList <TextArea>();
    private ArrayList <JLabel> jLabels51 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts51 = new ArrayList <TextArea>();
    private ArrayList <JLabel> jLabels52 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts52 = new ArrayList <TextArea>();
    private ArrayList <JLabel> jLabels53 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts53 = new ArrayList <TextArea>();
    private ArrayList <JLabel> jLabels54 = new ArrayList <JLabel>();
    private ArrayList <TextArea> texts54 = new ArrayList <TextArea>();
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JScrollPane scroll2;
    private JScrollPane scroll3;
    private JScrollPane scroll4;
    private JScrollPane scroll5;
    private JScrollPane scroll6;
    private JPanel mainPanel;
    
    private int menuSelection;
    private boolean showedMissing;
    private boolean showedRepeated;
    private boolean showedGotten;
    private boolean showedAll;
    private boolean showedHints;
    
    public UI(ListsManager lm) {
        initComponents(lm);
        setVisible(true);
    }
    
    public int showMenu() {
        int response;
        this.setSize(400, 200);
        this.add(this.panel1);
        while(this.menuSelection == 0){
            this.pause();
        }
        this.remove(this.panel1);
        response = this.menuSelection;
        this.menuSelection = 0;
        return response;
    }
    
    public void showMissing(){
        this.setSize(650, 650);
        this.add(this.scroll2);
        while(!this.showedMissing){
            this.pause();
        }
        this.remove(this.scroll2);
        this.showedMissing = false;
    }
    
    public void showRepeated(){
        this.setSize(650, 650);
        this.add(this.scroll3);
        while(!this.showedRepeated){
            this.pause();
        }
        this.remove(this.scroll3);
        this.showedRepeated = false;
    }
    
    public void showGotten(){
        this.setSize(650, 650);
        this.add(this.scroll4);
        while(!this.showedGotten){
            this.pause();
        }
        this.remove(this.scroll4);
        this.showedGotten = false;
    }
    
    public void showAll(){
        this.setSize(570, 570);
        this.add(this.scroll5);
        while(!this.showedAll){
            this.pause();
        }
        this.remove(this.scroll5);
        this.showedAll = false;
    }
    
    public void showHints(){
        this.setSize(570, 570);
        this.add(this.scroll6);
        while(!this.showedHints){
            this.pause();
        }
        this.remove(this.scroll6);
        this.showedHints = false;
    }
    
    private void pause(){
        try{
            Thread.sleep(50);
        } catch (InterruptedException ex){
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createPanel1(){
        this.panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1));
        
        this.showMissing = new JButton("Show Missing");
        showMissing.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        this.showRepeated = new JButton("Show Repeated");
        showRepeated.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        this.showGot = new JButton("Show Gotten");
        showGot.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        this.showTotal = new JButton("Show All");
        showTotal.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        this.hints = new JButton("?");
        hints.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        showMissing.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                menuSelection = 1;
            }
        });
        
        showRepeated.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                menuSelection = 2;
            }
        });
        
        showGot.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                menuSelection = 3;
            }
        });
        
        showTotal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                menuSelection = 4;
            }
        });
        
        hints.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                menuSelection = 5;
            }
        });
        
        panel1.add(showMissing);
        panel1.add(showRepeated);
        panel1.add(showGot);
        panel1.add(showTotal);
        panel1.add(hints);
    } 
    
    public void createPanel2(ListsManager lm){
        this.panel2 = new JPanel();
        this.panel2.setLayout(new GridLayout(this.jSpinners2.size(), 3));
        
        this.scroll2 = new JScrollPane(this.panel2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JLabel title = new JLabel("MISSING ONES");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JLabel number = new JLabel(String.valueOf(lm.getMissing().size()));
        number.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JButton accept = new JButton("Accept");
        accept.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
        
        accept.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showedMissing = true;
                /*for(int i = 0; i < jSpinners2.size(); i++){
                    lm.getMissing().get(i).setCounter(Integer.parseInt(jSpinners2.get(i).getValue().toString()));
                }*/
                
            }
        });
        
        this.panel2.add(title);
        this.panel2.add(number);
        this.panel2.add(accept);
        
        for(Lamina l : lm.getMissing()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            this.jLabels2.add(jl);
            TextArea txt = new TextArea(l.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            this.texts2.add(txt);
            JSpinner js = new JSpinner(new SpinnerNumberModel(0,0,50,1));
            js.setFont(new Font("Eras Medium ITC", Font.PLAIN,30));
            this.jSpinners2.add(js);
        }
        
        for(int i = 0; i < this.jSpinners2.size(); i++){
            this.panel2.add(jLabels2.get(i));
            this.panel2.add(texts2.get(i));
            this.panel2.add(jSpinners2.get(i));
        }
    }
    
    public void createPanel3(ListsManager lm){
        this.panel3 = new JPanel();
        panel3.setLayout(new GridLayout(jSpinners3.size(), 3));
        
        JLabel title = new JLabel("REPEATED ONES");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JLabel number = new JLabel(String.valueOf(lm.getRepeated().size()));
        number.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JButton accept = new JButton("Accept");
        accept.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
        
        accept.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showedRepeated = true;
                /*for(int i = 0; i < jSpinners3.size(); i++){
                    lm.getRepeated().get(i).setCounter(Integer.parseInt(jSpinners3.get(i).getValue().toString()));
                }*/
            }
        });
        
        panel3.add(title);
        panel3.add(number);
        panel3.add(accept);
        
        for(Lamina l : lm.getRepeated()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels3.add(jl);
            TextArea txt = new TextArea(l.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts3.add(txt);
            JSpinner js = new JSpinner(new SpinnerNumberModel(0,0,50,1));
            js.setFont(new Font("Eras Medium ITC", Font.PLAIN,30));
            jSpinners3.add(js);
        }
        
        for(int i = 0; i < jSpinners3.size(); i++){
            panel2.add(jLabels3.get(i));
            panel2.add(texts3.get(i));
            panel2.add(jSpinners3.get(i));
        }
        
        this.scroll3 = new JScrollPane(panel3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }
    
    public void createPanel4(ListsManager lm){
        this.panel4 = new JPanel();
        panel4.setLayout(new GridLayout(jSpinners4.size(), 3));
        
        JLabel title = new JLabel("GOTTEN ONES");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JLabel number = new JLabel(String.valueOf(lm.getGot().size()));
        number.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        JButton accept = new JButton("Accept");
        accept.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
        
        accept.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showedGotten = true;
                /*for(int i = 0; i < jSpinners4.size(); i++){
                    lm.getGot().get(i).setCounter(Integer.parseInt(jSpinners4.get(i).getValue().toString()));
                }*/
            }
        });
        
        panel4.add(title);
        panel4.add(number);
        panel4.add(accept);
        
        for(Lamina l : lm.getGot()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels4.add(jl);
            TextArea txt = new TextArea(l.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts4.add(txt);
            JSpinner js = new JSpinner(new SpinnerNumberModel(0,0,50,1));
            js.setFont(new Font("Eras Medium ITC", Font.PLAIN,30));
            jSpinners4.add(js);
        }
        
        for(int i = 0; i < jSpinners4.size(); i++){
            panel2.add(jLabels4.get(i));
            panel2.add(texts4.get(i));
            panel2.add(jSpinners4.get(i));
        }
        
        this.scroll4 = new JScrollPane(panel4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }
    
    public void createPanel5(ListsManager lm){
        this.panel5 = new JPanel();
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2));
        
        JLabel title = new JLabel("TEAM LISTS");
        title.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        JButton btn = new JButton("Accept");
        btn.setFont(new Font("Eras Medium ITC", Font.BOLD,15));
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showedAll = true;
            }
        });
        
        p.add(title);
        p.add(btn);
        
        JLabel special = new JLabel("Special Ones");
        special.setFont(new Font("Eras Medium ITC", Font.BOLD,20));
        
        JLabel stadium = new JLabel("Stadiums");
        stadium.setFont(new Font("Eras Medium ITC", Font.BOLD,20));
        
        JLabel colombia = new JLabel("Colombia");
        colombia.setFont(new Font("Eras Medium ITC", Font.BOLD,20));
        
        JLabel germany = new JLabel("Germany");
        germany.setFont(new Font("Eras Medium ITC", Font.BOLD,20));
        
        createP1();
        createP2();
        createP3();
        createP4();
        
        panel5.add(p);
        panel5.add(special);
        panel5.add(p1);
        panel5.add(stadium);
        panel5.add(p2);
        panel5.add(colombia);
        panel5.add(p3);
        panel5.add(germany);
        panel5.add(p4);
        
        this.scroll5 = new JScrollPane(panel5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }
    
    public void createPanel6(){
        this.panel6 = new JPanel();
        panel6.setLayout(new GridLayout(2, 1));
        JButton ac = new JButton("Accept");
        this.hintText = new TextArea("kjvhvishvisdvjdsnivundsjvbdsnjkvbdskjbvkjdsbvkjdbvjkdbjvkb"
                + "jkvbjkdbvkjdsbvkjdbbvkjdbvkjdb"
                + "nvdjknjkdbvkjdbvjkdbvkjdbvkjdbvkjvd"
                + "vnjdnvkjdbvkjdbvkjdsbvjkdsbvkjsdbvjk"
                + "nvjkdbkjdbkjvbdkjbvjkdbvjkvdbvkjdsbvkj"
                + "v dbv kjdsbvjkdbvjkdbjkvbdskjvbdskjb");
        
        ac.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showedHints = true;
            }
        });
        
        panel6.add(hintText);
        panel6.add(ac);
        
        this.scroll6 = new JScrollPane(panel6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);        
    }
    
    public void createP1(){
        this.p1 = new JPanel();
        p1.setLayout(new GridLayout(TeamLists.getSpecialList().size(),2));
        for(Special sp : TeamLists.getSpecialList()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels51.add(jl);
            TextArea txt = new TextArea(sp.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts51.add(txt);
        }
        for(int i = 0; i < jLabels51.size(); i++){
            p1.add(jLabels51.get(i));
            p1.add(texts51.get(i));
        }
    }
    
    public void createP2(){
        this.p2 = new JPanel();
        p2.setLayout(new GridLayout(TeamLists.getStadiumList().size(),2));
        for(Stadium st : TeamLists.getStadiumList()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels52.add(jl);
            TextArea txt = new TextArea(st.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts52.add(txt);
        }
        for(int i = 0; i < jLabels52.size(); i++){
            p2.add(jLabels52.get(i));
            p2.add(texts52.get(i));
        }
    }
    
    public void createP3(){
        this.p3 = new JPanel();
        p3.setLayout(new GridLayout(TeamLists.getColombianList().size(),2));
        for(Lamina la : TeamLists.getColombianList()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels53.add(jl);
            TextArea txt = new TextArea(la.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts53.add(txt);
        }
        for(int i = 0; i < jLabels53.size(); i++){
            p3.add(jLabels53.get(i));
            p3.add(texts53.get(i));
        }
    }
    
    public void createP4(){
        this.p4 = new JPanel();
        p4.setLayout(new GridLayout(TeamLists.getGermanList().size(),2));
        for(Lamina la : TeamLists.getGermanList()){
            JLabel jl = new JLabel();
            String s = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectPanini\\src\\" + "descargaR2.jpg";
            ImageIcon icon = new ImageIcon(s);
            jl.setIcon(icon);
            jl.setSize(100, 100);
            jLabels54.add(jl);
            TextArea txt = new TextArea(la.giveInfo(),1,1,TextArea.SCROLLBARS_NONE);
            txt.setEditable(false);
            txt.setFont(new Font("Eras Medium ITC", Font.PLAIN,14));
            texts54.add(txt);
        }
        for(int i = 0; i < jLabels54.size(); i++){
            p4.add(jLabels54.get(i));
            p4.add(texts54.get(i));
        }
    }
    
    public void initComponents(ListsManager lm){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,650, 650);
        
        this.mainPanel = new JPanel();
        this.mainPanel.setBorder(new EmptyBorder(5,5,5,5));
        this.mainPanel.setLayout(new CardLayout(0,0));
        
        this.setContentPane(mainPanel);
        
        createPanel1();
        createPanel2(lm);
        createPanel3(lm);
        createPanel4(lm);
        createPanel5(lm);
        createPanel6();
    }    
    
    public void running(){
        boolean run = true;
        while (run) {
            switch (showMenu()) {
                case 1:
                    showMissing();
                    break;
                case 2:
                    showRepeated();
                    break;
                case 3:
                    showGotten();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    showHints();
                    break;
            }
        }    
    }
}
