import java.util.Scanner;
import java.io.File;
class homework1{
	public static int printANDLinecount(String fname)throws Exception{//顯示和列計算
		Scanner scan = new Scanner(new File(fname));
		int count=0;
		while (scan.hasNextLine()){
			count++;
			System.out.println(scan.nextLine());
			}
		scan.close();
		return count;
	}
	
	public static int Wordcount(String fname)throws Exception{//單字計算
		Scanner scan = new Scanner(new File(fname));
		int count=0;
		while (scan.hasNext()){
			count++;
			scan.next();
			}
		scan.close();
		return count;
	}
	
	public static int Numcount(String fname)throws Exception{//數字計算
		Scanner scan = new Scanner(new File(fname));
		int count=0;
		while (scan.hasNext()){
			if(scan.hasNextInt()||scan.hasNextDouble())
			count++;
			scan.next();
		}
		scan.close();
		return count;
	}
	public static void printAllcount(int Lines,int Words,int Nums){//顯示總數
		System.out.printf("Line:");
		System.out.println(Lines);
		System.out.printf("Word:");
		System.out.println(Words);
		System.out.printf("num:");
		System.out.println(Nums);
	
	}
	public static void main(String[] args)throws Exception{
		int Linecount;
		int Wordcount;
		int Numcount;
		String fname=args[0];
		Linecount=printANDLinecount(fname);
		Wordcount=Wordcount(fname);
		Numcount=Numcount(fname);
		printAllcount(Linecount,Wordcount,Numcount);
	}
}	