
public class DuplicateOccuranceString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String Name = "Neeti";
		 char[] strChar = Name.toCharArray();
		 for(char c : strChar)
		 {
			 System.out.println(c);
		 }
		 for(int i= strChar.length-1 ; i>=0;i--)
		 {
			 System.out.println(strChar[i]);
		 }
			 
	}
}
