import org.json.simple.JSONObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GuiApp extends JFrame {
	
	private JSONObject footbalData;
	private JSONObject[]  footbalDatas;


	public GuiApp() {
		// Setup GUI and Add a Title
		super("برنامه فوتبال");
		
		// Config Gui end program it has been closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set the Size of Our GUI (in Pixels)
		setSize(580,550);
		
		// Load Our Application at the Center of Screen
		setLocationRelativeTo(null);
		
		// set manually position Our Components
		setLayout(null);
		
		// Prevent any Resize
		setResizable(false);
		
		addGuiComponents();
	}

	private void addGuiComponents() {
		JTextArea jLabel0 = new JTextArea("");

		//jLabel0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jLabel0.setBackground(Color.BLUE);
		jLabel0.setBounds(150, 100, 250, 80);

		add(jLabel0);

		JTextArea jLabel1 = new JTextArea("");

		//jLabel0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jLabel1.setBackground(Color.BLUE);
		jLabel1.setBounds(150, 200, 250, 80);

		add(jLabel1);

		JTextArea jLabel2 = new JTextArea("");

		//jLabel0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jLabel2.setBackground(Color.BLUE);
		jLabel2.setBounds(150, 300, 250, 80);

		add(jLabel2);

		// Search Button
		JButton searchButton = new JButton("Africa");
				
		searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
		searchButton.setBounds(440, 14, 90, 45);
		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				        footbalDatas=FootballAppAPI.getFootballData("Africa");
						footbalData = footbalDatas[0];
						String text="\n"+"                              "+footbalData.get("time")+"\n"
								+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
						jLabel0.setText(text);

				footbalData = footbalDatas[1];
				String text1="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel1.setText(text1);

				footbalData = footbalDatas[2];
				String text2="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel2.setText(text2);


			}
		});

		add(searchButton);

		JButton searchButton1 = new JButton("Bolivia");

		searchButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		searchButton1.setBounds(350, 14, 90, 45);
		searchButton1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						footbalDatas = FootballAppAPI.getFootballData("Bolivia");
						footbalData = footbalDatas[0];
						String text="\n"+"                              "+footbalData.get("time")+"\n"
								+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
						jLabel0.setText(text);

						footbalData = footbalDatas[1];
						String text1="\n"+"                              "+footbalData.get("time")+"\n"
								+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
						jLabel1.setText(text1);

						footbalData = footbalDatas[2];
						String text2="\n"+"                              "+footbalData.get("time")+"\n"
								+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
						jLabel2.setText(text2);


					}
				});

		add(searchButton1);

		JButton searchButton2 = new JButton("Belgium");

		searchButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		searchButton2.setBounds(260, 14, 90, 45);
		searchButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				footbalDatas = FootballAppAPI.getFootballData("Belgium");
				footbalData = footbalDatas[0];
				String text="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel0.setText(text);

				footbalData = footbalDatas[1];
				String text1="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel1.setText(text1);

				footbalData = footbalDatas[2];
				String text2="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel2.setText(text2);

			}
		});

		add(searchButton2);


		JButton searchButton3 = new JButton("Australia");

		searchButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		searchButton3.setBounds(180, 14, 90, 45);
		searchButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				footbalDatas = FootballAppAPI.getFootballData("Australia");
				footbalData = footbalDatas[0];
				String text="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel0.setText(text);

				footbalData = footbalDatas[1];
				String text1="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel1.setText(text1);

				footbalData = footbalDatas[2];
				String text2="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel2.setText(text2);


			}
		});

		add(searchButton3);


		JButton searchButton4 = new JButton("Argentina");

		searchButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		searchButton4.setBounds(90, 14, 90, 45);
		searchButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				footbalDatas = FootballAppAPI.getFootballData("Argentina");

				footbalData = footbalDatas[0];
				String text="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel0.setText(text);

				footbalData = footbalDatas[1];
				String text1="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel1.setText(text1);

				footbalData = footbalDatas[2];
				String text2="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel2.setText(text2);



			}
		});

		add(searchButton4);


		JButton searchButton5 = new JButton("England");

		searchButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		searchButton5.setBounds(10, 14, 90, 45);
		searchButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				footbalDatas = FootballAppAPI.getFootballData("England");
				footbalData = footbalDatas[0];
				String text="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel0.setText(text);

				footbalData = footbalDatas[1];
				String text1="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel1.setText(text1);

				footbalData = footbalDatas[2];
				String text2="\n"+"                              "+footbalData.get("time")+"\n"
						+"                          "+footbalData.get("code1")+"    " +footbalData.get("result")+"   "+footbalData.get("code2")+"\n"+"                      "+footbalData.get("name");
				jLabel2.setText(text2);


			}
		});

		add(searchButton5);




		
	}
	private ImageIcon loadImage(String resourcePath) {
		try {
			BufferedImage image = ImageIO.read(new File(resourcePath));
			return new ImageIcon(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Could not find resource file");
		return null;
	}
}
