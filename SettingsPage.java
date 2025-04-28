public class SettingsPage extends javax.swing.JFrame {
    private String username;

    public SettingsPage(String username) {
        initComponents();
        this.username = username;
        setTitle("Settings");
        setLocationRelativeTo(null);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new Homepage(username).setVisible(true);
        this.dispose();
    }                                           
}
