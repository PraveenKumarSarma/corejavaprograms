import java.io.*;
class  Test12
{
	public static void main(String[] args) 
	{
		try(FileInputStream fis = new FileInputStream("abc.txt"))
		{
			System.out.println("File data reading code ...");
		}
		
	}
}
