package BullsAndCows;// ������� �����
import java.util.Scanner;
import javax.swing.JFrame;//������ ���������
public class Start 
{     
public static void main(String[] args){

System.out.println("������������ � ����: ���� � ������!");
System.out.println();
Scanner console = new Scanner(System.in);
Menu.MenuGame();
	while (console.hasNextInt()){
		int level = console.nextInt();
		if (level == 1){
			Regulations.RegGame();
			Menu.MenuGame();
			continue;
			}
		if (level == 2){
			Level2.Player1();
			Menu.MenuGame();
			continue;
			}
		if (level == 3){
			Level3.Player1();
			Menu.MenuGame();
			continue;
			}
		if (level == 4){
			Level4.Player1();
			Menu.MenuGame();		
			continue;
			}
		else
			System.out.println("�� �� ������� �������! ������� 2, 3 ��� 4, ����� ������� �������. ��� ������� ����� �����, ����� �����, � ������� Enter");

		}
	new FrameWindows();
 }
}