package com.array;

public class Demo {

	public static void main(String[] args) {
		String mail="audumbar@gmail.com";
		String name="";
		char sym=' ';
		char arr[]=mail.toCharArray();
		for(int i=0;i<=arr.length;i++) 
		{
			if(arr[i]=='@') {
				sym=arr[i];
				break;
			
			}
			name=name+arr[i];
		}
		 System.out.println(name +" is a name!");
	     System.out.println(sym +" is a special symbol!");

	}

}
