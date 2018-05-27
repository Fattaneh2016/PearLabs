import java.util.Scanner;

public class Recursions {



	public static void copy(Scanner input){

		if(input.hasNext()){

			String line=input.next();
			copy(input);
			System.out.println(line);

		}
	}
	public  int  add(Scanner input){



		if(input.hasNextInt()){

			int num=input.nextInt();

			return num+ add(input);

		}
		return 0;	
	}
	
	public int count(Scanner input){
		
		if( input.hasNext()) {
			
			input.next();
			
			return 1 + count(input);
			
		}
		
		return 0;
	}
	
}
