package BullsAndCows;// ������� �����
import java.util.Scanner;//������ ���������
public class Level3 
{
public static void Player1(){
	System.out.println("�����1 ������ ������� ��������� 3");
	System.out.println("�����1, ������� ���������� �����, �� �� ����������� ��� ������2:");
	Scanner console = new Scanner(System.in);  // ������ ������ Scanner
	while (console.hasNextInt()){
		int p1 = console.nextInt();  // ����� � ���������� ����� ������1
		if (p1 >= 100 && p1 <=999){
			int a = p1%1000/100;
			int b = p1%100/10;
			int c = p1%10;
			int i = 0;
			if (a == b || a == c || b == c)
				System.out.println("�����1, ����� � ����� �� ������ �����������!");
			else {
				System.out.println("�����1, ������� �����");
				System.out.println("�����2, ������ ��������� �����:");
					while (console.hasNextInt()){	
						int p2 = console.nextInt();
						if (p1 >= 100 && p1 <=999){
							int a1 = p2%1000/100;
							int b1 = p2%100/10;
							int c1 = p2%10;
							i++;
							int cows = 0;
							int bulls = 0;
							String bull = " ���� � ";
							String cow = " ������";
							if (p1 == p2){
								System.out.println("������!!!  ���������� ������� "+ i);
								System.out.println("������� ����� ����� ��� ������ � ���� �������");
								continue;
								}
							else {
								if (a == a1) 
									bulls=bulls+1;
      								if (a == b1)  
       									cows=cows+1; 
								if (a == c1)
									cows=cows+1;
								if (b == b1) 
									bulls=bulls+1;
      								if (b == a1)  
       									cows=cows+1; 
								if (b == c1)
									cows=cows+1; 
								if (c == c1) 
									bulls=bulls+1;
      								if (c == a1)  
       									cows=cows+1; 
								if (c == b1)
									cows=cows+1;
								if (bulls == 0)
									bull = " ����� � ";
								if (bulls == 1)
									bull = " ��� � ";
								if (cows == 0)
									cow = " �����";
								if (cows == 1)
									cow = " ������";
								System.out.println(bulls + bull + cows + cow);
								}						
						}
						else
							System.out.println("�����2, ������� ���������� �����");
					}
				}
		}
		else
			System.out.println("�����1, ������� ���������� �����");
			
 	}
 }	
}