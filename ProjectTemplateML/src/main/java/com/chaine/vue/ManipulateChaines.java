package com.chaine.vue;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import resources.BdQueries;
import resources.ComboItem;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.automl.datarepresentation.bean.StaticPaths;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;


public class ManipulateChaines extends JFrame {

	private JPanel contentPane;
	private JComboBox listOfChainesComboBox;
	
	public final static String PROJECT_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\";

	public static int chaineId = BdQueries.getLastId();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManipulateChaines frame = new ManipulateChaines();
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
	public ManipulateChaines() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(145, 11, 47, 21);
		contentPane.add(label);
		
		JButton btnNewButton_3 = new JButton("Update Selected chaine");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(490, 90, 192, 50);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ComboItem comboItem = (ComboItem) listOfChainesComboBox.getSelectedItem();
				
				// Creating a File object for directory
				File directoryPath = new File(PROJECT_PATH + "com\\chaine\\loaded");
				// List of all files and directories
				File filesList[] = directoryPath.listFiles();

				System.out.println("List of files  in the specified directory:");

				for (File file : filesList) {
					
					if (file.isFile() && file.getName().equals(comboItem.getValue())) {

						try {
							BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
							StringBuilder sb = new StringBuilder();
							String line;

							line = br.readLine();

							while (line != null) {
								sb.append(line);
								sb.append(System.lineSeparator());
								line = br.readLine();
							}

							String everything = sb.toString();

							BdQueries.UpdateChaine(comboItem.getKey(), everything);

							br.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}

					}

				}
				
			}
		});
		
		JButton saveAll = new JButton("Save all chaine ");
		saveAll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		saveAll.setBounds(270, 23, 191, 51);
		
		saveAll.addActionListener(new ActionListener() {
			
			//https://www.tutorialspoint.com/how-to-get-list-of-all-files-folders-from-a-folder-in-java#:~:text=The%20List()%20method,of%20the%20files%20and%20directories.
			
			public void actionPerformed(ActionEvent e) {

				// Creating a File object for directory
				File directoryPath = new File(PROJECT_PATH + "com\\chaine\\created");
				// List of all files and directories
				File filesList[] = directoryPath.listFiles();

				System.out.println("List of files  in the specified directory:");

				for (File file : filesList) {
					
					if (file.isFile()) {

						try {
							BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
							StringBuilder sb = new StringBuilder();
							String line;

							line = br.readLine();

							while (line != null) {
								sb.append(line);
								sb.append(System.lineSeparator());
								line = br.readLine();
							}

							String everything = sb.toString();

							BdQueries.insertChaine(file.getName(), everything);

							br.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}

					}

				}

			}
		});
		contentPane.add(saveAll);
		
		JButton createChaine = new JButton("Create new chaine");
		createChaine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		createChaine.setBounds(9, 21, 225, 55);
		
		createChaine.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					System.out.println("Chaine id = "+  chaineId);

					File myFile = new File(PROJECT_PATH + "com\\chaine\\created\\chaine_" + chaineId ++ + ".bpmn");

					if (myFile.createNewFile()) {
						System.out.println("File created: " + myFile.getName());
					} else {
						System.out.println("File already exists.");
					}
					
					Desktop.getDesktop().open(myFile);
					
				} catch (IOException e1) {
					System.out.println("An error occurred.");
					e1.printStackTrace();
				}
			}
			
		});
		contentPane.add(createChaine);
		
		
		
		listOfChainesComboBox = new JComboBox();
		listOfChainesComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listOfChainesComboBox.setBounds(9, 93, 224, 43);
		contentPane.add(listOfChainesComboBox);
		
		
		
		JButton btnNewButton_2 = new JButton("Load selected chaine ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(271, 90, 193, 49);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ComboItem comboItem = (ComboItem) listOfChainesComboBox.getSelectedItem();

				try {
					Blob blob = BdQueries.loadChaine(comboItem.getKey());
					InputStream in = blob.getBinaryStream();

					File myFile = new File(PROJECT_PATH + "com\\chaine\\loaded\\" + comboItem.getValue());

					myFile.createNewFile();
					OutputStream out;

					out = new FileOutputStream(myFile);

					byte[] buff = new byte[4096]; // how much of the blob to read/write at a time
					int len = 0;

					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}
					
					Desktop.getDesktop().open(myFile);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_3);
		
		for (ComboItem comboitem : BdQueries.getListOfChaines()) {
			listOfChainesComboBox.addItem(comboitem );
		} 
	}
 
}
