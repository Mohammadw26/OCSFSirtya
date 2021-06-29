package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Message;

public class BranchesReportsReceivedEvent {
	private Object BranchesList;

	public BranchesReportsReceivedEvent(Message msg) {
		this.BranchesList = msg.getObject();
	}
	
	public Object getBranchesList() {
		return BranchesList;
	}
}
