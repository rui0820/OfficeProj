package com.imooc.test;

import com.imooc.model.*;

public class OfficeTest {

	public static void main(String[] args) {
		//创建部门
		Department dep1 = new Department("D001","人事部");
		Department dep2 = new Department("D002","市场部");
		//创建职务
		Position pos1 = new Position("P001","经理");
		Position pos2 = new Position("P002","助理");
		Position pos3 = new Position("P003","职员");
		//添加员工		
		Employee emp1 = new Employee("张铭","S001",29,"男");
		dep1.addEmployee(emp1);
		pos1.addEmployee(emp1);
		System.out.println(emp1.introduction());
		System.out.println("=============================");
		Employee emp2 = new Employee("李爱艾","S002",21,"女");
		dep1.addEmployee(emp2);
		pos2.addEmployee(emp2);
		System.out.println(emp2.introduction());
		System.out.println("=============================");
		Employee emp3 = new Employee("孙超","S003",29,"男");
		dep1.addEmployee(emp3);
		pos3.addEmployee(emp3);
		System.out.println(emp3.introduction());
		System.out.println("=============================");
		Employee emp4 = new Employee("张美美","S004",26,"女");
		dep2.addEmployee(emp4);
		pos3.addEmployee(emp4);
		System.out.println(emp4.introduction());
		System.out.println("=============================");
		Employee emp5 = new Employee("蓝迪","S005",37,"男");
		dep2.addEmployee(emp5);
		pos1.addEmployee(emp5);
		System.out.println(emp5.introduction());
		System.out.println("=============================");
		Employee emp6 = new Employee("米莉","S006",24,"女");
		dep2.addEmployee(emp6);
		pos3.addEmployee(emp6);
		System.out.println(emp6.introduction());
		System.out.println("=============================");
		//显示部门信息
		System.out.println(dep1.info());
		System.out.println(dep2.info());
	}
}
