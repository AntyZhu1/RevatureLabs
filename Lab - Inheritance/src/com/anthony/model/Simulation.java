package com.anthony.model;

public class Simulation {
	
	public static void main(String[] args){
		
        FlyingVehicle fv = new FlyingVehicle();
        
        fv.setName("A New Flying Vehicle");
        System.out.println(fv.getName());
        
        Airplane boeing = new Airplane((short)4, (short)5);
        boeing.move(15);
    }

}
