package session5;
class Bank {
	float getRateOfInterest(){return 0;}  
	}  
	  
	class SBI extends Bank{  
	float getRateOfInterest(){return 0.8f;}  
	}  
	  
	class ICICI extends Bank{  
	float getRateOfInterest(){return 0.7f;}  
	}  
	class AXIS extends Bank{  
	float getRateOfInterest(){return 1.9f;}  
	}  
	  
	

public class BankInterstRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new SBI();  
		Bank b2=new ICICI();  
		Bank b3=new AXIS();  
		System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());
	}

}
