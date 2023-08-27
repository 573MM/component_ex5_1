/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.footballevent;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class FootballEvent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSoure score = new ScoreSoure();
        Subscriber montree = new Subscriber();
        Subscriber pibur = new Subscriber();
        score.addSubscriner(pibur);
        score.addSubscriner(montree);
        
        while(true){
            System.out.print("Enter Score --> ");
            String input = sc.nextLine();
                    
            if(input.equals("")){
                break;
            }else{
                score.setScore(input);
            }   
        }
    }
}
