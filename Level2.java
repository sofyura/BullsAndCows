package BullsAndCows;// ������� �����
import java.util.Scanner;//������ ���������
public class Level2 
{     
	public static void Player1(){
		System.out.println("�����1 ������ ������� ��������� 2");	
		System.out.println("�����1, ������� ���������� �����, �� �� ����������� ��� ������2:");
		Scanner console = new Scanner(System.in);
		while (console.hasNextInt()){
			int p1 = console.nextInt();  // ����� � ���������� ����� ������1
			if (p1 >= 10 && p1 <=99) {
				int a = p1 % 100 / 10; 
				int b = p1 % 10;
				int i = 0;
				if (a != b){
					System.out.println("�����1, ������� �����");
					System.out.println("�����2, ������ ��������� �����:");
					while (console.hasNextInt()){
						int p2 = console.nextInt();
						if (p2 >= 10 && p2 <=99){
							int a1 = p2%100/10; 
							int b1 = p2%10;
							i++;
							int cows = 0;
							int bulls = 0;
							String bull = " ��� � ";
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
								if (b == b1) 
									bulls=bulls+1;
								if (b == a1)
									cows=cows+1; 
								if (bulls == 0)
									bull = " ����� � ";
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
				else
					System.out.println("�����1, ����� � ����� �� ������ �����������!");
			}
			else
				System.out.println("�����1, ������� ���������� �����");
			
 		}
	}	
}