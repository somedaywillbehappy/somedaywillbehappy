import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI Test");
		setSize(800, 500);
		
		createMenu();
		
		setVisible(true);
		//화면 가운데 생성
		setLocationRelativeTo(null);
	}
	
	private void createMenu() {
		/* Menu를 만듭니다. */
		JMenuBar mb = new JMenuBar();
		JMenu personMenu = new JMenu("Person");

		JMenuItem loginMenuItem = new JMenuItem("Log-in ...");
		JMenuItem logoutMenuItem = new JMenuItem("Log-out ...");
		personMenu.add(loginMenuItem);
		personMenu.add(logoutMenuItem);
		
		JMenu memberMenu = new JMenu("Members");
		JMenuItem membersMenuItem = new JMenuItem("Members ...");
		memberMenu.add(membersMenuItem);
		
		JMenu bookMenu = new JMenu("Book");
		JMenuItem addbookMenuItem = new JMenuItem("Add Book");
		JMenuItem booklistMenuItem = new JMenuItem("Book List");
		bookMenu.add(addbookMenuItem);
		bookMenu.add(booklistMenuItem);
		
		mb.add(personMenu);
		mb.add(memberMenu);
		mb.add(bookMenu);
		
		MenuActionListener menuListener = new MenuActionListener(this);
		loginMenuItem.addActionListener(menuListener);
		logoutMenuItem.addActionListener(menuListener);
		membersMenuItem.addActionListener(menuListener);
		addbookMenuItem.addActionListener(menuListener);
		booklistMenuItem.addActionListener(menuListener);
		
		setJMenuBar(mb);
	}
}
