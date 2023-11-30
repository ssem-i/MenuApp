package menuApp;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class startFrame extends JFrame {

	private JFrame frame;
	
	public startFrame() {
		frame = new JFrame();
		frame.setTitle("저메추 해드릴까요?");
		frame.setBounds(100, 100, 755, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		categoryFrame cf = new categoryFrame(this);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 27, 729, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메뉴 추천 프로그램");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(234, 34, 260, 43);
		panel.add(lblNewLabel);
		
		JButton btn_start = new JButton("시작");
		btn_start.setFont(new Font("굴림", Font.BOLD, 20));
		btn_start.setBounds(149, 136, 189, 123);
		panel.add(btn_start);
		
		btn_start.addActionListener ( new ActionListener() {	// 시작버튼 이벤트처리
			public void actionPerformed(ActionEvent e) {
				cf.setVisible(true);
				frame.setVisible(false);
				
	
			}
		});
		JButton btn_close = new JButton("종료");
		btn_close.setFont(new Font("굴림", Font.BOLD, 20));
		btn_close.setBounds(399, 136, 197, 123);
		panel.add(btn_close);
		
		btn_close.addActionListener ( new ActionListener() {	// 종료버튼 이벤트처리
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
	
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startFrame window = new startFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
