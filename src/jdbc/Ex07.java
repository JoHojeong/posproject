package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class iceTea

{
	
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public iceTea() throws IOException {
		System.out.println("지불한 금액:  ");
		price = Integer.parseInt(in.readLine());
		System.out.println("거스름돈은 " + (price-1000) +"입니다.");
	}
}

class ac
{
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public ac() throws IOException {
		System.out.print("지불한금액 : ");
		price = Integer.parseInt(in.readLine());
		System.out.println("거스름돈은 " + (price-2000) + "입니다.");
	}
}

class bbTea
{
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public bbTea() throws IOException {
		System.out.print("지불한금액 : ");
		price = Integer.parseInt(in.readLine());
		System.out.println("거스름돈은 " + (price-3000) + "입니다.");
	}
}

class sum
{
	public void price()
	{
		System.out.println("합게는 " + iceTea);
	}
}



public class Ex07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("1.아메리카노 : 1000원 2.아이스티 : 2000원  3.버블티 : 3000원 0.종료");
			int s = Integer.parseInt(in.readLine());
			if(s==1)
			{
				new iceTea();
			}
			if(s==2)
			{
				new ac();
			}
			if(s==3)
			{
				new bbTea();
			}
			if(s==0)
			{
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
