package gui_MainView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Zeit_View extends JPanel {

	private JLabel zeitLabel;

	public Zeit_View() {
		initZeitView();
	}

	private void initZeitView() {
		this.setLayout(new GridLayout(1, 1));
		this.add(uhrzeitenPanel());
	}

	private JPanel uhrzeitenPanel() {
		// zeitLabel = new JLabel("Zeit", SwingConstants.CENTER);
		// zeitLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		// zeitLabel.setPreferredSize(new Dimension(100, 25));

		JPanel uhrzeitenPanel = new JPanel();
		uhrzeitenPanel.setLayout(new GridLayout(48, 1));

		// uhrzeitenPanel.add(zeitLabel);

		for (int i = 0; i < 24; i++) {
			JLabel uhrzeitLabel = new JLabel(i + ":00", SwingConstants.CENTER);
			uhrzeitLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			uhrzeitLabel.setPreferredSize(new Dimension(100, 25));
			uhrzeitenPanel.add(uhrzeitLabel);
			for (int j = 0; j < 1; j++) {
				JLabel uhrzeitLabel2 = new JLabel(i + ":30",
						SwingConstants.CENTER);
				uhrzeitLabel2.setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
				uhrzeitLabel2.setPreferredSize(new Dimension(100, 25));
				uhrzeitenPanel.add(uhrzeitLabel2);
			}
		}

		return uhrzeitenPanel;
	}

	private JPanel getZeitPanel() {
		zeitLabel = new JLabel("Zeit", SwingConstants.CENTER);
		zeitLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		zeitLabel.setPreferredSize(new Dimension(100, 25));

		JPanel zeitPanel = new JPanel();
		zeitPanel.add(zeitLabel);

		return zeitPanel;
	}
}
