package com.spring.Spring_Core01.reference;

public class Student {
	
	private Scores subje;

	public Scores getSubje() {
		return subje;
	}

	public void setSubje(Scores subje) {
		this.subje = subje;
	}

	@Override
	public String toString() {
		return "Student [subje=" + subje + "]";
	}
	
	

}
