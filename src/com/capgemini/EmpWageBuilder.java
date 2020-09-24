package com.capgemini;

class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("hello World !!!");
	}
}

//UC1
class EmpAttendence {
	//Constants
		public static final int IS_FULL_TIME = 1;
		public static final int NO_OF_EMPLOYEES = 10;
		public static void main(String[] args) {
			for(int i=0;i<NO_OF_EMPLOYEES;i++) {
				double empCheck = Math.floor(Math.random() * 10) % 2;
				if(empCheck == IS_FULL_TIME) {
					System.out.println("Employee is present");
				}
				else {
					System.out.println("Employee is absent");
				}
			}
		}
}
