import java.io.*;
//test the github's work

public class Assi0 {
	
	public static void readTextfile(String[] args){
		
		FileInputStream fis = null;
		
		BufferedReader br = null;
		InputStreamReader isr = null;
		String savedWord[] = new String[60];
		int number[] = new int[60];
		try{
			FileReader fr = new FileReader("File.txt");
			String str = "";
			String str1 = "";
			fis = new FileInputStream("C:\\plain.txt");
			isr = new InputStreamReader(fis);
			//isr = new FileInputStream(new File("D:/text.txt"));
			br = new BufferedReader(isr);
			//br = new BufferedReader(new FileReader("Test.txt"));
			while((str=br.readLine())!=null){
				String temp[] = str.split(" '| |!| \" ");
				for(int i=0;i<60;i++){
					
				
					if(temp[0] != savedWord[0]){
					
					}
				}
				
				str1 +=str.trim();
			
			}
			System.out.println(str1);
		} catch(FileNotFoundException e){
			System.out.println("Cannot find file");
		} catch(IOException e){
			System.out.println("Error");
		}
		finally{
			try{
				br.close();
				isr.close();
				fis.close();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}	
	
	public static void main(String[] args){
		
	}
}
