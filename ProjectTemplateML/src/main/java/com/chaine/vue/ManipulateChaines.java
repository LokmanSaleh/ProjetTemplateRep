package com.chaine.vue;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton createChaine = new JButton("Create new chaine");
		
		createChaine.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					System.out.println("Chaine id = "+  chaineId);

					File myObj = new File(PROJECT_PATH + "com\\chaine\\created\\chaine_" + chaineId ++ + ".bpmn");

					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());
					} else {
						System.out.println("File already exists.");
					}
				} catch (IOException e1) {
					System.out.println("An error occurred.");
					e1.printStackTrace();
				}
			}
			
		});
		
		createChaine.setBounds(34, 25, 95, 50);
		contentPane.add(createChaine);
		
		JButton saveAll = new JButton("Save all chaine ");
		
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
		
		saveAll.setBounds(161, 25, 85, 50);
		contentPane.add(saveAll);
		
		
		
		listOfChainesComboBox = new JComboBox();
		listOfChainesComboBox.setBounds(34, 101, 166, 50);
		
		for (ComboItem comboitem : BdQueries.getListOfChaines()) {
			listOfChainesComboBox.addItem(comboitem );
		} 
		
		contentPane.add(listOfChainesComboBox);
		 
		
		
		JButton btnNewButton_2 = new JButton("Load selected chaine ");
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
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_2.setBounds(222, 101, 85, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Loaded chaine");
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
		btnNewButton_3.setBounds(325, 101, 101, 50);
		contentPane.add(btnNewButton_3);
	}
 
}
