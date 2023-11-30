package menuApp;
//import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class categoryFrame extends JFrame {
	startFrame sf;
	resultFrame rf;
	
	public categoryFrame(startFrame sf) {
		setTitle("저메추 해드릴까요?");
		this.sf =sf;
		
		this.setBounds(100, 100, 862, 496);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rf = new resultFrame(this);
		
		getContentPane().setLayout(null);
		
		JPanel panel_category = new JPanel();
		panel_category.setBounds(55, 114, 475, 290);
		getContentPane().add(panel_category);
		panel_category.setLayout(null);
		
		JButton btn_korean = new JButton("한식");
		btn_korean.setFont(new Font("굴림", Font.BOLD, 20));
		btn_korean.setBounds(18, 10, 140, 113);
		panel_category.add(btn_korean);
		
		JButton btn_chinese = new JButton("중식");
		btn_chinese.setFont(new Font("굴림", Font.BOLD, 20));
		btn_chinese.setBounds(171, 10, 140, 113);
		panel_category.add(btn_chinese);
		
		JButton btn_japanese = new JButton("일식");
		btn_japanese.setFont(new Font("굴림", Font.BOLD, 20));
		btn_japanese.setBounds(323, 10, 140, 113);
		panel_category.add(btn_japanese);
		
		JButton btn_western = new JButton("양식");
		btn_western.setFont(new Font("굴림", Font.BOLD, 20));
		btn_western.setBounds(95, 154, 140, 113);
		panel_category.add(btn_western);
		
		JButton btn_all = new JButton("모두");
		btn_all.setFont(new Font("굴림", Font.BOLD, 20));
		btn_all.setBounds(247, 154, 140, 113);
		panel_category.add(btn_all);
		
		JPanel panel_bookmark = new JPanel();
		panel_bookmark.setBounds(605, 114, 147, 290);
		getContentPane().add(panel_bookmark);
		panel_bookmark.setLayout(null);
		
		JButton btn_bookmark = new JButton("<html><body><center>즐겨찾기<br>목록</center></body></html>");
		btn_bookmark.setFont(new Font("굴림", Font.BOLD, 20));
		btn_bookmark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_bookmark.setBounds(5, 10, 130, 65);
		panel_bookmark.add(btn_bookmark);
		
		JLabel lb_category = new JLabel("카테고리 선택");
		lb_category.setFont(new Font("굴림", Font.BOLD, 30));
		lb_category.setBounds(75, 30, 256, 62);
		getContentPane().add(lb_category);
		
		//버튼 이벤트 처리
		btn_korean.addActionListener(new btnActionListener());
		btn_chinese.addActionListener(new btnActionListener());
		btn_japanese.addActionListener(new btnActionListener());
		btn_western.addActionListener(new btnActionListener());
		btn_all.addActionListener(new btnActionListener());
		btn_bookmark.addActionListener(new btnActionListener());
	}
	
	//버튼 클릭 이벤트 처리
	private class btnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("한식")) {
			}
			else if(b.getText().equals("중식")) {
				
			}
			else if(b.getText().equals("일식")) {
				
			}
			else if(b.getText().equals("양식")) {
				
			}
			else if(b.getText().equals("모두")) {
				
			}
			rf.setVisible(true);
			setVisible(false);
		}
	}
	
	/*
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					categoryFrame window = new categoryFrame();
					window.this.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	//}
}


