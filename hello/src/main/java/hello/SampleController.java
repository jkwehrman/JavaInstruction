package hello;

import org.springframework.stereotype.Controller;

@Controller
public class SampleController {
	@RequestMapping("/hello") //does not resolve because dont have web dependency
	@ResponseBody
	String hello(){
		return "Hello Java Bootcamp!!!!!!!!!!";
		}
}
