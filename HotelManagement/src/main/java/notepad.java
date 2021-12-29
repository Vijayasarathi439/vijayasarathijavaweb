import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class notepad extends JFrame implements ActionListener
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notepad frame = new notepad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public notepad() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Sitka Text", Font.PLAIN, 17));
		setTitle("NOTEPAD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		mnNewMenu.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("open");
		mntmNewMenuItem.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("saveas");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("exit");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("edit");
		mnNewMenu_1.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("window");
		mnNewMenu_2.setBackground(new Color(240, 240, 240));
		mnNewMenu_2.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("help");
		mnNewMenu_3.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe Print", Font.BOLD, 17));
		scrollPane.setViewportView(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String name=e.getActionCommand();
		JOptionPane.showMessageDialog(notepad.this,name);
		if(name.equals("saveas"))
		{
			JFileChooser chooser=new JFileChooser();
			int res=chooser.showSaveDialog(notepad.this);
			if(res== chooser.APPROVE_OPTION)
			{
				try
				{
					File file=chooser.getSelectedFile();
					FileOutputStream fos=new FileOutputStream(file.getAbsoluteFile());
					fos.write(TextArea.);
					
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

}
