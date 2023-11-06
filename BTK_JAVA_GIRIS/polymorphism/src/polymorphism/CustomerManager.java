package polymorphism;

public class CustomerManager {
	
	private BaseLogger Logger;
	
	public CustomerManager(BaseLogger logger) {
		this.Logger = logger;
	}
	public void Add() {
		System.out.println("Müşteri eklendi.");
		this.Logger.Log("Log mesajı");
		
	}
}
