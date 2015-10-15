package gui;

public class testMain {

	public static void main(String[] args) {
		gui_Login.login_View l = new gui_Login.login_View();
		l.setVisible(false);

		gui_MainView.Raumplaner_View r = new gui_MainView.Raumplaner_View();
		r.setVisible(true);
	}

}