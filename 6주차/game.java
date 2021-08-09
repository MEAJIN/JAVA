import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.*;

class vehicle extends JFrame{
   int x =100; //��ü â�� �ʱⰪ
   
   //���⼭ �������� ���� : �� ���� ��ü���� �� ���� x��ǥ���� �����ϱ� ������
   
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

class car extends vehicle{ // car�� vehicle�� ��ӹ޴´�

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

class bus extends vehicle{ // bus�� vehicle�� ��ӹ޴´�
   
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
                                                                                              
class truck extends vehicle{ // truck�� vehicle�� ��ӹ޴´�

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
   
      vehicle a[]=new vehicle[3]; //��ü �迭����
      
      a[0]=new bus("bus"); //bus ��ü ����
      a[1]=new car("car"); //car ��ü ����
      a[2]=new truck("truck"); //truck ��ü ����
      
      int x1=a[0].x; //bus ��ü Frame x��ǥ �ʱⰪ
      int x2=a[1].x; ///car ��ü Frame x��ǥ �ʱⰪ
      int x3=a[2].x; //truck ��ü Frame x��ǥ �ʱⰪ
      
      Random generator = new Random();  //�����߻���Ű�� ���� random ��ü ����
           

   while(x1<= 1500||x2<=1500||x3<=1500) { //bus,car,truck ��ü�� x���� 1500 ���� �϶����� ����
      //���� �ϳ��� 1500 �̻��� �Ǹ� �ݺ����� ���߰Ե�
      
      int r1 =generator.nextInt(4) + 1; //1~4 ������ ���� �߻�
      int r2 =generator.nextInt(2) + 1; //1~2
      int r3 =generator.nextInt(3) +1;  //1~3   
      
      //���� ������ �߻����ѵ� ������ ������ Ȯ���ϰ� ���и� ������ �� �ֵ��� �� �� �ٸ� ���� ����������
      
      x1= x1+ r1; //������ x��ǥ�� ����ؼ� ������ ������
      x2= x2+ r2;
      x3= x3+ r3;

      
      a[0].setLocation(x1, 300); //����� x������ â�� ��ġ�� ����
      a[1].setLocation(x2, 500);
      a[2].setLocation(x3, 700);
   
   
      JFrame frame = new JFrame();
      
      if(x1>=1500) { //���� ������ x��ǥ�� ���� 1500�� �ȴٸ�
         JLabel lb = new JLabel("  "+"Bus win ! Game over");
         frame.add(lb);
         frame.setSize(150, 100);
         frame.setLocation(700,500);
         frame.setVisible(true);
         break;
      }
      
       if(x2>= 1500) {//���� car�� x��ǥ�� ���� 1500�� �ȴٸ�
         JLabel lb = new JLabel("  "+"Car win ! Game over");
         frame.add(lb);
         frame.setSize(150, 100);
         frame.setLocation(700,500);
         frame.setVisible(true);
         break;
      }
       
      if(x3>=1500) {//���� Ʈ���� x��ǥ�� ���� 1500�� �ȴٸ�
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
