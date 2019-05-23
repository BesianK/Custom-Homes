package kodra_guicustomhomes;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author besian kodra
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        rdbtnExisitingLot = new javax.swing.JRadioButton();
        rdbtnNewSub = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdbtnLuxury = new javax.swing.JRadioButton();
        rdbtnStandard = new javax.swing.JRadioButton();
        rdbtnCustom = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        chkboxGraniteCounter = new javax.swing.JCheckBox();
        chkboxJacuzzi = new javax.swing.JCheckBox();
        chkboxFinishedBasement = new javax.swing.JCheckBox();
        chkboxSmartHome = new javax.swing.JCheckBox();
        chkboxCustLandscape = new javax.swing.JCheckBox();
        chkboxBrickPatio = new javax.swing.JCheckBox();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Besian's Custom Homes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Mistral", 0, 48)); // NOI18N
        jLabel1.setText("Besian's Custom Homes");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("Phone Number:");

        txtName.setToolTipText("");

        buttonGroup1.add(rdbtnExisitingLot);
        rdbtnExisitingLot.setText("Existing Lot");

        buttonGroup1.add(rdbtnNewSub);
        rdbtnNewSub.setText("New Subdivision");

        jLabel5.setText("Choose from the following two options:");

        jLabel6.setText("Home Model:");

        buttonGroup2.add(rdbtnLuxury);
        rdbtnLuxury.setText("Luxury");

        buttonGroup2.add(rdbtnStandard);
        rdbtnStandard.setText("Standard");

        buttonGroup2.add(rdbtnCustom);
        rdbtnCustom.setText("Custom");

        jLabel7.setText("Add-Ons:");

        chkboxGraniteCounter.setText("Granite Countertops");

        chkboxJacuzzi.setText("Jacuzzi Bath");

        chkboxFinishedBasement.setText("Finished Basement");

        chkboxSmartHome.setText("Smart Home Package");

        chkboxCustLandscape.setText("Custom Landscaping");

        chkboxBrickPatio.setText("Brick Patio");

        btnPlaceOrder.setText("Place Order");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kodra_guicustomhomes/c62f7fa39-square.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");

        btnExit.setText("Exit");
        btnExit.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlaceOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5))
                            .addComponent(rdbtnExisitingLot)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbtnStandard)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addComponent(rdbtnLuxury))
                                .addGap(46, 46, 46)
                                .addComponent(rdbtnCustom))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkboxSmartHome)
                                    .addComponent(chkboxFinishedBasement))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkboxCustLandscape)
                                    .addComponent(chkboxBrickPatio)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rdbtnNewSub)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtPhoneNumber))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkboxGraniteCounter)
                                .addGap(18, 18, 18)
                                .addComponent(chkboxJacuzzi)))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnExisitingLot)
                            .addComponent(rdbtnNewSub))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtnLuxury)
                            .addComponent(rdbtnStandard)
                            .addComponent(rdbtnCustom))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkboxGraniteCounter)
                            .addComponent(chkboxJacuzzi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkboxSmartHome)
                            .addComponent(chkboxCustLandscape))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkboxFinishedBasement)
                            .addComponent(chkboxBrickPatio))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlaceOrder)
                            .addComponent(btnExit)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        void addOrderListener(ActionListener listenForOrder) {

        btnPlaceOrder.addActionListener(listenForOrder);
        btnExit.addActionListener(e -> System.exit(0));
    }

    public void setUp() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));

    }

    public void displayConfirmationMessage(Order custOrder) {

        DecimalFormat cost = new DecimalFormat("###.00");

        JOptionPane.showMessageDialog(null,
                "Thank you " + custOrder.getName() + " for purchasing a new home " + custOrder.getPlot()
                + "\nWith the following additional free option: " + custOrder.getAddons()
                + "\nFor a total cost of $" + cost.format(custOrder.getOrderTotal()) + " !");
        Reset();
    }

    public void displayErrorMessage(String message) {

        JOptionPane.showMessageDialog(null, "Oh no! Something went wrong! " + message);

    }

    public void Reset() {
        txtAddress.setText("");
        txtName.setText("");
        txtPhoneNumber.setText("");

        buttonGroup2.clearSelection();
        buttonGroup1.clearSelection();

        chkboxBrickPatio.setSelected(false);
        chkboxCustLandscape.setSelected(false);
        chkboxFinishedBasement.setSelected(false);
        chkboxGraniteCounter.setSelected(false);
        chkboxJacuzzi.setSelected(false);
        chkboxSmartHome.setSelected(false);
    }

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkboxBrickPatio;
    private javax.swing.JCheckBox chkboxCustLandscape;
    private javax.swing.JCheckBox chkboxFinishedBasement;
    private javax.swing.JCheckBox chkboxGraniteCounter;
    private javax.swing.JCheckBox chkboxJacuzzi;
    private javax.swing.JCheckBox chkboxSmartHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdbtnCustom;
    private javax.swing.JRadioButton rdbtnExisitingLot;
    private javax.swing.JRadioButton rdbtnLuxury;
    private javax.swing.JRadioButton rdbtnNewSub;
    private javax.swing.JRadioButton rdbtnStandard;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
public javax.swing.ButtonGroup getBtngrpHomeType() {
        return buttonGroup2;
    }

    public javax.swing.ButtonGroup getBtngrpLandPlot() {
        return buttonGroup1;
    }

    public javax.swing.JCheckBox getChkboxBrickPatio() {
        return chkboxBrickPatio;
    }

    public javax.swing.JCheckBox getChkboxCustLandscape() {
        return chkboxCustLandscape;
    }

    public javax.swing.JCheckBox getChkboxFinishedBasement() {
        return chkboxFinishedBasement;
    }

    public javax.swing.JCheckBox getChkboxGraniteCounter() {
        return chkboxGraniteCounter;
    }

    public javax.swing.JCheckBox getChkboxJacuzzi() {
        return chkboxJacuzzi;
    }

    public javax.swing.JCheckBox getChkboxSmartHome() {
        return chkboxSmartHome;
    }

    public javax.swing.JRadioButton getRdbtnCustom() {
        return rdbtnCustom;
    }

    public javax.swing.JRadioButton getRdbtnExisitingLot() {
        return rdbtnExisitingLot;
    }

    public javax.swing.JRadioButton getRdbtnLuxury() {
        return rdbtnLuxury;
    }

    public javax.swing.JRadioButton getRdbtnNewSub() {
        return rdbtnNewSub;
    }

    public javax.swing.JRadioButton getRdbtnStandard() {
        return rdbtnStandard;
    }

    public javax.swing.JTextField getTxtAddress() {
        return txtAddress;
    }

    public javax.swing.JTextField getTxtName() {
        return txtName;
    }

    public javax.swing.JTextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }
}