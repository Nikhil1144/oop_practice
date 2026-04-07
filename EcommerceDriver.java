package Oop_practice;

import java.util.Scanner;
import java.util.ArrayList;

class Razorpay{
	public void payment(Razorpay obj,ArrayList<String>cart,double totalBill) 
	{
		if(obj instanceof UpiPayment)
		{
			UpiPayment upi = (UpiPayment)obj;
			System.out.println(cart);
			System.out.println("totalBill : "+totalBill);
			upi.displayUpiPayment();
		}
		else if(obj instanceof CreditCard)
		{
			CreditCard cc = (CreditCard)obj;
			System.out.println(cart);
			System.out.println("totalBill : "+totalBill);
			cc.displayCreditCard();

		}

	}
}

class UpiPayment extends Razorpay 
{
	String name = "Nikhil D";
	String appname = "PhonePay";
	String upiId = "9075062744@boi";
	long contact = 9075062744l;

	public void displayUpiPayment(){

		System.out.println("\n UPI Payment Info \n");
		System.out.println("name : "+name);
		System.out.println("Appname : "+appname);
		System.out.println("UpiId : "+upiId);
		System.out.println("contact : "+contact);
	}

}

class CreditCard extends Razorpay
{
	String name = "Nikhil D ";
	String bank = "BOI";
	long cardNumber = 7864_9483_2894_2984l;
	int cvv = 123;

	public void displayCreditCard(){

		System.out.println("\n CreditCard Info ");
		System.out.println("Name : "+name);
		System.out.println("bank : "+bank);
		System.out.println("Card Number : "+cardNumber);
		System.out.println("cvv : "+cvv);
	}
}

class Ecommerce{
	ArrayList<String>cart = new ArrayList<String>();
	double totalBill = 2750;
	{
		cart.add("Notebook : 120/-");
		cart.add("Bag  : 1120/-");
		cart.add("Sandal : 1500/-");
	}

	public void payment(ArrayList<String> cart)

  {
		System.out.println("\n ****** Payment Module ******");
		System.out.println("1. COD");
		System.out.println("2. UPI");
		System.out.println("3. CreditCard");

		System.out.print("Enter your Responses : \n");
		int resp = new Scanner(System.in).nextInt();
		switch(resp)
	{
		case 1 :{
			System.out.println("Keep your Cash ready");
			break;
		}
	    case 2 : {
	    	UpiPayment obj = new UpiPayment();
	    	obj.payment(obj,cart,totalBill);
	    	break;
	    }
	   case 3 :{
	   	    CreditCard cc = new CreditCard();
	   	    cc.payment (cc,cart,totalBill);
	   	    break;
		}
	  default :{
		System.out.println("\n Invalid Response \n ");
	}
	}
}
     public void launchApplication()
     {
     	System.out.println("**** Welcome ****");
     	System.out.println(" List of Product in Cart : ");
     	for(String ele : cart)
     	{
     		System.out.println(ele);
     	}
     	payment(cart);
     }

	} 
	


class EcommerceDriver{
	
		public static void main(String[] args) {
			Ecommerce obj = new Ecommerce();
			obj.launchApplication();
		}
		
	
}