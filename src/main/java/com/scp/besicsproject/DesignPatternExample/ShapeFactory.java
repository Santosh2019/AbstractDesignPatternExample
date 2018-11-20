package com.scp.besicsproject.DesignPatternExample;

public class ShapeFactory extends AbstractFactoryMethod{

	@Override
	Shape getDraw(String shape) {
		if(shape==null){
			return null;		
		}
	
		// TODO Auto-generated method stub
		if(shape.equalsIgnoreCase("circle")){
		return new Circle();
		}else
			if(shape.equalsIgnoreCase("retangle")){
				return new Retangle();
			}
		return null;
		
	}
	@Override
	Color getFill(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
