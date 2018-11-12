package net.bill99.action;

import org.springframework.stereotype.Service;

import net.bill99.impl.EmailGenerator;

@Service
public class RandomEmailGenerator implements EmailGenerator {
	
	@Override
	public String generate() {
		
		return "feedback@yiibai.com:";
	}

	
}
