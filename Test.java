package com.example.demo.rest;

import java.util.ArrayList;

public class Test {
	public static void main(String args[])   
	{  Test t1= new Test();
	t1.average();
	}
void average() {
//thiru
int sum = 0, avg;      
ArrayList<Integer> list = new ArrayList<Integer>();    

list.add(12);  
list.add(34);  
list.add(10);  
list.add(48);  
list.add(65);  

for(int i = 0; i < list.size(); i++)  

sum = sum + list.get(i);  
avg = sum / list.size();   

System.out.println("The average of the List: " + avg);  
}  

}
