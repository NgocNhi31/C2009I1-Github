import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBounds(0, 0, 752, 659);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("THIS IS HOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 211, 522, 199);
		add(lblNewLabel);
	}

}
