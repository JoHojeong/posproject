package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class iceTea

{
	
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public iceTea() throws IOException {
		System.out.println("������ �ݾ�:  ");
		price = Integer.parseInt(in.readLine());
		System.out.println("�Ž������� " + (price-1000) +"�Դϴ�.");
	}
}

class ac
{
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public ac() throws IOException {
		System.out.print("�����ѱݾ� : ");
		price = Integer.parseInt(in.readLine());
		System.out.println("�Ž������� " + (price-2000) + "�Դϴ�.");
	}
}

class bbTea
{
	private int price;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public bbTea() throws IOException {
		System.out.print("�����ѱݾ� : ");
		price = Integer.parseInt(in.readLine());
		System.out.println("�Ž������� " + (price-3000) + "�Դϴ�.");
	}
}

class sum
{
	public void price()
	{
		System.out.println("�հԴ� " + iceTea);
	}
}



public class Ex07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("1.�Ƹ޸�ī�� : 1000�� 2.���̽�Ƽ : 2000��  3.����Ƽ : 3000�� 0.����");
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
		System.out.println("���α׷��� �����մϴ�.");

	}

}
