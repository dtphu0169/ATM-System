import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import View.GUIlogin;

public class ATM_System {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
		} catch (IllegalAccessException | UnsupportedLookAndFeelException |
				InstantiationException  | ClassNotFoundException e) {
			e.printStackTrace();
		}
		GUIlogin g = new GUIlogin();
	}
}
