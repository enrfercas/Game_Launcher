package Principal;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author casas
 */
public class Launcher extends javax.swing.JFrame {
    
    int indexGrado;
    int indexGame;
    ArrayList <JLabel> escudos = new ArrayList();
    

    /**
     * Creates new form Pantalla
     */
    public Launcher() {
        
        initComponents();
        /*escudos.clear();
        
            escudos.add(Escudo0);
            escudos.add(Escudo1);
            escudos.add(Escudo2);*/
            
            for( int i = 0; i < escudos.size(); i++){
            
                
            }

        
        CrearNuevoHomePorIndice(0);
        
        
        

    }
    
     public void CrearNuevoHomePorIndice(int nGrado)
    {
        Home home = new Home(this,nGrado);
        home.setSize(1440,880);
        ContentContainer.removeAll();
        ContentContainer.add(home);
        ContentContainer.revalidate();
        ContentContainer.repaint();
// lo limpian
                //añaden la vista
    }
    
    
    public void CrearNuevoGamePorIndice(int nGrado, int nGame)
    {
        Game game = new Game(this,nGrado,nGame);
        game.UpdateInfo(indexGrado, indexGame);
        MostrarJPanel (game);
        
    }
    
    public void MostrarJPanel(JPanel panel){
       panel.setSize(1440,880);
        ContentContainer.removeAll();
        ContentContainer.add(panel);
        ContentContainer.revalidate();
        ContentContainer.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContainer = new javax.swing.JPanel();
        ContentContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Escudo0 = new javax.swing.JLabel();
        Escudo2 = new javax.swing.JLabel();
        Escudo1 = new javax.swing.JLabel();
        Escudo3 = new javax.swing.JLabel();
        Escudo4 = new javax.swing.JLabel();
        Escudo5 = new javax.swing.JLabel();
        Escudo6 = new javax.swing.JLabel();
        Escudo7 = new javax.swing.JLabel();
        Escudo8 = new javax.swing.JLabel();
        Escudo9 = new javax.swing.JLabel();
        Escudo10 = new javax.swing.JLabel();
        Escudo11 = new javax.swing.JLabel();
        Escudo12 = new javax.swing.JLabel();
        Escudo13 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);

        jPanelContainer.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanelContainer.setName(""); // NOI18N
        jPanelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContentContainer.setMaximumSize(new java.awt.Dimension(1440, 880));
        ContentContainer.setMinimumSize(new java.awt.Dimension(1440, 880));
        ContentContainer.setName(""); // NOI18N
        ContentContainer.setOpaque(false);

