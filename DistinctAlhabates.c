#include<stdio.h>
#include<string.h>

char ip[40];
int it[30];

	char getKey(int a){
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
	
	char getKeys(int a, int b){
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
		return 'A';
	}
		
	void addChar(char c){
		int i,j;
		int index = 0;
		for(j = 0; ip[j] != '\0'; ++j);
		for(i=0;i<j;i++){
		    if(ip[i]!=c){
		    	index++;
		    }
		}
		if(index==j){
			ip[j] = c;
		}
	}
	
	int get(){
		int i,j;
		for(j = 0; it[j] != '\0'; ++j);
		for(i=0;i<j;i++){
			if(i==0){
				addChar(getKey(it[i]));
			}else{
				addChar(getKey(it[i]));
				addChar(getKeys(it[i], it[i-1]));
			}
		}
		for(j = 0; ip[j] != '\0'; ++j);
		return j;
	}
	
int main(){
	int i;
	scanf("%s", ip);
	for(i = 0; ip[i] != '\0'; i++){
		it[i] = ip[i] - '0';
	}
	for(i=0;i<40;i++)
		ip[i] = '\0';
	printf("%d", get());
	return 0;
}
