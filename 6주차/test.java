import java.awt.Graphics;
import javax.swing.*;
import java.util.*;

abstract class Sprite {
	int x = 3, y = 3;
	abstract void move (char c);
}

class Main extends Sprite {
	void move (char c) {
		if (c == 'a') {
			if (x > 0) {
				--x;
			}
		}
		else if (c == 'w') {
			if (y > 0) {
				--y;
			}
		}
		else if (c == 's') {
			if (y < 7) {
				++y;
			}
		}
		else if (c == 'd') {
			if (x < 18) {
				++x;
			}
		}		
	}	
}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}
	void move (char c) {
		if (x == 18) {
			--x;
		}
		else if (y == 7) {
			--y;
		}
		else if (x == 0) {
			++x;
		}
		else if (y == 0) {
			++y;
		}
		else {
			x += (Math.random()-0.5)>0? 1:-1;
			y += (Math.random()-0.5)>0? 1:-1;
		}
	}
}

class Gold {
	int x, y;

	public Gold() {
		x = 2;
		y = 6;
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		Monster monster = new Monster();
		Gold gold = new Gold();
		while (true) {
			System.out.println("#####################");
			for (int i = 0 ; i < 8 ; i++) {
				System.out.print("#");
				for (int j = 0 ; j < 19 ; j++) {
					if ((i == main.y) && (j == main.x)) {
						System.out.print("@");
					}
					else if ((i == monster.y) && (j == monster.x)) {
						System.out.print("M");
					}
					else if ((i == gold.y) && (j == gold.x)) {
						System.out.print("G");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("#");
			}
			System.out.println("#####################");
			if ((monster.x == main.x)&&(monster.y == main.y)) {
				break;
			}
			else if ((gold.x == main.x)&&(gold.y == main.y)) {
				break;
			}
			
			System.out.print("왼쪽(a), 위쪽(w), 아래쪽(s), 오른쪽(d) :");
			char c = sc.next().charAt(0);
			main.move(c);
			monster.move(c);
		}
	}
}