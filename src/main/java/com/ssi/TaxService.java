package com.ssi;

import org.springframework.stereotype.Component;

@Component
public class TaxService {
	
	public void computeTax(TaxModel model){
		int i=model.getIncome();
		int a=model.getAge();
		int t=0;
		int r=0;
		
		if(i>=500000){
			t=i*20/100;
		}else{
			t=i*10/100;
		}
		
		if(a>=60){
			r=t*10/100;
		}
		
		int net=t-r;
		model.setTax(t);
		model.setRebate(r);
		model.setNettax(net);
		
	}
}
