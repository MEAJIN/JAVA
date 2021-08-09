import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.*;

class vehicle extends JFrame{
   int x =100; //전체 창의 초기값
   
   //여기서 선언해준 이유 : 각 각의 객체들은 다 같은 x좌표에서 시작하기 때문에
   
   public void paint(Graphics g){
	   
      super.paint(g);
      
      g.setColor(Color.BLACK);
      g.drawRect(20,100,100,50);
      g.drawArc(30,150,20,20,0,360);
      g.drawArc(90,150,20,20,0,360);
   }
   
   public vehicle(String s) {
	   
      super(s);
      
      setSize(300,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLocation(x,100);
      
      }
   }

class car extends vehicle{ // car가 vehicle을 상속받는다

	public void paint(Graphics g){
      
      g.setColor(Color.RED);
      g.fillArc(70,70,100,80,0,180);
      g.fillArc(20,101,200,100,0,180);
      
      g.setColor(Color.BLUE);
      g.fillArc(81,78,80,60,0,180);
     
      
      g.setColor(Color.BLACK);
      g.fillArc(35,140,35,35,0,360);
      g.fillArc(170,140,35,35,0,360);
    
   }

   public car(String s) { 
      super(s);
 
      }
   }

class bus extends vehicle{ // bus가 vehicle을 상속받는다
   
   public void paint(Graphics g){
   
      g.setColor(Color.ORANGE);
      g.fillRect(20,60,200,80);
      
      g.setColor(Color.BLUE);
      g.fillRect(180,70,30,50);
      g.fillRect(30,70,30,30);
      g.fillRect(65,70,30,30);
      g.fillRect(100,70,30,30);
      g.fillRect(135,70,30,30);
      
      g.setColor(Color.BLACK);
      g.fillArc(30,130,35,35,0,360);
      g.fillArc(175,130,35,35,0,360);
       
   }
   
   public bus(String s) {
      super(s);
      setLocation(x,300);
     
      }
   }
                                                                                              
class truck extends vehicle{ // truck이 vehicle을 상속받는다

   public void paint(Graphics g){
   
      g.setColor(Color.BLUE);
      g.fillRect(20,100,200,60);
      g.fillRect(160,50,60,50);
      
      g.setColor(Color.YELLOW);
      g.fillRect(170,60,40,35);
      
      g.setColor(Color.BLACK);
      g.fillArc(30,151,35,35,0,360);
      g.fillArc(180,151,35,35,0,360);
   }
   
   public truck(String s) {
      super(s);
      
      setLocation(x,500);
   
      }
   }



public class game {

   public static void main(String[] args) {
   
      vehicle a[]=new vehicle[3]; //객체 배열생성
      
      a[0]=new bus("bus"); //bus 객체 생성
      a[1]=new car("car"); //car 객체 생성
      a[2]=new truck("truck"); //truck 객체 생성
      
      int x1=a[0].x; //bus 객체 Frame x좌표 초기값
      int x2=a[1].x; ///car 객체 Frame x좌표 초기값
      int x3=a[2].x; //truck 객체 Frame x좌표 초기값
      
      Random generator = new Random();  //난수발생시키기 위해 random 객체 생성
           

   while(x1<= 1500||x2<=1500||x3<=1500) { //bus,car,truck 객체의 x값이 1500 이하 일때까지 실행
      //만약 하나라도 1500 이상이 되면 반복문은 멈추게됨
      
      int r1 =generator.nextInt(4) + 1; //1~4 사이의 난수 발생
      int r2 =generator.nextInt(2) + 1; //1~2
      int r3 =generator.nextInt(3) +1;  //1~3   
      
      //같은 난수를 발생시켜도 되지만 눈으로 확실하게 승패를 구분할 수 있도록 각 각 다른 난수 생성시켜줌
      
      x1= x1+ r1; //현재의 x좌표에 계속해서 난수를 더해줌
      x2= x2+ r2;
      x3= x3+ r3;

      
      a[0].setLocation(x1, 300); //변경된 x값으로 창의 위치를 변경
      a[1].setLocation(x2, 500);
      a[2].setLocation(x3, 700);
   
   
      JFrame frame = new JFrame();
      
      if(x1>=1500) { //만약 버스의 x좌표가 먼저 1500이 된다면
         JLabel lb = new JLabel("  "+"Bus win ! Game over");
         frame.add(lb);
         frame.setSize(150, 100);
         frame.setLocation(700,500);
         frame.setVisible(true);
         break;
      }
      
       if(x2>= 1500) {//만약 car의 x좌표가 먼저 1500이 된다면
         JLabel lb = new JLabel("  "+"Car win ! Game over");
         frame.add(lb);
         frame.setSize(150, 100);
         frame.setLocation(700,500);
         frame.setVisible(true);
         break;
      }
       
      if(x3>=1500) {//만약 트럭의 x좌표가 먼저 1500이 된다면
         JLabel lb = new JLabel("  "+"Truck win ! Game over");
         frame.add(lb);
         frame.setSize(150, 100);
         frame.setLocation(700,500);
         frame.setVisible(true);
         break;
      }
   
   }
   

   }

}
