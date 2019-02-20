/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenovice;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class GameNovice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
                Scanner Scan = new Scanner(System.in);
                boolean status = true;
		Novice ice = new Novice(100);
                bag myBag = new bag();
                while(status){
                    System.out.println("Add things , Open bag or Quit: ");
                    
                String Choose = Scan.next();
                if(Choose.equals("add")){
                    myBag.collect();
                }
                if(Choose.equals("open")){
                    myBag.list();
                }
                if(Choose.equals("quit")){
                    status = false;
                }
                }
                
	}
    
}
