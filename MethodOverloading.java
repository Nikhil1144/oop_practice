package Oop_practice;
class Mobile 
{
	String brandModel;
    double price;
    boolean dolbyAtmos;
    boolean screenRecorder;
    boolean extendedMemory;

    Mobile(String brandModel,double price)
    {
    	this(brandModel,price,false,false,false);
    }

    Mobile(String brandModel,double price,boolean dolbyAtmos,
    	boolean screenRecorder)
    {
    	this(brandModel,price,dolbyAtmos,screenRecorder,false);
    }

    Mobile(String brandModel,double price,boolean dolbyAtmos,
    	boolean screenRecorder,boolean extendedMemory)
    {
    	this.brandModel =brandModel;
    	this.price = price;
    	this.dolbyAtmos = dolbyAtmos;
    	this.screenRecorder = screenRecorder;
    	this.extendedMemory = extendedMemory;
     

      
    }


    public void displayMobile()
    {
    	System.out.println("\nMobile Info \n");
    	System.out.println("Mobile Brand :"+brandModel);
    	System.out.println("Price :"+price);
    	System.out.println("dolbyAtmos : "+(dolbyAtmos?"YES":"NA"));
    	System.out.println("screenRecorder : "+(screenRecorder?"YES":"NA"));
    	System.out.println("extendedMemory : "+(extendedMemory?"YES":"NA"));
    }
}

class MethodOverloading 
{
	public static void main(String[] args) {
		Mobile obj1 = new Mobile("Samsung",65000,true,true,true);
		obj1.displayMobile();

		Mobile obj2 = new Mobile("iphone",15000,true,true);
		obj2.displayMobile();

		Mobile obj3 = new Mobile("Oppo",20000);
		obj3.displayMobile();

	
	}
}

