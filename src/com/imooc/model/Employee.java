package com.imooc.model;

public class Employee {
	/**
	 * 员工类： 类型描述：能够描述员工姓名、工号、年龄、性别、所属部门、职务信息 要求： 1、设定方法限定年龄只能是18--65之间，反之则设置默认为18岁
	 * 2、设定方法限定性别只能是“男”或者“女”，反之则设置默认为“男” 3、设定方法，实现员工自我介绍信息，将员工信息作为字符串返回
	 */
	private String employeeName; // 员工姓名
	private String employeeNo; // 工号
	private int employeeAge; // 年龄
	private String employeeSex; // 性别
	private Department employeeDep; // 所属部门
	private Position employeePos; // 职务信息

	// 无参构造方法
	public Employee() {

	}

	// 带参构造方法，实现对员工个人信息的赋值
	public Employee(String employeeName, String employeeNo, int employeeAge, String employeeSex) {
		this.setEmployeeName(employeeName);
		this.setEmployeeNo(employeeNo);
		this.setEmployeeAge(employeeAge);
		this.setEmployeeSex(employeeSex);
	}

	// 带参构造方法，实现对全部信息的赋值
	public Employee(String employeeName, String employeeNo, int employeeAge, String employeeSex, Department employeeDep,
			Position employeePos) {
		this.setEmployeeName(employeeName);
		this.setEmployeeNo(employeeNo);
		this.setEmployeeAge(employeeAge);
		this.setEmployeeSex(employeeSex);
		this.setEmployeeDep(employeeDep);
		this.setEmployeePos(employeePos);
	}

	/**
	 * 员工自我介绍的方法
	 * 
	 * @param mySubject 所选专业的对象
	 * @return 自我介绍的信息，包括姓名、工号、性别、年龄
	 */
	public String introduction() {
		String str = "姓名：" + this.getEmployeeName() + "\n工号：" + this.getEmployeeNo() + "\n性别：" + this.getEmployeeSex()
		+ "\n年龄：" + this.getEmployeeAge() + "\n职务：";
		
		if(this.getEmployeeDep() != null ) {
			str = str + this.getEmployeeDep().getDepartmentName();
		}else {
			str = str + "暂无所属部门 ";
		}
		if(this.getEmployeePos() != null) {
			str = str + this.getEmployeePos().getPositionName();
		}else {
			str = str + " 暂无职务";
		}
		return str;
	}

	// getter / setter
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	/**
	 * 给年龄赋值，限定必须在10--100之间，反之赋值为18
	 * 
	 * @param employeeAge 员工年龄
	 */
	public void setEmployeeAge(int employeeAge) {
		if (employeeAge >= 10 && employeeAge <= 100) {
			this.employeeAge = employeeAge;
		} else {
			System.out.println("输入的员工年龄超出10-100的范围，自动设置为默认值（18）");
			this.employeeAge = 18;
		}
	}

	public String getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		// 限制性别只能是"男"或者"女"，否则强制赋值为"男"
		if (employeeSex == "男" || employeeSex == "女") {
			this.employeeSex = employeeSex;
		} else {
			this.employeeSex = "男";
		}
	}

	public Department getEmployeeDep() {
		return employeeDep;
	}

	public void setEmployeeDep(Department employeeDep) {
		this.employeeDep = employeeDep;
	}

	public Position getEmployeePos() {
		return employeePos;
	}

	public void setEmployeePos(Position employeePos) {
		this.employeePos = employeePos;
	}

}
