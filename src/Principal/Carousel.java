/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

/**
 *
 * @author casas
 */
public class Carousel extends javax.swing.JPanel {

    /**
     * Creates new form Carousel
     */
    public Carousel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/Miniaturas/Helicoptero/Helicoptero0.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 900, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(jLabel6);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 130, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/Flecha derecha.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/Flecha izquierda.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/Cuadrado fondo enfocado.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 780, 480));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazGame/Cuadrado fondo enfocado.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 780, 480));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Embarque y desembarque en helicóptero");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 360, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ac accumsan ipsum. Curabitur congue diam at felis luctus tristique sed et libero. Donec et leo vitae metus sagittis egestas vitae ac nibh. Nunc ut ligula sapien. \n\nFusce cursus elementum ex, vel lacinia lorem egestas eu. Donec pellentesque lectus eu commodo cursus. Quisque urna ex, fermentum a est ut, efficitur ultricies nibh. Fusce commodo nunc erat, nec sagittis tortor malesuada non. Sed ac semper magna, nec tincidunt erat. Suspendisse potenti. Duis porta turpis sed pharetra gravida. In finibus nec lorem non gravida. Duis ullamcorper et diam et aliquam. Suspendisse cursus justo a neque suscipit ullamcorper.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 730, 130));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
