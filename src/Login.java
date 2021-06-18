import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {
	
	private Image img_logo = new ImageIcon(Login.class.getResource("res/2232688.png")).getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(Login.class.getResource("res/2503707.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(Login.class.getResource("res/4001033.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
	private Image img_log_in = new ImageIcon(Login.class.getResource("res/4293675.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JPasswordField pwdPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(128, 211, 305, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(230, 230, 250));
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtUsername.setBounds(24, 11, 201, 50);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setBounds(235, 0, 70, 72);
		lblIconUsername.setIcon(new ImageIcon(img_username));
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(128, 307, 305, 72);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {

					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");	
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
				}
			}
			
		});
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setBackground(new Color(230, 230, 250));
		pwdPassword.setBounds(25, 11, 201, 50);
		panel_1.add(pwdPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBounds(236, 0, 70, 72);
		lblIconPassword.setIcon(new ImageIcon(img_password));
		panel_1.add(lblIconPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 330, 160, 30);
		contentPane.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(95, 158, 160));
		panel_2.setBounds(128, 420, 305, 72);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOG IN ");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("admin") && pwdPassword.getText().equals("admin")){
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog( null, "Login Successful");
					Dashboard frameDashboard = new Dashboard();
					frameDashboard.setVisible(true);
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") ||
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requirement!");
				}
				else {
					lblLoginMessage.setText("Username and Password didn't match!");
				}
			} 
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogin.setForeground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogin.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblLogin.setForeground(new Color(60, 60, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblLogin.setForeground(new Color(30, 60, 60));
			}
		});
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setHorizontalTextPosition(SwingConstants.LEFT);
		lblLogin.setBounds(39, 11, 243, 50);
		panel_2.add(lblLogin);
		
		JLabel lblLogIn = new JLabel("");
		lblLogIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogIn.setBounds(49, -11, 60, 72);
		lblLogIn.setIcon(new ImageIcon(img_log_in));
		panel_2.add(lblLogIn);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this applicaton?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Login.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
			
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setBounds(516, 11, 29, 30);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(128, 67, 305, 116);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLoginMessage.setBounds(125, 390, 308, 23);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
	}
}
