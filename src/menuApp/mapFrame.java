package menuApp;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.EventQueue;

public class mapFrame extends JFrame {

	private JFrame frame;
	
	public mapFrame() {
		frame = new JFrame();
		frame.setTitle("저메추 해드릴까요?");
		frame.setBounds(100, 100, 912, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_close = new JButton("종료");
		btn_close.setFont(new Font("굴림", Font.BOLD, 20));
		btn_close.setBounds(725, 432, 161, 64);
		frame.getContentPane().add(btn_close);
		
		JButton btn_recmd = new JButton("<html><body><center>다른 메뉴<br>추천 받기</center></body></html>");
		btn_recmd.setFont(new Font("굴림", Font.BOLD, 20));
		btn_recmd.setBounds(725, 327, 161, 95);
		frame.getContentPane().add(btn_recmd);
		
		JLabel lb = new JLabel("내 주변 식당");
		lb.setFont(new Font("굴림", Font.BOLD, 30));
		lb.setBounds(68, 62, 462, 64);
		frame.getContentPane().add(lb);
	}
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapFrame window = new mapFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
}
