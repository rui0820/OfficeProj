package com.imooc.model;

public class Position {
/**
* 职务类：
* 类型描述：能够描述职务编号、职务名称
*/
	private String positionNo;
	private String positionName;
	
	public Position() {
		
	}
	public Position(String positionNo,String positionName) {
		this.setPositionNo(positionNo);
		this.setPositionName(positionName);
	}
	//添加员工信息
	public void addEmployee(Employee employee) {
		employee.setEmployeePos(this);
	}
	
	public String info() {
		String str = "职务编号：" + this.getPositionNo() + "\n职务名称：" + this.getPositionName();
		return str;
	}

	public String getPositionNo() {
		return positionNo;
	}

	public void setPositionNo(String positionNo) {
		this.positionNo = positionNo;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
}
