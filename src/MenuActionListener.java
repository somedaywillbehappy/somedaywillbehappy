import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuActionListener implements ActionListener {

	private MainFrame mainWindow = null;
	private JTable table = null;
	public MenuActionListener(MainFrame mainWindow) {
		this.mainWindow = mainWindow;
		createTable();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Log-in ..."))
		{
			System.out.println("Log-in ... ok");
			
			new LoginWindows();
			mainWindow.dispose();
		}
		
		if(e.getActionCommand().equals("Log-out ..."))
		{	
			System.out.println("Log-out ... ok");
			
			int dialogResult = JOptionPane.showConfirmDialog (null, 
					"Would you like to Logout?",
					"Warning",
					JOptionPane.YES_NO_OPTION);
					if(dialogResult == JOptionPane.YES_OPTION){
					 // code here
						mainWindow.dispose();
					}
		}
		
		if(e.getActionCommand().equals("Members ..."))
		{
			System.out.println("members... ok");
			
			DefaultTableModel model= (DefaultTableModel)table.getModel();
			Database.getInstance().insertJTable(model);
		}
		
		if(e.getActionCommand().equals("Add Book"))
		{
			System.out.println("members... ok");
			
			DefaultTableModel model= (DefaultTableModel)table.getModel();
			Database.getInstance().insertJTable(model);
		}
		
	}
	
	private void createTable() {
		String []header = {"id", "name", "password"};
		DefaultTableModel model=new DefaultTableModel(header,0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		mainWindow.add(scroll);
	}
	
}
