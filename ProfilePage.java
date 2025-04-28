public class ProfilePage extends javax.swing.JFrame {
    private String username;

    public ProfilePage(String username) {
        initComponents();
        this.username = username;
        usernameLabel.setText("Username: " + username);
        setTitle("Profile");
        setLocationRelativeTo(null);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new Homepage(username).setVisible(true);
        this.dispose();
    }                                           
}
