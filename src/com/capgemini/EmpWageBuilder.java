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

//UC2
class EmpDailyWage {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage =0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			double empcheck = Math.floor(Math.random() * 10) % 2;
			if(empcheck == IS_FULL_TIME) {
				empHrs = 8;
			}
			else {
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee wage : " + empWage);
		}
	}
}

//UC3
class EmpDailyWagePartTime {
	//Constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NO_OF_EMPLOYEES = 10;
		
		public static void main(String[] args) {
			//Variables
			int empHrs = 0;
			int empWage =0;
			//Computation
			for(int i=0;i<NO_OF_EMPLOYEES;i++) {
				double empcheck = Math.floor(Math.random() * 10) % 2;
				if(empcheck == IS_FULL_TIME) {
					empHrs = 8;
				}
				else if(empcheck == IS_PART_TIME) {
					empHrs = 4;
				}
				else {
					empHrs = 0;
				}
				empWage = empHrs * EMP_RATE_PER_HOUR;
				System.out.println("Employee wage : " + empWage);
			}
		}
}

//UC4
class EmpDailyWageSwitchCase {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empcheck){
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs=0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee wage : " + empWage);
		}
	}
}

//UC5
class EmpMonthlyWage {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NO_OF_WORKING_DAYS =20;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			for(int j=0;j<NO_OF_WORKING_DAYS;j++) {
				int empcheck = (int)Math.floor(Math.random() * 10) % 3;
				switch(empcheck) {
					case IS_PART_TIME:
						empHrs = 4;
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
				}
				empWage = empHrs * EMP_RATE_PER_HOUR;
				totalEmpWage += empWage;
			}
			System.out.println("Employee wage : " + totalEmpWage);
		}
	}
}

//UC6
class EmpWageTillCondition {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NO_OF_WORKING_DAYS =20;
	public static final int MAX_WORKING_HRS = 100;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		int empWage = 0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			while(totalHrs <= MAX_WORKING_HRS && totalDays <= NO_OF_WORKING_DAYS) {
				totalDays++;
				int empcheck = (int)Math.floor(Math.random() * 10) % 3;
				switch(empcheck) {
					case IS_PART_TIME:
						empHrs = 4;
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
				}
				totalHrs += empHrs;
				System.out.println("Day : " + totalDays + "Employee hours : " + empHrs);
			}
			empWage = totalHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee wage : " + empWage);
		}
	}
}