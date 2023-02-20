package com.chaine.vue;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import resources.BdQueries;
import resources.Chaine;
import resources.ComboItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;


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
		setBounds(100, 100, 968, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Update Selected chaine");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(520, 148, 192, 50);
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
							
							br.close();
							
							BdQueries.UpdateChaine(comboItem.getKey(), everything, file);

							

						} catch (IOException e1) {
							e1.printStackTrace();
						}

					}

				}
				
			}
		});
		
		JButton saveAll = new JButton("Save all chaine ");
		saveAll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		saveAll.setBounds(309, 23, 191, 51);
		
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
							
							br.close();
							
							String everything = sb.toString();

							int id = BdQueries.insertChaine(file, everything);
							
							if (id > 0) {
								listOfChainesComboBox.addItem(new ComboItem(id, file.getName()));
							} 
 

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
		createChaine.setBounds(9, 25, 290, 49);
		
		createChaine.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				

				try {
					Blob blob = BdQueries.loadTemplate();
					InputStream in = blob.getBinaryStream();

					File myFile = new File(PROJECT_PATH + "com\\chaine\\created\\chaine_" + chaineId ++ + ".bpmn");

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

				
				
				/*
				 * try { System.out.println("Chaine id = "+ chaineId);
				 * 
				 * File myFile = new File(PROJECT_PATH + "com\\chaine\\created\\chaine_" +
				 * chaineId ++ + ".bpmn");
				 * 
				 * if (myFile.createNewFile()) { System.out.println("File created: " +
				 * myFile.getName()); } else { System.out.println("File already exists."); }
				 * 
				 * Desktop.getDesktop().open(myFile);
				 * 
				 * } catch (IOException e1) { System.out.println("An error occurred.");
				 * e1.printStackTrace(); }
				 */
			}
			
		});
		contentPane.add(createChaine);
		
		
		
		listOfChainesComboBox = new JComboBox();
		listOfChainesComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listOfChainesComboBox.setBounds(9, 150, 291, 46);
		contentPane.add(listOfChainesComboBox);
		
		
		
		JButton loadSelectedChaine = new JButton("Load selected chaine ");
		loadSelectedChaine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		loadSelectedChaine.setBounds(310, 149, 193, 49);
		loadSelectedChaine.addActionListener(new ActionListener() {
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
		contentPane.add(loadSelectedChaine);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Delete Selected Chaine");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ComboItem comboItem = (ComboItem) listOfChainesComboBox.getSelectedItem();

				try {
					BdQueries.deleteChaine(comboItem.getKey());
					listOfChainesComboBox.removeItem(comboItem);
					

					// Creating a File object for directory
					File directoryPath = new File(PROJECT_PATH + "com\\chaine\\loaded");
					// List of all files and directories
					File filesList[] = directoryPath.listFiles();

					System.out.println("List of files  in the specified directory:");

					for (File file : filesList) {
						
						if (file.isFile() && file.getName().equals(comboItem.getValue())) {
							file.delete();
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton.setBounds(722, 148, 191, 51);
		contentPane.add(btnNewButton);
		
		JButton loadAll = new JButton("Load All");
		loadAll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		loadAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					List<Chaine> listChaine = BdQueries.loadALLChaine();

					for (Chaine chaine : listChaine) {
						
						InputStream in = chaine.getBlob().getBinaryStream();

						File myFile = new File(PROJECT_PATH + "com\\chaine\\loaded\\" + chaine.getName());

						myFile.createNewFile();
						OutputStream out;

						out = new FileOutputStream(myFile);

						byte[] buff = new byte[4096]; // how much of the blob to read/write at a time
						int len = 0;

						while ((len = in.read(buff)) != -1) {
							out.write(buff, 0, len);
						}

						//Desktop.getDesktop().open(myFile);
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		loadAll.setBounds(310, 208, 193, 43);
		contentPane.add(loadAll);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 115, 968, 2);
		contentPane.add(separator);
		
		JButton updateAll = new JButton("Update All");
		updateAll.setFont(new Font("Tahoma", Font.PLAIN, 14));
		updateAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				// Creating a File object for directory
				File directoryPath = new File(PROJECT_PATH + "com\\chaine\\loaded");
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
							
							br.close();
							
							String everything = sb.toString();

							BdQueries.insertChaine(file, everything);


						} catch (IOException e1) {
							e1.printStackTrace();
						}

					}

				}

				
			}
		});
		updateAll.setBounds(520, 208, 191, 43);
		contentPane.add(updateAll);
		
		for (ComboItem comboitem : BdQueries.getListOfChaines()) {
			listOfChainesComboBox.addItem(comboitem );
		} 
	}
}
