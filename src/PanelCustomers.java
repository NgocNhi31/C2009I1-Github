import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelCustomers extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCustomers() {
		setBounds(0, 0, 752, 659);
		setLayout(null);
		
		JLabel lblThisIsCustomer = new JLabel("THIS IS CUSTOMERS");
		lblThisIsCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsCustomer.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThisIsCustomer.setBounds(104, 216, 522, 199);
		add(lblThisIsCustomer);

	}

}
