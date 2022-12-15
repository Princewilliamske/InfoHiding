
package infohiding;


public class Car implements Vehicle,Lorry{
	
	@Override
	public void move(){
		System.out.println("The car moves");
	 
	}
	@Override
	public void gear(){
		System.out.println("The car must have a gear");
	}	public void capacity(){
		System.out.println("Capacity"+45);
	}	public void capacity1(){
		System.out.println(40+"tonnes");
	}
	@Override
	public void NumPlate(){
		
			System.out.println("Numer plate is "+7864+"BDG");
		
			System.out.print("there is only one lorry");
	}
		
	@Override
	public void Driver(){
			System.out.println("Drivers Name is JAMES");
	}

	@Override
	public void capcity1() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}