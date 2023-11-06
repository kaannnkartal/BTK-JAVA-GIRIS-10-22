package arraylistWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer>customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1,"Kaan","Kartal"));
		customers.add(new Customer(2,"Engin","Demirog"));
		customers.add(new Customer(3,"Ülkü","Çalış"));
		
		for(Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		
	}

}
