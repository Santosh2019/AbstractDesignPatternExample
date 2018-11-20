package com.scp.besicsproject.DesignPatternExample;

public class TestLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractFactoryMethod abstractFactoryMethod=FactoryProducer.getFactory("COLOR");
		
		Color color1=abstractFactoryMethod.getFill("GREEn");
		color1.fill();
		
		AbstractFactoryMethod abstractFactoryMethod1=FactoryProducer.getFactory("SHAPE");
		
		Shape shape1=abstractFactoryMethod1.getDraw("retangle");

		shape1.draw();
	}

}
