package vijaysatrathi.HotelManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DropMode;

public class first extends JFrame {

	private JPanel contentPane;
	private JTree food;
	private JTextField txtPlanttree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
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
	public first() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ELCOT\\Pictures\\gopal paint.png"));
		setTitle("name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		food = new JTree();
		food.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		food.setBackground(Color.ORANGE);
		food.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("colors");
						node_1.add(new DefaultMutableTreeNode("blue"));
						node_1.add(new DefaultMutableTreeNode("violet"));
						node_1.add(new DefaultMutableTreeNode("red"));
						node_1.add(new DefaultMutableTreeNode("yellow"));
				
					node_1 = new DefaultMutableTreeNode("sports");
						node_1.add(new DefaultMutableTreeNode("basketball"));
						node_1.add(new DefaultMutableTreeNode("soccer"));
						node_1.add(new DefaultMutableTreeNode("football"));
						node_1.add(new DefaultMutableTreeNode("hockey"));
				
					node_1 = new DefaultMutableTreeNode("food");
						node_1.add(new DefaultMutableTreeNode("hot dogs"));
						node_1.add(new DefaultMutableTreeNode("pizza"));
						node_1.add(new DefaultMutableTreeNode("ravioli"));
						node_1.add(new DefaultMutableTreeNode("bananas"));
					
				}
			}
		));
		food.setBounds(-11, 0, 152, 151);
		contentPane.add(food);
		
		txtPlanttree = new JTextField();
		txtPlanttree.setBackground(Color.BLACK);
		txtPlanttree.setHorizontalAlignment(SwingConstants.LEFT);
		txtPlanttree.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		txtPlanttree.setForeground(Color.GREEN);
		txtPlanttree.setText("planttree");
		txtPlanttree.setBounds(166, 26, 99, 25);
		contentPane.add(txtPlanttree);
		txtPlanttree.setColumns(10);
		
		JEditorPane dtrpnColors = new JEditorPane();
		dtrpnColors.setBackground(Color.RED);
		dtrpnColors.setFont(new Font("Ravie", Font.PLAIN, 17));
		dtrpnColors.setText("RED");
		dtrpnColors.setBounds(263, 48, 58, 25);
		contentPane.add(dtrpnColors);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ELCOT\\Pictures\\gopal paint.png"));
		lblNewLabel.setBounds(186, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CRICKET");
		chckbxNewCheckBox.setBackground(Color.BLUE);
		chckbxNewCheckBox.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(322, 73, 93, 25);
		contentPane.add(chckbxNewCheckBox);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{food, txtPlanttree}));
	}
}
