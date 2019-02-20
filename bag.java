
package gamenovice;

import java.util.ArrayList;
import java.util.Scanner;

public class bag {
    private  ArrayList<item> noobbag;;
    
    public bag(){
        this.noobbag = new ArrayList<>();
	
    }

	public void collect(){
            Scanner Scan = new Scanner(System.in);
            System.out.println("press 1: Medkit");
            System.out.println("press 2: Energy Drink");
            System.out.println("press 3: Painkiller");
            System.out.println("I choose : ");
            int num = Scan.nextInt();
            item AItem = new item(num);    
            noobbag.add(AItem);
	}

	
	public void list(){
            System.out.println("********************************");
		for(item heal : noobbag){ 
                    System.out.println(heal.getName());
		}
            System.out.println("********************************"); 
	}
    
}