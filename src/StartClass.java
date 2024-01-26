import javax.swing.*;

public class StartClass {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FootballApp().setVisible(true);
			}
		});

	}

}
