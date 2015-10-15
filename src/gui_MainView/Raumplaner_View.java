package gui_MainView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.toedter.calendar.JCalendar;

public class Raumplaner_View extends JFrame {

	private JCalendar calendar;
	private JLabel nameLabel, bereichLabel, logoLabel;
	private JButton logoutButton;
	private JScrollPane scroller;

	public Raumplaner_View() {
		initView();
	}

	private void initView() {
		setLayout(new BorderLayout());
		getContentPane().add(mainPanel(), BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Raumplaner v.1.0");
		setMinimumSize(new Dimension(1024, 786));
		setMaximumSize(new Dimension(1920, 1080));
		setExtendedState(MAXIMIZED_BOTH);
	}

	private JPanel logoPanel() {
		logoLabel = new JLabel("Raumplanerlogo");
		logoLabel.setPreferredSize(new Dimension(100, 100));

		JPanel logoPanel = new JPanel();
		logoPanel.add(logoLabel);

		return logoPanel;
	}

	private JPanel scrollPanel() {
		Zeit_View zv = new Zeit_View();

		JPanel onScrollPanel = new JPanel();
		onScrollPanel.setLayout(new BorderLayout());

		onScrollPanel.add(zv, BorderLayout.WEST);
		onScrollPanel.add(new JTextArea(), BorderLayout.CENTER);

		scroller = new JScrollPane(onScrollPanel,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroller.getVerticalScrollBar().setUnitIncrement(16);

		JPanel scrollPane = new JPanel(new BorderLayout());
		scrollPane.add(scroller, BorderLayout.CENTER);

		JPanel upperPanel = new JPanel();
		upperPanel.setLayout(new GridLayout(1, 5));

		// upperPanel.add(zv.getz)

		return scrollPane;
	}

	private JPanel leftPanel() {
		calendar = new JCalendar();
		calendar.setTodayButtonVisible(true);

		nameLabel = new JLabel("Name");
		// nameLabel.setPreferredSize(new Dimension(150, 100));

		bereichLabel = new JLabel("Bereich");

		logoutButton = new JButton("Logout");
		logoutButton.setPreferredSize(new Dimension(160, 30));

		JPanel namenPanel = new JPanel();
		namenPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		namenPanel.add(nameLabel);

		JPanel bereichPanel = new JPanel();
		bereichPanel.add(bereichLabel);

		JPanel logoutPanel = new JPanel();
		logoutPanel.add(logoutButton);

		JPanel calendarPanel = new JPanel();
		calendarPanel.add(calendar);

		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(3, 1));

		infoPanel.add(namenPanel);
		infoPanel.add(bereichPanel);
		infoPanel.add(logoutPanel);

		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());

		leftPanel.add(calendarPanel, BorderLayout.NORTH);
		leftPanel.add(infoPanel, BorderLayout.SOUTH);

		return leftPanel;
	}

	private JPanel mainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		mainPanel.add(logoPanel(), BorderLayout.NORTH);
		mainPanel.add(leftPanel(), BorderLayout.WEST);
		mainPanel.add(scrollPanel(), BorderLayout.CENTER);

		// mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		return mainPanel;
	}
}
