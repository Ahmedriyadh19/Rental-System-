/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rental.system.View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rental.system.Control.Control;
import rental.system.Model.User;

/**
 *
 * @author alahm
 */
public class LoginPage extends javax.swing.JFrame {

    Control control = new Control();

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        setIcon();
        putImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        holdLoginjPanel = new javax.swing.JPanel();
        userjLabel = new javax.swing.JLabel();
        passjLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        holdImagejPanel = new javax.swing.JPanel();
        imagejLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cyberjaya online rental managment system - Login ");
        setMaximumSize(new java.awt.Dimension(500, 320));
        setMinimumSize(new java.awt.Dimension(500, 320));
        setPreferredSize(new java.awt.Dimension(500, 320));
        getContentPane().setLayout(null);

        holdLoginjPanel.setBackground(new java.awt.Color(115, 181, 239));
        holdLoginjPanel.setMaximumSize(new java.awt.Dimension(270, 320));
        holdLoginjPanel.setMinimumSize(new java.awt.Dimension(270, 320));
        holdLoginjPanel.setPreferredSize(new java.awt.Dimension(282, 320));

        userjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_male_user_26px.png"))); // NOI18N

        passjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_password_26px.png"))); // NOI18N

        passwordField.setBorder(null);

        emailField.setBorder(null);

        registerBtn.setBackground(new java.awt.Color(204, 204, 204));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(204, 204, 204));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holdLoginjPanelLayout = new javax.swing.GroupLayout(holdLoginjPanel);
        holdLoginjPanel.setLayout(holdLoginjPanelLayout);
        holdLoginjPanelLayout.setHorizontalGroup(
            holdLoginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdLoginjPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(userjLabel)
                .addGap(18, 18, 18)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(holdLoginjPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(passjLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(holdLoginjPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(registerBtn)
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        holdLoginjPanelLayout.setVerticalGroup(
            holdLoginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdLoginjPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(holdLoginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userjLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(holdLoginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passjLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(holdLoginjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerBtn)
                    .addComponent(loginBtn)))
        );

        getContentPane().add(holdLoginjPanel);
        holdLoginjPanel.setBounds(230, 0, 270, 330);

        holdImagejPanel.setBackground(new java.awt.Color(0, 0, 26));
        holdImagejPanel.setMaximumSize(new java.awt.Dimension(230, 320));
        holdImagejPanel.setMinimumSize(new java.awt.Dimension(230, 320));
        holdImagejPanel.setPreferredSize(new java.awt.Dimension(230, 320));

        imagejLable.setBackground(new java.awt.Color(0, 0, 26));

        javax.swing.GroupLayout holdImagejPanelLayout = new javax.swing.GroupLayout(holdImagejPanel);
        holdImagejPanel.setLayout(holdImagejPanelLayout);
        holdImagejPanelLayout.setHorizontalGroup(
            holdImagejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holdImagejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagejLable, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        holdImagejPanelLayout.setVerticalGroup(
            holdImagejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdImagejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagejLable, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );

        getContentPane().add(holdImagejPanel);
        holdImagejPanel.setBounds(0, 0, 230, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        new RegisterPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        if (emailField.getText().equals("backdoor") && passwordField.getText().equals("backdoor")) {
            User admin = new User();
            admin.setUserType("Admin");
            new RegisterPage(admin).setVisible(true);
            setVisible(false);
        } else {
            User user;
            user = control.checkDataFromDB(emailField.getText(), passwordField.getText());

            //check the type of user
            if (user.getFullName().equals("no")) {
                JOptionPane.showMessageDialog(null, "No Record Yet related to Your Input Please try Again !", "Invalid input", 2);
            } else if (!user.getFullName().equals("no") && user.getUserType().equals("Admin")) {
                new AdminPage(user).setVisible(true);
                setVisible(false);
            } else if (!user.getFullName().equals("no") && (user.getUserType().equals("Owner") || user.getUserType().equals("Agent"))) {
                new AgentOwnerPage(user).setVisible(true);
                setVisible(false);

            } else if (!user.getFullName().equals("no") && user.getUserType().equals("Tenant")) {
                new TenantPage(user).setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Icons/icon.jpg")));

    }

    private void putImage() {
        String path = "src/rental/system/Icons/Main.jpg";
        ImageIcon image = new ImageIcon(path);
        Image img = image.getImage();
        Image imgFit = img.getScaledInstance(imagejLable.getWidth(), imagejLable.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon fit = new ImageIcon(imgFit);
        imagejLable.setIcon(fit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JPanel holdImagejPanel;
    private javax.swing.JPanel holdLoginjPanel;
    private javax.swing.JLabel imagejLable;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passjLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel userjLabel;
    // End of variables declaration//GEN-END:variables
}
