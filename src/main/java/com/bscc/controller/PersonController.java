package com.bscc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bscc.beans.Dept;
import com.bscc.beans.GoodsCategoryVo;
import com.bscc.beans.Person;
import com.bscc.mapper.DeptMapper;
import com.bscc.mapper.GoodsMapper;
import com.bscc.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService service;
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	
	@RequestMapping("/getGoodsList")
	@ResponseBody
	public List<GoodsCategoryVo> getGoodsList(){
		// pid指定为0
		List<GoodsCategoryVo> list = goodsMapper.getCategory(0);
		return list;
	}
	
	@RequestMapping("/getDeptById")
	@ResponseBody
	public Dept getDeptById() {
		Dept deptById = deptMapper.getDeptById(1);
		return deptById;
	}
	
	@RequestMapping("/haha")
	@ResponseBody
	public Person f1(){
		System.out.println("进来了1");
		Person person = new Person("陈海洋", 20);
		return person;
	}
	
	@RequestMapping("addPerson")
	public String addPerson(Person person){
		System.out.println("进来了2");
		service.addPerson(person);
		return "index.jsp";
	}
	
	@RequestMapping("listPerson")
	public String listPerson(){
		List<Person> list = service.listPerson();
		System.out.println(list);
		return "index.jsp";
	}
	
	@RequestMapping("listPersonForJson")
	@ResponseBody
	@CrossOrigin
	public List<Person> listPersonForJson(){
		List<Person> list = service.listPerson();
		System.out.println("listPersonForJson:"+list);
		return list;
	}
}
