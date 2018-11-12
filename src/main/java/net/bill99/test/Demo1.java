package net.bill99.test;

import net.bill99.action.Boss;




import net.bill99.action.Office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations={"classpath:qacontext/applicationContext.xml"})

public class Demo1 extends AbstractTestNGSpringContextTests{
	@Autowired
	private Boss boss;
	
	@Test
	public void test1(){
		boss.info();
		
	}
	
	
}
