package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class Arithmetic 
{
	public int sum(int x,int y)
	{
		return x+y;
		
	}
	
	public int sub(int x,int y)
	{
		return x-y;
	}
	
	public int mul(int x,int y)
	{
		return x*y;
	}

}
