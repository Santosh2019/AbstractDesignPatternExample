package com.scp.besicsproject.DesignPatternExample;

public class ColorFactory extends AbstractFactoryMethod{

	@Override
	Shape getDraw(String Shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getFill(String color) {
		// TODO Auto-generated method stub
		
		if(color==null){
	return null;		
		}
		if(color.equalsIgnoreCase("Green")){
			return new Green();
		}else
			if(color.equalsIgnoreCase("Red")){
				return new Red();
			}else
				if(color.equalsIgnoreCase("Yellow")){
					return new Yellow();
				}
		return null;
	}

	
	
}
