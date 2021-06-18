import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelSetting extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelSetting() {
		setBounds(0, 0, 752, 659);
		setLayout(null);
		
		JLabel lblThisIsSetting = new JLabel("THIS IS SETTING");
		lblThisIsSetting.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsSetting.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIsSetting.setBounds(76, 214, 522, 199);
		add(lblThisIsSetting);

	}

}
