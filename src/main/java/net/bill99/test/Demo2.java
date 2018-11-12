package net.bill99.test;


import net.bill99.action.Office;
import net.bill99.action.RandomEmailGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations={"applicationContext.xml"})
public class Demo2 extends AbstractTestNGSpringContextTests{
	@Autowired
	private RandomEmailGenerator randomemailGenerator;
	@Autowired
	private Office office;
	
	@Test
	public void test1(){
		String email=randomemailGenerator.generate();
		System.out.println(email);
		office.info();
	}

}
