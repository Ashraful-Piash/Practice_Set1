package com.piash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class OnlineTest extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnBookmark;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	OnlineTest(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnBookmark = new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
		label.setBounds(30, 40, 450, 20);
		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 200, 20);
		radioButton[2].setBounds(50, 140, 200, 20);
		radioButton[3].setBounds(50, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnBookmark.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				btnBookmark.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set() {
		radioButton[4].setSelected(true);
		if (current == 0) {
			label.setText("Que1:  What is the capital of Bangladesh?");
			radioButton[0].setText("Noya Dilli");
			radioButton[1].setText("Dhaka");
			radioButton[2].setText("Sao Paolo");
			radioButton[3].setText("Buens Ayers");
		}
		if (current == 1) {
			label.setText("Que2:  Who is the T20 captain of Bangladesh?");
			radioButton[0].setText("Shakib Al Hasan");
			radioButton[1].setText("MahmudUllah");
			radioButton[2].setText("Tamim");
			radioButton[3].setText("Mushfiqur");
		}
		if (current == 2) {
			label.setText("Que3: Mahmud Ullah is the first centurian in World Cup for Bangaldesh");
			radioButton[0].setText("True");
			radioButton[1].setText("False");
			radioButton[2].setText("Don't know");
			radioButton[3].setText("May be");
		}
		if (current == 3) {
			label.setText("Que4: Who is the Highest Goal Scorrer of mens international football?");
			radioButton[0].setText("Piash");
			radioButton[1].setText("Lionel Messi");
			radioButton[2].setText("Cristiano Ronaldo");
			radioButton[3].setText("Swaran");
		}
		if (current == 4) {
			label.setText("Que5:  The constitution of bangladesh has been changed-");
			radioButton[0].setText(" Over 17 times");
			radioButton[1].setText("6 times");
			radioButton[2].setText("4 times");
			radioButton[3].setText("Over 20 times");
		}
		if (current == 5) {
			label.setText("Que6: 8 th test venue of Bangladesh");
			radioButton[0].setText("Sylhet International Stadium");
			radioButton[1].setText("Sher e Bangla");
			radioButton[2].setText("MA ajij");
			radioButton[3].setText("Outer Stadium");
		}
		if (current == 6) {
			label.setText("Que7:  Who is th PM of Bangladesh?");
			radioButton[0].setText("Khaleda zia");
			radioButton[1].setText("Sheikh Hasina");
			radioButton[2].setText("MIan al ruhaniyat");
			radioButton[3].setText("Ashraful Haque");
		}
		if (current == 7) {
			label.setText("Que8:  Corona Virus is known as");
			radioButton[0].setText("Covid 18");
			radioButton[1].setText("Covid 20");
			radioButton[2].setText("Cobid 19");
			radioButton[3].setText("None");
		}
		if (current == 8) {
			label.setText("Que9: Taliban is the new ruler of Afghanistan");
			radioButton[0].setText("true");
			radioButton[1].setText("false");
			radioButton[2].setText("don't know");
			radioButton[3].setText("false");
		}
		if (current == 9) {
			label.setText("Que10: Who is tha captaion of Indian Mens cricket team?");
			radioButton[0].setText("Virat Kohli");
			radioButton[1].setText("Babar Azam");
			radioButton[2].setText("Piash");
			radioButton[3].setText("Mashrafee");
		}
		label.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declaring right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[1].isSelected());
		if (current == 1)
			return (radioButton[1].isSelected());
		if (current == 2)
			return (radioButton[0].isSelected());
		if (current == 3)
			return (radioButton[2].isSelected());
		if (current == 4)
			return (radioButton[0].isSelected());
		if (current == 5)
			return (radioButton[0].isSelected());
		if (current == 6)
			return (radioButton[1].isSelected());
		if (current == 7)
			return (radioButton[2].isSelected());
		if (current == 8)
			return (radioButton[0].isSelected());
		if (current == 9)
			return (radioButton[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new OnlineTest("Online Test App");
	}

}
