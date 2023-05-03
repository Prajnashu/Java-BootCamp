package week5.designPatterns.creational.prototype;

import java.util.List;

public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object and modify it as needed.
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Tom");
		
		System.out.println("Employee list: "+emps.getEmpList());
		System.out.println("Newly created employee list 1: "+list);
		System.out.println("Newly created employee list 2: "+list1);
	}
}
