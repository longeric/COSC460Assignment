import java.io.*;
//no more test

public class Assi0 {
	
	public static void main(String[] args){
		
		String savedWord[] = new String[60];
		int number[] = new int[60];
		for(int i=0;i<60;i++)
		{
			savedWord[i]="";
			number[i]=0;
		}

		String filename = "plain.txt";
			
		
		String str = "";
		String str1 = "";
		try{
			
			//File file = new File("F:/plain.txt");
			FileReader fr = new FileReader(filename);
			//fis = new FileInputStream("F:/plain.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((str=br.readLine())!=null)
			{
				String temp[] = str.split(" \n | \\. | ! | \" ");
				for(int i=0;i<temp.length;i++)
				{
					for(int j=0;j<savedWord.length;j++)
					{
							if(temp[i] != savedWord[j])
							{
								savedWord[i] = temp[i];
								number[i]++;
							}
					}
				}
				
				str1 +=str.trim();
			
			}
			System.out.println(str1);
		
			br.close();
			
			
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Unable to open file " );     
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
