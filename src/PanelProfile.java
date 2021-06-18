import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelProfile extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelProfile() {
		setBounds(0, 0, 752, 659);
		setLayout(null);
		
		JLabel lblThisIsProfile = new JLabel("THIS IS PROFILE");
		lblThisIsProfile.setBounds(108, 275, 520, 49);
		lblThisIsProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsProfile.setFont(new Font("Tahoma", Font.BOLD, 40));
		add(lblThisIsProfile);

	}

}