        javax.swing.GroupLayout ContentContainerLayout = new javax.swing.GroupLayout(ContentContainer);
        ContentContainer.setLayout(ContentContainerLayout);
        ContentContainerLayout.setHorizontalGroup(
            ContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        ContentContainerLayout.setVerticalGroup(
            ContentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        jPanelContainer.add(ContentContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 1440, 880));

        jPanel1.setMaximumSize(new java.awt.Dimension(1514, 121));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1, 5));

        Escudo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        Escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo0.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo0.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo0.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo0MouseExited(evt);
            }
        });
        jPanel1.add(Escudo0);

        Escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton1.png"))); // NOI18N
        Escudo2.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo2.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo2.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo2MouseExited(evt);
            }
        });
        jPanel1.add(Escudo2);

        Escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton0.png"))); // NOI18N
        Escudo1.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo1.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo1.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo1MouseExited(evt);
            }
        });
        jPanel1.add(Escudo1);

        Escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        Escudo3.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo3.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo3.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo3MouseExited(evt);
            }
        });
        jPanel1.add(Escudo3);

        Escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        Escudo4.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo4.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo4.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo4MouseExited(evt);
            }
        });
        jPanel1.add(Escudo4);

        Escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        Escudo5.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo5.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo5.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo5MouseExited(evt);
            }
        });
        jPanel1.add(Escudo5);

        Escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        Escudo6.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo6.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo6.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo6MouseExited(evt);
            }
        });
        jPanel1.add(Escudo6);

        Escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        Escudo7.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo7.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo7.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo7MouseExited(evt);
            }
        });
        jPanel1.add(Escudo7);

        Escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        Escudo8.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo8.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo8.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo8MouseExited(evt);
            }
        });
        jPanel1.add(Escudo8);

        Escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        Escudo9.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo9.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo9.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo9MouseExited(evt);
            }
        });
        jPanel1.add(Escudo9);

        Escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        Escudo10.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo10.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo10.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo10MouseExited(evt);
            }
        });
        jPanel1.add(Escudo10);

        Escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        Escudo11.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo11.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo11.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo11MouseExited(evt);
            }
        });
        jPanel1.add(Escudo11);

        Escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        Escudo12.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo12.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo12.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo12MouseExited(evt);
            }
        });
        jPanel1.add(Escudo12);

        Escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        Escudo13.setMaximumSize(new java.awt.Dimension(108, 120));
        Escudo13.setMinimumSize(new java.awt.Dimension(108, 120));
        Escudo13.setPreferredSize(new java.awt.Dimension(108, 120));
        Escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo13MouseExited(evt);
            }
        });
        jPanel1.add(Escudo13);

        jPanelContainer.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 1550, 110));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazBase/FondoBase.png"))); // NOI18N
        jPanelContainer.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Escudo0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
         
        
    }//GEN-LAST:event_Escudo0MouseClicked

    private void Escudo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo1MouseClicked

    private void Escudo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo2MouseClicked

    private void Escudo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo3MouseClicked

    private void Escudo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo4MouseClicked

    private void Escudo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo5MouseClicked

    private void Escudo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo6MouseClicked

    private void Escudo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo7MouseClicked

    private void Escudo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo8MouseClicked

    private void Escudo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo9MouseClicked

    private void Escudo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo10MouseClicked

    private void Escudo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo11MouseClicked

    private void Escudo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo12MouseClicked

    private void Escudo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseClicked
        // TODO add your handling code here:
         CrearNuevoHomePorIndice(0);
    }//GEN-LAST:event_Escudo13MouseClicked

    private void Escudo0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton0.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo0.setIcon(img2);
    }//GEN-LAST:event_Escudo0MouseEntered

    private void Escudo0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseExited
        this.Escudo0.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton0.png"));
    }//GEN-LAST:event_Escudo0MouseExited

    private void Escudo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton2.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo2.setIcon(img2);
    }//GEN-LAST:event_Escudo2MouseEntered

    private void Escudo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseExited
        this.Escudo2.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton2.png"));
    }//GEN-LAST:event_Escudo2MouseExited

    private void Escudo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton1.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo1.setIcon(img2);
    }//GEN-LAST:event_Escudo1MouseEntered

    private void Escudo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseExited
        this.Escudo1.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton1.png"));
    }//GEN-LAST:event_Escudo1MouseExited

    private void Escudo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton3.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo3.setIcon(img2);
    }//GEN-LAST:event_Escudo3MouseEntered

    private void Escudo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseExited
        this.Escudo3.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton3.png"));

    }//GEN-LAST:event_Escudo3MouseExited

    private void Escudo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton4.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo4.setIcon(img2);
    }//GEN-LAST:event_Escudo4MouseEntered

    private void Escudo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseExited
        this.Escudo4.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton4.png"));
    }//GEN-LAST:event_Escudo4MouseExited

    private void Escudo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton5.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo5.setIcon(img2);
    }//GEN-LAST:event_Escudo5MouseEntered

    private void Escudo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseExited
        this.Escudo5.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton5.png"));
    }//GEN-LAST:event_Escudo5MouseExited

    private void Escudo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton6.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo6.setIcon(img2);
    }//GEN-LAST:event_Escudo6MouseEntered

    private void Escudo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseExited
        this.Escudo6.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton6.png"));

    }//GEN-LAST:event_Escudo6MouseExited

    private void Escudo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton7.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo7.setIcon(img2);
    }//GEN-LAST:event_Escudo7MouseEntered

    private void Escudo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseExited
        this.Escudo7.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton7.png"));
    }//GEN-LAST:event_Escudo7MouseExited

    private void Escudo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton8.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo8.setIcon(img2);
    }//GEN-LAST:event_Escudo8MouseEntered

    private void Escudo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseExited
        this.Escudo8.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton8.png"));
    }//GEN-LAST:event_Escudo8MouseExited

    private void Escudo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton9.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo9.setIcon(img2);
    }//GEN-LAST:event_Escudo9MouseEntered

    private void Escudo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseExited
        this.Escudo9.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton9.png"));
    }//GEN-LAST:event_Escudo9MouseExited

    private void Escudo10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton10.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo10.setIcon(img2);
    }//GEN-LAST:event_Escudo10MouseEntered

    private void Escudo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseExited
        this.Escudo10.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton10.png"));
    }//GEN-LAST:event_Escudo10MouseExited

    private void Escudo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton11.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo11.setIcon(img2);
    }//GEN-LAST:event_Escudo11MouseEntered

    private void Escudo12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton12.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo12.setIcon(img2);
    }//GEN-LAST:event_Escudo12MouseEntered

    private void Escudo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseExited
        this.Escudo12.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton12.png"));
    }//GEN-LAST:event_Escudo12MouseExited

    private void Escudo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseExited
        this.Escudo11.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton11.png"));
    }//GEN-LAST:event_Escudo11MouseExited

    private void Escudo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseEntered
        Image img= new ImageIcon("src/InterfazBase/Escudos/LauncherButton13.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(120, 130, Image.SCALE_SMOOTH));
        this.Escudo13.setIcon(img2);
    }//GEN-LAST:event_Escudo13MouseEntered

    private void Escudo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseExited
        this.Escudo13.setIcon(new ImageIcon("src/InterfazBase/Escudos/LauncherButton13.png"));
    }//GEN-LAST:event_Escudo13MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentContainer;
    private javax.swing.JLabel Escudo0;
    private javax.swing.JLabel Escudo1;
    private javax.swing.JLabel Escudo10;
    private javax.swing.JLabel Escudo11;
    private javax.swing.JLabel Escudo12;
    private javax.swing.JLabel Escudo13;
    private javax.swing.JLabel Escudo2;
    private javax.swing.JLabel Escudo3;
    private javax.swing.JLabel Escudo4;
    private javax.swing.JLabel Escudo5;
    private javax.swing.JLabel Escudo6;
    private javax.swing.JLabel Escudo7;
    private javax.swing.JLabel Escudo8;
    private javax.swing.JLabel Escudo9;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContainer;
    // End of variables declaration//GEN-END:variables
}
