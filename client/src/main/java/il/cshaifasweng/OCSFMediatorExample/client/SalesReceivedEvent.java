package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Message;

public class SalesReceivedEvent {

	private Object SalesList;

	public  SalesReceivedEvent(Message msg) {
		this.SalesList = msg.getObject();
	}
	
	public Object getSalesList() {
		return SalesList;
	}
	
}


