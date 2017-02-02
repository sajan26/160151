java
import java.awt.*;
import javax.swing.*;

public class TestButton {
	public static void main(String[] args) {
		TestButtonMan tbm = new TestButtonMan();
	}
}

class TestButtonMan {
	// データ
	JFrame frame;
	JButton button;

	public TestButtonMan() {
	
		frame = new JFrame("TestButton");
		frame.setLocation(400, 400);		// 場所
		frame.setSize(400, 400);			// サイズ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Click Me!");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(button);

		
		frame.setVisible(true);
	}
}



- TestField.java


```java
import java.awt.*;
import javax.swing.*;

public class TestField {
	public static void main(String[] args) {
		TestFieldMan man = new TestFieldMan();
	}
}


class TestFieldMan {
	// データ
	JFrame frame;					// ウィンドウ
	JButton button;					// ボタン
	JTextField fileName;			// 文字を書くところ
	JPanel fieldPanel;				// パネル(ボタンをのせるもの)

	// メソッド
	public TestFieldMan() {
		// frameをつくる
		frame = new JFrame("TestField");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Click Me!");
		fileName = new JTextField("ALOHA", 20);
		fieldPanel = new JPanel();

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		fieldPanel.add(fileName);	// パネルにフィールドをのせる
		fieldPanel.add(button);		// パネルにボタンをのせる

		con.add(fieldPanel);		// ウィンドウにパネルをのせる

		frame.setVisible(true);
	}
}
