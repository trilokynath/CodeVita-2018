import java.util.*;

public class DistinctAlhabates {
	ArrayList<Integer> inputint = new ArrayList<>();
	ArrayList<Character> characters = new ArrayList<>();
	
	public DistinctAlhabates put(String str){
		for (int i = 0; i < str.length(); i++){
			inputint.add(str.charAt(i) - '0');
		}
		return this;
	}

	void addChar(char c){
		int index = 0;
		for(int i=0; i<characters.size();i++){
		    if(characters.get(i)!=c)
		    	index++;
		}
		if(index==characters.size()){
			characters.add(c);
		}
	}
	
	public char getKey(int a){
		switch(a){
		case 2:
			return 'A';
		case 3:
			return 'D';
		case 4:
			return 'G';
		case 5:
			return 'J';
		case 6:
			return 'M';
		case 7:
			return 'P';
		case 8:
			return 'T';
		case 9:
			return 'W';
		}
		return '\0';
	}
	
	public char getKey(int a, int b){
		switch(a){
		case 2:
			switch(b%3){
			case 1:
				return 'A';
			case 2:
				return 'B';
			case 0:
				return 'C';
			}
		case 3:
			switch(b%3){
			case 1:
				return 'D';
			case 2:
				return 'E';
			case 0:
				return 'F';
			}
		case 4:
			switch(b%3){
			case 1:
				return 'G';
			case 2:
				return 'H';
			case 0:
				return 'I';
			}
		case 5:
			switch(b%3){
			case 1:
				return 'J';
			case 2:
				return 'K';
			case 0:
				return 'L';
			}
		case 6:
			switch(b%3){
			case 1:
				return 'M';
			case 2:
				return 'N';
			case 0:
				return 'O';
			}
		case 7:
			switch(b%4){
			case 1:
				return 'P';
			case 2:
				return 'Q';
			case 3:
				return 'R';
			case 0:
				return 'S';
			}
		case 8:
			switch(b%3){
			case 1:
				return 'T';
			case 2:
				return 'U';
			case 0:
				return 'V';
			}
		case 9:
			switch(b%4){
			case 1:
				return 'W';
			case 2:
				return 'X';
			case 3:
				return 'Y';
			case 0:
				return 'Z';
			}
		}
		return '\0';
	}
	
	public int get(){		
		for(int i=0;i<inputint.size();i++){
			if(i==0){
				addChar(getKey(inputint.get(i)));
			}else{
				addChar(getKey(inputint.get(i)));
				addChar(getKey(inputint.get(i), inputint.get(i-1)));
			}
		}
		return this.characters.size();
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
      		String str = s.nextLine();
		DistinctAlhabates distinctAlhabates = new DistinctAlhabates();
		distinctAlhabates.put(str);
		System.out.print(distinctAlhabates.get());
	}
}
