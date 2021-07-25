
import java.util.*;

public class Main
{
	
	public static void main(String[] args)
	{
		System.out.println("|-------------------------	|");
		System.out.println("| 请输入功能序号，按回车确认。	|");
		System.out.println("| 1 - 菜单 ----------------	|");
		System.out.println("| 2 - 设置 ----------------	|");
		System.out.println("| 3 - 帮助 ----------------	|");
		System.out.println("| 4 - 退出 ----------------	|");
		System.out.println("|-------------------------	|");
		
		while(true){
			scannerInput();
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{}
		}
	}
	
	private static void scannerInput(){
		try{
			Scanner scanner = new Scanner(System.in);
			
			switch(scanner.nextInt()){
				case 1:
					System.out.println();
					System.out.println("|--------------------|");
					System.out.println("| 1 - 加密");
					System.out.println("| 2 - 解密");
					System.out.println("|--------------------|");
					break;
				case 2:
					System.out.println("设置");
					break;
				case 3:
					System.out.println("联系管理员");
					break;
				case 4:
					System.out.println("Bye");
					break;
				default:
					System.out.println("输入序号错误，请重新输入！");
					break;
			}
		} catch (Exception e){
			System.out.println("请输入一个整数");
		}
	}
}
