package menuApp;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;

public class resultFrame extends JFrame {
	private categoryFrame cf;

	//private JFrame frame;
	public resultFrame(categoryFrame cf) {
		this.cf = cf;
		//frame = new JFrame();
		setTitle("저메추 해드릴까요?");
		setBounds(100, 100, 928, 566);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel_result = new JPanel();
		panel_result.setToolTipText("image");
		panel_result.setBounds(70, 140, 350, 350);
		getContentPane().add(panel_result);
		panel_result.setLayout(null);
		
		JPanel panel_btn = new JPanel();
		panel_btn.setBounds(452, 140, 428, 350);
		getContentPane().add(panel_btn);
		
		
		ImageIcon icon1 = new ImageIcon("./images/heart.png");
		ImageIcon icon2 = new ImageIcon("./images/heart2.png");
		
		Image img1 = icon1.getImage();		// 이미지로 변경 후 이미지 크기 조절 후 다시 이미지아이콘으로 변경
		Image img2 = icon2.getImage();
		img1 = img1.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		img2 = img2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		
		final ImageIcon Icon1 = new ImageIcon(img1);
		final ImageIcon Icon2 = new ImageIcon(img2);
		icon1 = new ImageIcon(img1);
		
		JButton btn_bookmark = new JButton(Icon1);		// 즐겨찾기 버튼
		
		btn_bookmark.addActionListener(new ActionListener() {	// 즐겨찾기 버튼 이벤트
			private boolean bookmark = false;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bookmark = !bookmark;
				if(bookmark) {
					btn_bookmark.setIcon(Icon2);
					// 즐겨찾기에 추가하는 기능
				}
				else {
					btn_bookmark.setIcon(Icon1);
					// 즐겨찾기에서 삭제하는 기능 ?
				}
			}
		});
		btn_bookmark.setBounds(22, 10, 60, 60);
		btn_bookmark.setForeground(new Color(0, 0, 0));
		btn_bookmark.setBackground(new Color(240, 240, 240));
		btn_bookmark.setFont(new Font("굴림", Font.BOLD, 20));
		
		JButton btn_close = new JButton("종료");
		btn_close.setBounds(211, 235, 180, 84);
		btn_close.setFont(new Font("굴림", Font.BOLD, 20));
		panel_btn.setLayout(null);
		panel_btn.add(btn_bookmark);
		
		
		JButton btn_hsu = new JButton("<html><body><center>한성대 주변<br>식당 보기</center></body></html>");
		btn_hsu.setBounds(214, 79, 177, 114);
		btn_hsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 프레임 전환
			}
		});
		
		JButton btn_near = new JButton("<html><body><center>내 주변<br>식당 보기</center></body></html>");
		btn_near.setBounds(22, 79, 180, 114);
		btn_near.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 프레임 전환
			}
		});
		btn_near.setFont(new Font("굴림", Font.BOLD, 20));
		panel_btn.add(btn_near);
		btn_hsu.setFont(new Font("굴림", Font.BOLD, 20));
		panel_btn.add(btn_hsu);
		panel_btn.add(btn_close);
		
		JButton btnNewButton_3 = new JButton("다시 추천 받기");
		btnNewButton_3.setBounds(22, 235, 180, 84);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 20));
		panel_btn.add(btnNewButton_3);
		
		JLabel lb_result = new JLabel("(추천 결과)  당첨!");
		lb_result.setFont(new Font("굴림", Font.BOLD, 35));
		lb_result.setBounds(70, 50, 363, 80);
		getContentPane().add(lb_result);
		
		
		// 버튼 클릭 이벤트 처리
		//private class btnActionListener implements ActionListener {
		//	public void actionPerformed(ActionEvent e) {
		//		}
		//}
	
	/*
	 public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resultFrame window = new resultFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

}
