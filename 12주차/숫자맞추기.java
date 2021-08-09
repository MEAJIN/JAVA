 import java.awt.*; 
 import java.awt.event.*; 
 import java.util.*; 
 import javax.swing.*; 

 public class a22 extends JFrame implements KeyListener, MouseListener { 

   Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();    // ȭ�� �ػ� 

   Container con = getContentPane();  // ���� ������ �����̳� 
   
   BorderLayout bl = new BorderLayout(5, 5); // ���� ������ ���̾ƿ� �������̾ƿ� 

   
   JPanel topPanel = new JPanel(); // topPanel��� �г� ��ü ����
   GridLayout topLayout = new GridLayout(1, 2, 5, 5); // ��� �гα��� 1�� 2�� ������ 5��
   JLabel lbl01 = new JLabel("���ڸ� �����Ͽ� �ۼ��ϼ���! : "); 
   JTextField tfAnswer = new JTextField(10);  // ���ڰ� �Էµ� �ؽ�Ʈ �ʵ�. ���ڼ���  10����
   JLabel lbl02 = new JLabel("", SwingConstants.CENTER); // �ϴ� �г� 
   
   
   JPanel bottomPanel = new JPanel(); // bottomPanel�̶�� �г� ��ü ���� 
   GridLayout bottomLayout = new GridLayout(1, 2, 5, 5); // ��ư�� 1�� 2�� ������ 5��
   JButton btnAgain = new JButton("�ٽ� �ѹ�"); 
   JButton btnExit = new JButton("����"); 

   Random rand = new Random(); // ���� �߻��� ����Ŭ���� 
   int number = rand.nextInt(100);  // �߻��� ���� ������ ���� 
   int count = 0;  // �õ�Ƚ�� 

   
   a22() { // ������ ������(������ �ʱ�ȭ) 

     this.setTitle("���� ����");   // ������ ����� ���� �ػ��� ������ 

     this.setSize((int) screen.getWidth() / 7, (int) screen.getHeight() / 7);  // ������ ��ġ 

     this.setLocation((int) screen.getWidth() / 2, 

		(int) screen.getHeight() / 2); // ������ �� X��ư ������ ���α׷� ���� 

     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������Ʈ �ʱ�ȭ 

     init(); 

     this.setVisible(true); 
     this.requestFocus(); // ���� ���� ��� 

     System.out.println("������ : " + number); 

  } 

  // ������Ʈ �ʱ�ȭ 

  private void init() { 

    // ��ü ���̾ƿ� �������̾ƿ� 

    con.setLayout(bl); 

    // ��� �г� 

    topPanel.add(lbl01); 

    topPanel.add(tfAnswer); 

    con.add(topPanel, "North"); 

    // �߾� �г�

    lbl02.setOpaque(true); 

    con.add(lbl02, "Center"); 

    // �ϴ�  �г�

    bottomPanel.add(btnAgain); 

    bottomPanel.add(btnExit); 

    con.add(bottomPanel, "South"); 

    // �亯ĭ Ű���� ������ ��� 

    // �侲�� ���͸� ó�� 

    tfAnswer.addKeyListener(this); 

    // �ٽ��ѹ�, ���� ��ư ���콺 ������ ��� 

    btnAgain.addMouseListener(this); 

    btnExit.addMouseListener(this); 

 } 

 public void mouseClicked(MouseEvent arg0) { 

 }  // ���콺 �̺�Ʈ ó�� 

 public void mouseEntered(MouseEvent arg0) { 

 }  // �ٽ��ѹ� �������� 

 public void mouseExited(MouseEvent arg0) { 

 } // �亯ĭ �������� �ʱ�ȭ 

 public void mouseReleased(MouseEvent arg0) { 

 } // ���� �ٽ� ���� 
 

 public void mousePressed(MouseEvent arg0) { 

   if (btnAgain == arg0.getSource()) { 

     number = rand.nextInt(100); 

     System.out.println("���� �ٽ� �߻�! : " + number); 

     tfAnswer.setText(""); 

     // ���� ��ư 

     // ���� ��ư ������ �� ���� 

     } else if (btnExit == arg0.getSource()) { 

     System.exit(0); 

  } 

 } 

 public void keyPressed(KeyEvent e) { // �ؽ�Ʈ �ʵ忡�� �̺�Ʈ�� �Ͼ�� ���͸� �������� 

   if (tfAnswer == e.getSource() && e.getKeyCode() == 10) { 

     count++; 

     if (Integer.valueOf(tfAnswer.getText()) == number) { // ������ ���� ���̸� ���� 

       lbl02.setBackground(Color.gray); 

       lbl02.setForeground(Color.blue); 

       lbl02.setText("�����Դϴ�."); 

       System.out.println(count + "�� ���� ����!"); 

       } else if (Integer.valueOf(tfAnswer.getText()) > number) { // ũ�� Ů�ϴ�. 

       lbl02.setBackground(Color.orange); 

       lbl02.setText("���ڰ� Ů�ϴ�."); 

       System.out.println("�õ� Ƚ�� : " + count); 

       } else {   // ������ �۽��ϴ�. 

       lbl02.setBackground(Color.orange); 

       lbl02.setText("���ڰ� �۽��ϴ�."); 

       System.out.println("�õ� Ƚ�� : " + count); 

    } 

 } 

 } 

 public void keyReleased(KeyEvent e) { 

 } // Ű���带 ������ ������ �� ���� ȣ�� �Ǵ� �̺�Ʈ

 public void keyTyped(KeyEvent e) { 

 } // Ű���带 ���� �� ���� ȣ��ǳ�, ctrl, shift, art�� ���� actionŰ�� ���� �ȴ�.

 public static void main(String[] args) { 

   new a22(); // ������ a22ȣ��

 } 
 } 

