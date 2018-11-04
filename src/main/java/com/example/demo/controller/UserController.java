package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "UserController", description = "用户接口")
@RestController
@RequestMapping("user")
public class UserController {
	
	@ApiOperation(value="用户註冊", notes="用户註冊接口")
//	@ApiImplicitParam(name = "user", value = "用户註冊实体user", required = true, dataType = "Teacher")
	@PostMapping("register")
	public Result register(@RequestBody Teacher teacher){
		System.out.println(teacher.toString());
		Result result = new Result();
		result.setCode(200);
		result.setMessage("OK");
		return result;
	}
	
	@GetMapping("get")
	public Result get(String userId){
		Teacher teacher = new Teacher();
		Student student = new Student();
		student.setStudentName("学生1");
		student.setStudentNumber(1);
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		teacher.setUserName("教师1");
		teacher.setStudents(students);
		Result result = new Result();
		result.setCode(200);
		result.setMessage("OK");
		result.setData(teacher);
		return result;
	}

}
