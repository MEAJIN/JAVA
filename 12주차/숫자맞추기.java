 import java.awt.*; 
 import java.awt.event.*; 
 import java.util.*; 
 import javax.swing.*; 

 public class a22 extends JFrame implements KeyListener, MouseListener { 

   Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();    // 화면 해상도 

   Container con = getContentPane();  // 메인 프레임 컨테이너 
   
   BorderLayout bl = new BorderLayout(5, 5); // 메인 프레임 레이아웃 보더레이아웃 

   
   JPanel topPanel = new JPanel(); // topPanel라는 패널 객체 생성
   GridLayout topLayout = new GridLayout(1, 2, 5, 5); // 상단 패널구성 1행 2열 간격은 5씩
   JLabel lbl01 = new JLabel("숫자를 추측하여 작성하세요! : "); 
   JTextField tfAnswer = new JTextField(10);  // 숫자가 입력될 텍스트 필드. 글자수는  10까지
   JLabel lbl02 = new JLabel("", SwingConstants.CENTER); // 하단 패널 
   
   
   JPanel bottomPanel = new JPanel(); // bottomPanel이라는 패널 객체 생성 
   GridLayout bottomLayout = new GridLayout(1, 2, 5, 5); // 버튼은 1행 2열 간격은 5씩
   JButton btnAgain = new JButton("다시 한번"); 
   JButton btnExit = new JButton("종료"); 

   Random rand = new Random(); // 난수 발생용 랜덤클래스 
   int number = rand.nextInt(100);  // 발생한 난수 보관용 변수 
   int count = 0;  // 시도횟수 

   
   a22() { // 프레임 생성자(프레임 초기화) 

     this.setTitle("숫자 게임");   // 프레임 사이즈를 현재 해상도의 반으로 

     this.setSize((int) screen.getWidth() / 7, (int) screen.getHeight() / 7);  // 프레임 위치 

     this.setLocation((int) screen.getWidth() / 2, 

		(int) screen.getHeight() / 2); // 오른쪽 위 X버튼 누르면 프로그램 종료 

     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 컴포넌트 초기화 

     init(); 

     this.setVisible(true); 
     this.requestFocus(); // 최초 정답 출력 

     System.out.println("정답은 : " + number); 

  } 

  // 컴포넌트 초기화 

  private void init() { 

    // 전체 레이아웃 보더레이아웃 

    con.setLayout(bl); 

    // 상단 패널 

    topPanel.add(lbl01); 

    topPanel.add(tfAnswer); 

    con.add(topPanel, "North"); 

    // 중앙 패널

    lbl02.setOpaque(true); 

    con.add(lbl02, "Center"); 

    // 하단  패널

    bottomPanel.add(btnAgain); 

    bottomPanel.add(btnExit); 

    con.add(bottomPanel, "South"); 

    // 답변칸 키보드 리스너 등록 

    // 답쓰고 엔터만 처리 

    tfAnswer.addKeyListener(this); 

    // 다시한번, 종료 버튼 마우스 리스너 등록 

    btnAgain.addMouseListener(this); 

    btnExit.addMouseListener(this); 

 } 

 public void mouseClicked(MouseEvent arg0) { 

 }  // 마우스 이벤트 처리 

 public void mouseEntered(MouseEvent arg0) { 

 }  // 다시한번 눌렀을시 

 public void mouseExited(MouseEvent arg0) { 

 } // 답변칸 공백으로 초기화 

 public void mouseReleased(MouseEvent arg0) { 

 } // 난수 다시 생성 
 

 public void mousePressed(MouseEvent arg0) { 

   if (btnAgain == arg0.getSource()) { 

     number = rand.nextInt(100); 

     System.out.println("난수 다시 발생! : " + number); 

     tfAnswer.setText(""); 

     // 종료 버튼 

     // 종료 버튼 누르면 걍 종료 

     } else if (btnExit == arg0.getSource()) { 

     System.exit(0); 

  } 

 } 

 public void keyPressed(KeyEvent e) { // 텍스트 필드에서 이벤트가 일어나고 엔터를 눌렀을시 

   if (tfAnswer == e.getSource() && e.getKeyCode() == 10) { 

     count++; 

     if (Integer.valueOf(tfAnswer.getText()) == number) { // 난수랑 같은 같이면 정답 

       lbl02.setBackground(Color.gray); 

       lbl02.setForeground(Color.blue); 

       lbl02.setText("정답입니다."); 

       System.out.println(count + "번 만에 정답!"); 

       } else if (Integer.valueOf(tfAnswer.getText()) > number) { // 크면 큽니다. 

       lbl02.setBackground(Color.orange); 

       lbl02.setText("숫자가 큽니다."); 

       System.out.println("시도 횟수 : " + count); 

       } else {   // 작으면 작습니다. 

       lbl02.setBackground(Color.orange); 

       lbl02.setText("숫자가 작습니다."); 

       System.out.println("시도 횟수 : " + count); 

    } 

 } 

 } 

 public void keyReleased(KeyEvent e) { 

 } // 키보드를 누르다 떼었을 때 마다 호출 되는 이벤트

 public void keyTyped(KeyEvent e) { 

 } // 키보드를 누를 때 마다 호출되나, ctrl, shift, art와 같은 action키는 무시 된다.

 public static void main(String[] args) { 

   new a22(); // 생성자 a22호출

 } 
 } 

