import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Dashboard extends JFrame {

	/**
	 * 
	 */
	private JPanel contentbane;
	private Image img_logo = new ImageIcon(Login.class.getResource("res/2232688.png")).getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon(Login.class.getResource("res/Home.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_profile = new ImageIcon(Login.class.getResource("res/Profile.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_order = new ImageIcon(Login.class.getResource("res/Order.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_customer = new ImageIcon(Login.class.getResource("res/Customer.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_setting = new ImageIcon(Login.class.getResource("res/Setting.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_singout = new ImageIcon(Login.class.getResource("res/Singout.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	private PanelHome panelHome;
	private PanelProfile panelProfile;
	private PanelOrders panelOrders;
	private PanelCustomers panelCustomers;
	private PanelSetting panelSetting;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setBackground(new Color(95, 158, 160));
		setLocationRelativeTo(null);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 1200, 700);
		contentbane = new JPanel();
		contentbane.setBackground(new Color(0, 128, 128));
		contentbane.setBorder(null);
		setContentPane(contentbane);
		contentbane.setLayout(null);
		
		panelHome = new PanelHome();
		panelProfile = new PanelProfile();
		panelOrders = new PanelOrders();
		panelCustomers = new PanelCustomers();
		panelSetting = new PanelSetting();
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(0, 139, 139));
		paneMenu.setBounds(0, 0, 377, 724);
		contentbane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(27, 50, 323, 124);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		paneMenu.add(lblIconLogo);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setBackground(new Color(32, 178, 170));
		paneHome.setBounds(0, 231, 377, 62);
		paneMenu.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(90, 11, 245, 40);
		paneHome.add(lblNewLabel);
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setIcon(new ImageIcon(img_home));
		lblIconHome.setBounds(31, 0, 49, 62);
		paneHome.add(lblIconHome);
		
		JPanel paneProfile = new JPanel();
		paneProfile.addMouseListener(new PanelButtonMouseAdapter(paneProfile) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProfile);
			}
		});
		paneProfile.setBackground(new Color(32, 178, 170));
		paneProfile.setBounds(0, 293, 377, 62);
		paneMenu.add(paneProfile);
		paneProfile.setLayout(null);
		
		JLabel lblProfile = new JLabel("PROFILE");
		lblProfile.setForeground(new Color(255, 255, 255));
		lblProfile.setFont(new Font("Dialog", Font.BOLD, 20));
		lblProfile.setBounds(90, 11, 245, 40);
		paneProfile.add(lblProfile);
		
		JLabel lblIconProfile = new JLabel("");
		lblIconProfile.setIcon(new ImageIcon(img_profile));
		lblIconProfile.setBounds(31, 0, 49, 62);
		paneProfile.add(lblIconProfile);
		
		JPanel paneOrders = new JPanel();
		paneOrders.addMouseListener(new PanelButtonMouseAdapter(paneOrders) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelOrders);
			}
		});
		paneOrders.setBackground(new Color(32, 178, 170));
		paneOrders.setBounds(0, 355, 377, 62);
		paneMenu.add(paneOrders);
		paneOrders.setLayout(null);
		
		JLabel lblOrders = new JLabel("ORDERS");
		lblOrders.setForeground(new Color(255, 255, 255));
		lblOrders.setFont(new Font("Dialog", Font.BOLD, 20));
		lblOrders.setBounds(90, 11, 245, 40);
		paneOrders.add(lblOrders);
		
		JLabel lblIconOrders = new JLabel("");
		lblIconOrders.setIcon(new ImageIcon(img_order));
		lblIconOrders.setBounds(31, 0, 49, 62);
		paneOrders.add(lblIconOrders);
		
		JPanel paneCustomers = new JPanel();
		paneCustomers.addMouseListener(new PanelButtonMouseAdapter(paneCustomers) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCustomers);
			}
		});
		paneCustomers.setBackground(new Color(32, 178, 170));
		paneCustomers.setBounds(0, 417, 377, 62);
		paneMenu.add(paneCustomers);
		paneCustomers.setLayout(null);
		
		JLabel lblCustomer = new JLabel("CUSTOMERS");
		lblCustomer.setForeground(new Color(255, 255, 255));
		lblCustomer.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCustomer.setBounds(90, 11, 245, 40);
		paneCustomers.add(lblCustomer);
		
		JLabel lblIconCustomers = new JLabel("");
		lblIconCustomers.setIcon(new ImageIcon(img_customer));
		lblIconCustomers.setBounds(31, 0, 49, 62);
		paneCustomers.add(lblIconCustomers);
		
		JPanel paneSetting = new JPanel();
		paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSetting);
			}
		});
		paneSetting.setBackground(new Color(32, 178, 170));
		paneSetting.setBounds(0, 477, 377, 62);
		paneMenu.add(paneSetting);
		paneSetting.setLayout(null);
		
		JLabel lblSetting = new JLabel("SETTING");
		lblSetting.setForeground(new Color(255, 255, 255));
		lblSetting.setFont(new Font("Dialog", Font.BOLD, 20));
		lblSetting.setBounds(90, 11, 245, 40);
		paneSetting.add(lblSetting);
		
		JLabel lblIconSetting = new JLabel("");
		lblIconSetting.setIcon(new ImageIcon(img_setting));
		lblIconSetting.setBounds(31, 0, 49, 62);
		paneSetting.add(lblIconSetting);
		
		JPanel paneSignOut = new JPanel();
		paneSignOut.addMouseListener(new PanelButtonMouseAdapter(paneSignOut) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0) {
					Login frameLogin = new Login();
					frameLogin.setVisible(true);
					Dashboard.this.dispose();
				}
				
			}
		});
		paneSignOut.setBackground(new Color(32, 178, 170));
		paneSignOut.setBounds(0, 538, 377, 62);
		paneMenu.add(paneSignOut);
		paneSignOut.setLayout(null);
		
		JLabel lblSingout = new JLabel("SIGN OUT");
		lblSingout.setForeground(new Color(255, 255, 255));
		lblSingout.setFont(new Font("Dialog", Font.BOLD, 20));
		lblSingout.setBounds(90, 11, 245, 40);
		paneSignOut.add(lblSingout);
		
		JLabel lblIconSingout = new JLabel("");
		lblIconSingout.setIcon(new ImageIcon(img_singout));
		lblIconSingout.setBounds(31, 0, 49, 62);
		paneSignOut.add(lblIconSingout);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this applicaton?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Dashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
			
		});
		lblExit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblExit.setBounds(1161, 0, 29, 30);
		contentbane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(400, 30, 752, 659);
		contentbane.add(paneMainContent);
		paneMainContent.setLayout(null);
		
		paneMainContent.add(panelHome);
		paneMainContent.add(panelProfile);
		paneMainContent.add(panelOrders);
		paneMainContent.add(panelCustomers);
		paneMainContent.add(panelSetting);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelProfile.setVisible(false);
		panelOrders.setVisible(false);
		panelCustomers.setVisible(false);
		panelSetting.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(32, 178, 170));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(32, 178, 170));
		}
	}
	
}
