import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelOrders extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelOrders() {
		setBounds(0, 0, 752, 659);
		setLayout(null);
		
		JLabel lblThisIsOrder = new JLabel("THIS IS ORDER");
		lblThisIsOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsOrder.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIsOrder.setBounds(106, 206, 522, 199);
		add(lblThisIsOrder);

	}

}
