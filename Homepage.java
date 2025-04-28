public class Homepage extends javax.swing.JFrame {
    private String username;

    public Homepage(String username) {
        initComponents();
        this.username = username;
        userGreetingLabel.setText("Hello, " + username + "!");
        setTitle("Homepage");
        setLocationRelativeTo(null);
    }

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        new ProfilePage(username).setVisible(true);
        this.dispose();
    }                                                  

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new SettingsPage(username).setVisible(true);
        this.dispose();
    }                                               

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        new LoginForm().setVisible(true);
        this.dispose();
    }                                             
}
