package com.example.demo.bean;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="教師对象",description="教師實體類")
@Data
public class Teacher {
	
	@ApiModelProperty(value="用户名",name="username",example="教師1")
	private String userName;
	
	private List<Student> students;

}
