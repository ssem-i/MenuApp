package menuApp;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.EventQueue;

public class mapHSUframe extends JFrame{

	private JFrame frame;

	public mapHSUframe() {
		frame = new JFrame();
		frame.setTitle("저메추 해드릴까요?");
		frame.setBounds(100, 100, 886, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_close = new JButton("종료");
		btn_close.setFont(new Font("굴림", Font.BOLD, 20));
		btn_close.setBounds(699, 378, 161, 64);
		frame.getContentPane().add(btn_close);
		
		JLabel lb = new JLabel("한성대 주변 식당");
		lb.setFont(new Font("굴림", Font.BOLD, 30));
		lb.setBounds(42, 48, 462, 64);
		frame.getContentPane().add(lb);
		
		JButton btn_recmd = new JButton("<html><body><center>다른 메뉴<br>추천 받기</center></body></html>");
		btn_recmd.setFont(new Font("굴림", Font.BOLD, 20));
		btn_recmd.setBounds(699, 273, 161, 95);
		frame.getContentPane().add(btn_recmd);
	}
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapHSUframe window = new mapHSUframe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
}
