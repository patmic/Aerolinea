package GUI;
/**
 * Nota: Correr el programa con F5
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar ícono a la ventana
        ImageIcon icono = new ImageIcon("resources/ICON.png");
        setIconImage(icono.getImage());

        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contrasena:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("🔓");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);
        panel.setBackground(new Color(144, 176, 175));

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String user = userField.getText();
        String password = new String(passwordField.getPassword());

        // Verificar las credenciales
        if (user.equals("usuario") && password.equals("contraseña")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            dispose(); // Cerrar la ventana de inicio de sesión
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
