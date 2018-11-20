package com.scp.besicsproject.DesignPatternExample;

public class FactoryProducer {
	
	public static AbstractFactoryMethod getFactory(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		
		
		return null;
		
	}

}
