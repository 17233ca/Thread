
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choud
 */
public class ThreadJoin extends Thread{
    
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        
        t1.start();
        try {
            t1.join(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        t2.start();
        t3.start();
    }
}
