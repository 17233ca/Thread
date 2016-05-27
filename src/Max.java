/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choud
 */
public class Max extends Thread{
    @Override
    public void run(){
        System.out.println("the thread is running");
    }
    
    public static void main(String[] args) {
        Max t1 = new Max();
        t1.start();
    }
}
