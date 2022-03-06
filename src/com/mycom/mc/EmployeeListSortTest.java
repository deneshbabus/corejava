package com.mycom.mc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeListSortTest {
	public static void main(String arg[]) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Denesh");
		empList.add(e1);
		
		Employee e2 = new Employee(2, "Menesh");
		empList.add(e2);
		Employee e3 = new Employee(3, "Genesh");
		empList.add(e3);
		System.out.println(" List "+empList);
		Collections.sort(empList, new EmployeeNameComparator());
		System.out.println(" List "+empList);
		
		Collections.sort(empList);
		System.out.println(" List "+empList);
	}

}

class Employee implements Comparable<Employee>{
	private int empno;
	private String empName;

	Employee(int em, String empName) {
		this.empno = em;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}	
	public int compareTo(Employee e){
		if(empno ==  e.getEmpno()){
			return 0;	
		} else if(empno < e.getEmpno()){
			return -1;
		} else {
			return 1;
		}
		
	}
	
}
class EmployeeNameComparator implements Comparator<Employee> {
	EmployeeNameComparator(){
		super();
	}
	public int compare(Employee e1, Employee e2){
		return Integer.valueOf(e1.getEmpno()).compareTo(Integer.valueOf(e2.getEmpno()));
	}
}
