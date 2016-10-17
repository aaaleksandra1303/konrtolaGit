package pl.akademiakodu.interfaces;

import java.util.List;

public class Person {
	private Savable connector;
	private List<String> list;
	
	public void save(){
		connector.save();
	}
	public Savable getConnector() {
		return connector;
	}
	public void setConnector(Savable connector) {
		this.connector = connector;
	}
	
	public void setList(List<String> list){
		this.list = list;
	}
	
	

}
