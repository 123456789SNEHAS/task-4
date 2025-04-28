import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        setTitle("Login Form");
        setLocationRelativeTo(null); // center
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        Connection conn = DatabaseConnection.getConnection();
        try {
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                new Homepage(username).setVisible(true);
                this.dispose(); // close login page
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }
        } catch (SQLException ex) {
            System.err.println("Login error: " + ex.getMessage());
        }
    }                                           
}
