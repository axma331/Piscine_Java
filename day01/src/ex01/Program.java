package com.company;

public class Program {
		public static void main(String[] args) {
			User Mike = new User("Mike", 2000);
			User Sam = new User("Sam", 1000);
			User Nik = new User("Nik", -1000);
			System.out.println(Mike);
			System.out.println(Sam);
			System.out.println(Nik);
		}
}

