package com.multithreading;

class Test extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Test t1=new Test();  
t1.start();  
 }  
}  