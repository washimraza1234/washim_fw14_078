package com.evaluation4.q2;

public class DeadLock {  
    public static void main(String[] args) {  
      final String res1 = "Washim Raza";  
      final String res2 = "Milan Das";  
      
      Thread thread1 = new Thread() {  
        public void run() {  
            synchronized (res1) {  
             System.out.println("Thread 1: lock resource 1");  
    
             try {
            	 Thread.sleep(100);
            	 }
             catch (Exception e) {}  
    
             synchronized (res2) {  
              System.out.println("Thread 1: lock resource 2");  
             }  
           }  
        }  
      };  
    
    
      Thread thread2 = new Thread() {  
        public void run() {  
          synchronized (res2) {  
            System.out.println("Thread 2: lock resource 2");  
    
            try { 
            	Thread.sleep(100);
            }
            catch (Exception e) {}  
    
            synchronized (res1) {  
              System.out.println("Thread 2: lock resource 1");  
            }  
          }  
        }  
      };  
    
        
      thread2.start();  
      thread1.start();  
    }  
  }       