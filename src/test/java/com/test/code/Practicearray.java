package com.test.code;

import java.util.Arrays;

public class Practicearray {
	int [] b= {5,5,4,8,8,9};
	



 
public void getDuplicate(){

for (int i=0;i<b.length;i++) {
	
	
	for (int j=(i+ 1);j<b.length;j++) {
		
		if (b[i]==b[j]) {
		System.out.println("======"+b[i]);	

		}
	
}

}

}			
public static void main(String[] args) {
	new Practicearray ().getDuplicate();
}		
}



