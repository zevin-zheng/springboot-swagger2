package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="學生对象",description="學生實體類")
public class Student {

	@ApiModelProperty(value="學生姓名",name="studentName",example="學生1")
	private String studentName;
	
	@ApiModelProperty(value="學生學號",name="studentNumber",example="1")
	private int studentNumber;
	
}
