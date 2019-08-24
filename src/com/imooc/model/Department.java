package com.imooc.model;

public class Department {
/**
 * 部门类：
 * 类型描述：能够描述部门编号、部门名称、获取所有该部门员工信息
 * 要求：设定方法统计该部门员工个数
 * 
 */

	private String departmentNo; //部门编号
	private String departmentName; //部门名称
	private Employee[] myEmployee; //员工信息
	private int employeeNum; //员工个数
	
	//无参构造方法
	public Department() {
		
	}
	//带参构造方法，实现对部门信息的赋值
	public Department(String DepartmentNo,String DepartmentName) {
		this.setDepartmentNo(DepartmentNo);
		this.setDepartmentName(DepartmentName);
	}
	//带参构造方法，实现对全部信息的赋值
	public Department(String DepartmentNo,String DepartmentName,Employee[] myEmployee) {
		this.setDepartmentNo(DepartmentNo);
		this.setDepartmentName(DepartmentName);
		this.setMyEmployee(myEmployee);
	}
	
	/**
	 * 部门信息
	 * @return 部门的相关信息，包括名称，员工数
	 */
	public String info() {
		String strInfo = this.getDepartmentName() + "共有" + this.getEmployeeNum() + "名员工";
		return strInfo;
	}
	
	//添加员工信息
	public void addEmployee(Employee employee) {
		//1、将员工保存到数组中
		for(int i = 0;i < this.getMyEmployee().length;i++){
			if(this.getMyEmployee()[i] == null) {
				employee.setEmployeeDep(this);
				this.getMyEmployee()[i] = employee;
				//2、将员工个数保存到semployeeNum
				this.employeeNum = i + 1;
				return;
			}
		}
	}

	//getter / setter
	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String DepartmentNo) {
		this.departmentNo = DepartmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String DepartmentName) {
		this.departmentName = DepartmentName;
	}

	/**
	 * 获取该部门的员工信息，如果保存员工信息的数组未被初始化，则先初始化长度200
	 * @return
	 */
	public Employee[] getMyEmployee() {
		if(this.myEmployee == null) {
			this.myEmployee = new Employee[200];
		}
		return myEmployee;
	}

	public void setMyEmployee(Employee[] myEmployee) {
		this.myEmployee = myEmployee;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	
	
}
