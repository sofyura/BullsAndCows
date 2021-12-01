package BullsAndCows;// объявил пакет
import java.util.Scanner;//список библиотек
public class Level2 
{     
	public static void Player1(){
		System.out.println("Игрок1 выбрал уровень сложности 2");	
		System.out.println("Игрок1, введите загаданное число, но не показывайте его Игроку2:");
		Scanner console = new Scanner(System.in);
		while (console.hasNextInt()){
			int p1 = console.nextInt();  // читаю с клавиатуры число Игрока1
			if (p1 >= 10 && p1 <=99) {
				int a = p1 % 100 / 10; 
				int b = p1 % 10;
				int i = 0;
				if (a != b){
					System.out.println("Игрок1, загадал число");
					System.out.println("Игрок2, можете угадывать число:");
					while (console.hasNextInt()){
						int p2 = console.nextInt();
						if (p2 >= 10 && p2 <=99){
							int a1 = p2%100/10; 
							int b1 = p2%10;
							i++;
							int cows = 0;
							int bulls = 0;
							String bull = " бык и ";
							String cow = " коровы";
							if (p1 == p2){
								System.out.println("ПОБЕДА!!!  Количество попыток "+ i);
								System.out.println("Нажмите любую букву для выхода в меню уровней");
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
									bull = " быков и ";
								if (cows == 0)
									cow = " коров";
								if (cows == 1)
									cow = " корова";
								System.out.println(bulls + bull + cows + cow);
								}						
						}	
						else 
							System.out.println("Игрок2, введите двузначное число");
					}
				}
				else
					System.out.println("Игрок1, цифры в числе не должны повторяться!");
			}
			else
				System.out.println("Игрок1, введите двузначное число");
			
 		}
	}	
}